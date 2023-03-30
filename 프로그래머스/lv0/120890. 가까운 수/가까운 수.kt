class Solution {
    fun solution(array: IntArray, n: Int): Int = array.sortedWith(compareBy<Int> {kotlin.math.max(n, it) - kotlin.math.min(n, it) }.thenBy { it }).first()
}