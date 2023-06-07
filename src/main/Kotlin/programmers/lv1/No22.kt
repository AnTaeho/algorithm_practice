package programmers.lv1

class No22 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(n: Int) =
        (1..n).map { if (it % 2 == 0) "수" else "박" }.joinToString("")
}



