package demo.kotlin.com.kotlindemo

/**
 * User: chw
 * Date: 2018/7/31
 * kotlin with用法
 */
/**
 * 在with的代码块内可以直接私用Userinfo的对象属性，或者方法，
 * 相当于在with的代码块中this是那个对象
 */
class TestWith{

    fun testWith(userInfo: UserInfo) {
        with(userInfo) {
            println("userinfo: $name id: $id")
        }

    }
}

data class UserInfo(var name: String, var id: Int)
