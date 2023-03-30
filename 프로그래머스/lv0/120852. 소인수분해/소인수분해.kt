class Solution {
    fun solution(n: Int): IntArray = ArrayList<Int>().apply {
        var num = n
        while (num != 1) {
            add((2..n).first { num % it == 0 })
            num /= last()
        }
    }.toSet().toIntArray()
}