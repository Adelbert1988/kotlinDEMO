package demo.kotlin.com.kotlindemo

fun main(args: Array<String>) {
    args.forEach (::println)

    //通过类名 加双冒号就可以方法的引用了
    val hell = Hello::word

    //扩展函数实际上第一个参数传入的是自己
    args.filter(String::isNotEmpty)

    args.forEach {
        println(it)
    }
    val prinlter = Prinlter()
    //以实例调用的时候传入的参数就只有any一个了
    args.forEach(prinlter::prinkln)
}

fun testMap() {
    var aArray = arrayOf("asdf", "asdf", "asdf", "asd", "adf")
    var aList = arrayOf(5, 2, 1, 7, 9, 8)
    aList.filter {
        it < aArray.size
    }.map {
        aArray[it]
    }.reduce {s, s1 ->
        "$s$s1"
    }.also {

        println("str: $it")
    }
}

class Prinlter {

    fun prinkln(any: Any) {
        kotlin.io.println(any)
    }
}


class Hello {
    fun word() {
        println("hello world")
    }
}