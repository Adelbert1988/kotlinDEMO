package demo.kotlin.com.kotlindemo

fun main(args: Array<String>) {

}

fun add(x: Int) = fun(y: Int) = x + y

fun add1(x: Int): (Int)-> Int{
    return fun(y: Int): Int {
        return x + y
    }
}