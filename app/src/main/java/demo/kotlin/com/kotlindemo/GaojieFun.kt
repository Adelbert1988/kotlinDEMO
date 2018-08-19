package demo.kotlin.com.kotlindemo

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4,23,5)

    val newlist = list.map {
        it * 2 + 3
    }

    val newlist2 = list.map (Int::toDouble)

    //迭代还是要用foreach,map迭代会add，影响性能，foreach没有返回值
    newlist.forEach(::println)

    //求和
    println(newlist.reduce { acc, i -> acc + i })

    (0..7).joinToString(",")
}