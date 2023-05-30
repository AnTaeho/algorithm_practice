package programmers.lv1

fun main() {
//    println(No5().solution(null))
}

class No5 {
    fun solution(n: Int): Int {
        for (i in 1..n) {
            if (n % i == 1) {
                return i
            }
        }
        return 0
    }

}