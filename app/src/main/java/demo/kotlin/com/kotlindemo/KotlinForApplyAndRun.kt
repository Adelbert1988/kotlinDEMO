package demo.kotlin.com.kotlindemo

import java.io.BufferedReader
import java.io.FileReader

/**
 * User: chw
 * Date: 2018/7/31
 * kotlin apply run函数用法
 */
/**
 * apply函数是指在函数块内可以通过 this 指代该对象，返回值为该对象自己。
 * 在链式调用中，可以考虑使用它来不破坏链式。
 */
object KotlinForApplyTest {

    @JvmStatic
    fun main(args: Array<String>) {

        val result ="Hello".apply {


            println(this+" World")

            this+" World"
        }

        println(result)
    }
}
//输出结果：Hello World
//        Hello
//第一个字符串是在闭包中打印的，第二个字符串是result的结果，它仍然是“Hello”。

/**
 * run函数类似于apply函数，但是run函数返回的是最后一行的值。
 */
object KotlinForRunTest1 {

    @JvmStatic
    fun main(args: Array<String>) {

        val result ="Hello".run{
            println(this+" World")

            this + " World"
        }

        println(result)
    }
}

//输出结果：
//Hello World
//Hello World
//第一个字符串是在闭包中打印的，第二个字符串是result的结果，它返回的是闭包中最后一行的值，
// 所以也打印“Hello World”。

/**
 *let函数把当前对象作为闭包的it参数，返回值是函数里面最后一行，或者指定return。
 * 它看起来有点类似于run函数。
   let函数跟run函数的区别是：let函数在函数内可以通过 it 指代该对象。
   跟?结合使用， let函数可以在对象不为 null 的时候执行函数内的代码，从而避免了空指针异常的出现
 */


data class Persion(val name: String, val age: Int)

fun main(args: Array<String>) {
    findPersion()?.let { (name, age) ->
        println("name: ${name}")
        println("age: ${age}")
    }

    //apply可以直接使用调用者的对象
    findPersion()?.apply {
        println(name)
    }

    val br = BufferedReader(FileReader("hello.txt"))
    with(br) {
        var line: String?
        while (true) {
            line = readLine()?: break
            println(line)
        }

        close()
    }

    //简写
    BufferedReader(FileReader("hello.txt")).use {
        var line: String?
        while (true) {
            line = it.readLine()?: break
            println(line)
        }
    }
}

fun findPersion(): Persion? {
    return null
}