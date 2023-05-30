package programmers.lv1

import kotlin.math.sqrt

fun main() {
//    println(No5().solution(null))
}

class No7 {
    fun solution(n: Long): Long {
        val a = sqrt(n.toDouble()).toLong()
        return if (a*a == n) (a+1)*(a+1) else -1
    }
}

