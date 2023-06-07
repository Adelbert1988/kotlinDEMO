package demo.kotlin.com.kotlindemo

import java.sql.DriverManager.println


/**
 * User: chw
 * Date: 2018/7/24
 */

object Test {
    fun test(str: String = "default") {
        if (StringUtils.isEmpty(str)) {
            return
        }
        println("test str log $str")
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
        KotlinSingleton2.instance.kotlinSingle()
        KotlinSingletonThread2.instance.kotlinSingle()
    }
}

class StringUtils {
    companion object {
        fun isEmpty(str: String): Boolean {
            return "" == str
        }
    }
}
