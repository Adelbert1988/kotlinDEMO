package demo.kotlin.com.kotlindemo

fun main(args: Array<String>) {
    args.forEach (::println)

    //通过类名 加双冒号就可以方法的引用了
    val hell = Hello::word

    //扩展函数实际上第一个参数传入的是自己
    args.filter(String::isNotEmpty)

    val prinlter = Prinlter()
    //以实例调用的时候传入的参数就只有any一个了
    args.forEach(prinlter::prinkln)
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