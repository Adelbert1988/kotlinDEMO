package demo.kotlin.com.kotlindemo

/**
 * User: chw
 * Date: 2018/7/24
 */

object Test {
    fun test(str: String = "default") {
        if (StringUtils.isEmpty(str)) {
            return
        }
        println("test str log " + str)
    }
}

class Single private constructor(){
    //companion object，他类似public static
    companion object {
        fun get(): Single {
            return Holder.instance;
        }

        private object Holder {
            var instance = Single()
        }
    }

    fun doSingle() {
        println("doSingle")
    }
}

class StringUtils {
    companion object {
        fun isEmpty(str: String): Boolean {
            return "" == str
        }
    }
}
