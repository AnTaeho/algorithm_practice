package programmers.lv1

fun main() {
//    println(No5().solution(null))
}

class No6 {
    fun solution(n: Long): IntArray {
        return n.toString().reversed().map {
            it.toString().toInt()
        }.toIntArray()
    }
}
