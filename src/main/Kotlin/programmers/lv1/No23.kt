package programmers.lv1

class No23 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0
        for(i in a.indices) {
            answer += a[i]*b[i]
        }
        return answer
    }
}



