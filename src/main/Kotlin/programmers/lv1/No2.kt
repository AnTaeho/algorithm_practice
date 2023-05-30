package programmers.lv1

fun main() {
    println(No2().solution(3))
}

class No2 {
    fun solution(num: Int): String {
        return if (num % 2 == 0) "Even" else "Odd"
    }

}