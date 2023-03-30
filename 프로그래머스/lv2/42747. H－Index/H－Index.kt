class Solution {
    fun solution(citations: IntArray) = (citations.size downTo 0).firstOrNull { c -> citations.count { it >= c }.let { it >= c && citations.size - it < c } } ?: 0
}