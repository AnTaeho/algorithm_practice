package programmers.lv1

class No17 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(phone_number: String): String {
        return phone_number.mapIndexed { index, c ->
            if (phone_number.length - 5 < index) c else "*"
        }.joinToString("")
    }
}



