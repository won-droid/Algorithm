class Solution {
    fun solution(array: IntArray): Int = array.map { it.toString().count { it.equals('7') } }.reduce { acc, i -> acc + i }
}