package programmers.lv1

class No20 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(arr: IntArray): IntArray {
        val min = arr.toList().minOrNull()
        return if (arr.size == 1) intArrayOf(-1) else arr.filter { it != min }.toIntArray()
    }
}



