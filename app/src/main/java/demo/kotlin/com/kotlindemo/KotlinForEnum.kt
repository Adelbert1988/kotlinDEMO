package demo.kotlin.com.kotlindemo

/**
 * User: chw
 * Date: 2018/7/24
 * 超级枚举 kotlin enum 密闭类
 * kotlin的枚举可以是对象
 */

sealed class KotlinEnum{
    object A: KotlinEnum()
    object B: KotlinEnum()
    object C: KotlinEnum()
    object D: KotlinEnum()
    class E(var id: String): KotlinEnum()
}

fun exec(kotlinEnum: KotlinEnum) = when (kotlinEnum) {
    KotlinEnum.A -> {

    }

    KotlinEnum.B -> {

    }

    KotlinEnum.C -> {

    }

    KotlinEnum.D -> {

    }

    is KotlinEnum.E -> {

    }
}