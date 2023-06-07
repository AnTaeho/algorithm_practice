package programmers.lv1

class No13 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(seoul: Array<String>): String {
        for (i in 0..seoul.size) {
            if (seoul[i] == "Kim") {
                return "김서방은 " + i + "에 있다"
            }
        }
        return "answer"
    }

}



