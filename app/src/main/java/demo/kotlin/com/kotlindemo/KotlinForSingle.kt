package demo.kotlin.com.kotlindemo

/**
 * User: chw
 * Date: 2018/7/31
 * kotlin单例写法
 */


//最简单kotlin单例
object KotlinSingleton {
    //null
    fun kotlinSingle() {
        println("this is KotlinSingleton")
    }
}

// 在Kotlin 中调用
//KotlinSingleton.xx()
// 在Java 中调用
//KotlinSingleton.INSTANCE.xx()

//懒汉式单例1
class KotlinSingleton1 private constructor() {
    private var instance : KotlinSingleton1? = null

    fun getInstance(): KotlinSingleton1? {
        if(instance == null)
            instance = KotlinSingleton1()
        return instance
    }

    fun kotlinSingle() {
        println("this is KotlinSingleton1")
    }
}

//懒汉式单例2
class KotlinSingleton2 private constructor() {
    companion object {
        val instance by lazy(LazyThreadSafetyMode.NONE) {
            KotlinSingleton2()
        }
    }

    fun kotlinSingle() {
        println("this is KotlinSingleton2")
    }
}

// 在Kotlin 中调用
//KotlinSingleton.instance.xx()
// 在Java 中调用
//KotlinSingleton.Companion.getInstance().xx()

//线程安全单例，不建议使用这种
class KotlinSingletonThread private constructor() {
    private var instance : KotlinSingletonThread? = null

    @Synchronized //用注解就okk了。
    fun getInstance(): KotlinSingletonThread? {
        if(instance == null)
            instance = KotlinSingletonThread()
        return instance
    }

    fun kotlinSingle() {
        println("this is KotlinSingletonThread")
    }
}

//双重检查
//方式一
class KotlinSingletonThread1 private constructor() {
    @Volatile  //用注解就okk了
    private var instance : KotlinSingletonThread1? = null

    fun getInstance(): KotlinSingletonThread1? {
        if(instance == null){
            synchronized(KotlinSingletonThread1::class){
                if(instance == null) {
                    instance = KotlinSingletonThread1()
                }
            }
        }
        return instance
    }

    fun kotlinSingle() {
        println("this is KotlinSingletonThread1")
    }
}
//方式二
class KotlinSingletonThread2 private constructor() {
    companion object {
        val instance by lazy (mode = LazyThreadSafetyMode.SYNCHRONIZED){
            KotlinSingletonThread2()
        }
    }

    fun kotlinSingle() {
        println("this is KotlinSingletonThread2")
    }
}

/*关于LazyThreadSafetyMode
延迟属性 Lazy 可选LazyThreadSafetyMode三种模式：

SYNCHRONIZED —— 双重检查锁式，默认使用。
PUBLICATION —— 允许多个线程同时初始化实例，但只采用最先返回的实例。
NONE —— 没有任何的线程安全的保证和开销*/



// 在Kotlin 中调用
//KotlinSingleton.instance.xx()
// 在Java 中调用
//KotlinSingleton.Companion.getInstance().xx()
//复制代码“双重检查锁”的没有明显的缺点，如果非要说一个，可能就是太复杂了。kotlin还好，java里面写着相当的复杂
// 。如果程序对性能没有考虑的话，这样写显然就太麻烦了。

//内部类，类似于java的类第一次加载的方式，推荐这种方式
class KotlinSingletonThread3 private constructor() {
    companion object {
        fun getInstance() = Holder.instance
    }

    private object Holder{
        val instance = KotlinSingletonThread3()
    }

    fun kotlinSingle() {
        println("this is KotlinSingletonThread3")
    }
}


