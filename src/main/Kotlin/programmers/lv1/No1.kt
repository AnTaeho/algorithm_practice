package programmers.lv1

fun main() {
    println(No1().solution(24))
}

class No1 {
    fun solution(n: Int): Int {
        var answer = 0
        for (i in 1..n) {
            if (n % i == 0) {
                answer += i
            }
        }
        return answer
    }
}