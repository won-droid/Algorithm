class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int = IntArray(number) { index ->
        mutableSetOf<Int>().apply {
            for (i in 1..(index + 1) / 3 + 1) {
                takeIf { (index + 1) % i == 0 }?.run { addAll(listOf(i, (index + 1) / i)) }
            }
        }.size.takeIf { it <= limit } ?: power
    }.sum()
}