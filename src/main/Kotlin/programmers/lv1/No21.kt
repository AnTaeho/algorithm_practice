package programmers.lv1

class No21 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(s: String): String {
        val length = s.length
        return if (length % 2 == 1) {
            s[length/2].toString()
        } else {
            s.substring(length/2-1, length/2+1)
        }
    }
}



