package demo.kotlin.com.kotlindemo

import java.sql.DriverManager.println

/**
 * User: chw
 * Date: 2018/7/24
 * 动态代理
 */
interface Animal {
    fun bark()
    fun eat()
}

class Dog: Animal{
    override fun bark() {
        println("dog bark")
    }

    override fun eat() {

    }
}

class Zoo(val animal: Animal): Animal by animal {
    override fun bark() {
        animal.bark()
    }
}
//kotLin实际是静态代理
fun main(args: Array<String>) {
    Zoo(Dog()).bark()
}