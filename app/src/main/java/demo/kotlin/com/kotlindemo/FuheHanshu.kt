package demo.kotlin.com.kotlindemo


//复合函数
val add5 = {i: Int -> i + 5}

val multiply = {i: Int -> i * 2}

fun main(args: Array<String>) {
    println(multiply(add5(8)))//(5+8) * 2

    val add5mULTI = add5 addThen multiply
    println(add5mULTI(8))
}


//Funtion1是传入的参数，第一个Function1的P1是它的传入参数类型，P2是返回值类型
//第二个Function1是后面的方法，两个泛型P2是传入的参数类型，R是返回类型

//P1是add5的传入参数，P2返回值传给第二个Function1
infix fun <P1, P2, R> Function1<P1, P2>.addThen(function: Function1<P2, R>):Function1<P1, R> {
    return fun(p1: P1): R{
        return function.invoke(this.invoke(p1))
    }
}
