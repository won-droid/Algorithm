class Solution {
    fun solution(numbers: IntArray): Int = numbers.sortedDescending().let { it[0] * it[1] }
}