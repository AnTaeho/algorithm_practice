package programmers.lv1

class No24 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left..right) {
            if (countSosu(i) % 2 == 0) {
                answer += i
            } else {
                answer -= i
            }
        }
        return answer
    }
    fun countSosu(number: Int): Int {
        var count = 0
        for (i in 1..number) {
            if (number % i == 0) {
                count++
            }
        }
        return count
    }
}



