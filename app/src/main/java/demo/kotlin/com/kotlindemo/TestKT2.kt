package demo.kotlin.com.kotlindemo

/**
 * User: chw
 * Date: 2018/7/24
 */

var mIntArray: IntArray = intArrayOf(1,2,4)
var mCharArray: CharArray = charArrayOf('s', 's')
var mStringArray: Array<String> = arrayOf("adf", "adfa")

object MyKt2{
    fun testCallKtFun() {
        Test.test("adfa")
        Single.get().doSingle()
        var myUser = User(11, "asdfaf")
        myUser.id
    }

    fun log(str: String) {
        println(str)
    }
}

fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
    //为空判断return逻辑简写
    var name: String = getName()?: return
    println(name.length)

    var test: String? = "asdfasdf"
    //确定知道字符串不为空，可以通过双感叹号告诉编译器编译通过
    println(test!!.length)
}
