package programmers.lv1

class No9 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(n: Long): Long =
        String("$n".toCharArray().sortedArrayDescending()).toLong()
}



