package programmers.lv1

fun main() {
    println(No3().solution(3))
}

class No3 {
    fun solution(n: Int): Int {
        var input = n
        var answer = 0

        while (input != 0) {
            answer += input%10
            input /= 10
        }
        return answer
    }

}