package programmers.lv1

class No16 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = mutableListOf<Int>()
        for (i in arr) {
            if (i % divisor == 0) {
                answer.add(i)
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1)
        }
        return answer.toIntArray().sortedArray()
    }
}



