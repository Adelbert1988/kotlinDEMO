package demo.kotlin.com.kotlindemo

import java.io.OutputStream

//科里化


fun log (tag: String, target: OutputStream, any: Any?) {
    target.write("$tag $any".toByteArray())
}

fun klhLog(tag: String)
    = fun(target: OutputStream)
    = fun(any: Any?)
    = target.write("$tag $any".toByteArray())

fun main(args: Array<String>) {
    log("test 科利华", System.out, "adsfaf")
    klhLog("test")(System.out)("measdfa")
}

