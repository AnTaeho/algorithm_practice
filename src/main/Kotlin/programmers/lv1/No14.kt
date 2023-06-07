package programmers.lv1

class No14 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()
        for (i in 1..n) {
            answer.add(x.toLong() * i)
        }
        return answer.toLongArray()
    }

    fun solution2(x: Int, n: Int): LongArray =
        LongArray(n) {
            x.toLong() * (it + 1)
        }
}



