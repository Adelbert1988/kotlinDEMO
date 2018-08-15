package demo.kotlin.com.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var mStr : String = "stringtest"
    val mInt : Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val v = View(this)
        if (v is TextView) {
            v.setText("adfa")
        }

        Test.test()

        val runable = Runnable {
            println("test")
        }

        val koFun: () -> Unit

        koFun = runable::run
        testGaoJieFun(true, koFun)
    }

    /**
     * 高阶函数
     */
    inline fun testGaoJieFun(isDebug: Boolean, block: () -> Unit) {
        if (isDebug) block()
    }




}
