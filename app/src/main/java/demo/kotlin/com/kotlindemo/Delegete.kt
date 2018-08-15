package demo.kotlin.com.kotlindemo

/**
 * User: chw
 * Date: 2018/7/24
 * 动态代理
 */
interface Animal {
    fun bark()
}

class Dog: Animal{
    override fun bark() {
        println("dog bark")
    }
}

class Zoo(animal: Animal): Animal by animal {
    override fun bark() {
        println("zoo bark")
    }
}
//kotLin实际是静态代理
fun main(args: Array<String>) {
    Zoo(Dog()).bark()
}