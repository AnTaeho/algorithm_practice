package programmers.lv1

class No19 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(numbers: IntArray): Int {
        var answer = 45
        for (number in numbers) {
            answer -= number
        }
        return answer
    }
}



