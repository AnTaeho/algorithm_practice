package programmers.lv1

class No12 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(num: Int): Int {
        var longNum = num.toLong()
        var count = 0

        while (count < 500 && longNum > 1) {
            count++
            longNum = if (longNum % 2 == 0L) longNum / 2 else longNum * 3 + 1
        }
        return if (count > 500) -1 else count
    }
}



