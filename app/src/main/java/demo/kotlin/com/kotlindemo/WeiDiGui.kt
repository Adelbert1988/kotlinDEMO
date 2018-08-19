package demo.kotlin.com.kotlindemo

//尾递归：函数调用自己后没有任何操作
data class ListNode(val value: Int, var next: ListNode?)

//tailrec可以让编译器优化,只能用在尾递归函数
tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {
    head?: return null
    if(head.value == value) return head
    return findListNode(head.next, value)
}

//不是尾递归，调用自己之前做了阶乘
fun factorial(n: Long): Long {
    return n * factorial(n-1)
}