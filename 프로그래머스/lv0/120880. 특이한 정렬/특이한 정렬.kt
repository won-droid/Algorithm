class Solution {
fun solution(numlist: IntArray, n: Int): IntArray = numlist.sortedWith(compareBy<Int> { kotlin.math.max(n, it) - kotlin.math.min(n, it) }.thenByDescending { it }).toIntArray()
}