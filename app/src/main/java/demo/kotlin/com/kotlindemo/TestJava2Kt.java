package demo.kotlin.com.kotlindemo;

/**
 * User: chw
 * Date: 2018/7/24
 */
public class TestJava2Kt {

    public void test() {
        if (StringUtils.Companion.isEmpty("re")) {
            return;
        }

        Test.INSTANCE.test("adfaf");
        //KotlinEnum2.GREEN

        KotlinSingleton.INSTANCE.kotlinSingle();
        KotlinSingleton2.Companion.getInstance().kotlinSingle();
        KotlinSingletonThread3.Companion.getInstance().kotlinSingle();
    }
}
