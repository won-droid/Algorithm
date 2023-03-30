class Solution {
    fun solution(num: Int): Int {
        var number = num.toLong()
        for (i in 0..500) {
            if (number == 1L) {
                return i
            }
            if (number % 2L == 0L) {
                number /= 2
            } else {
                number = number * 3 + 1
            }
        }
        return -1
    }
}