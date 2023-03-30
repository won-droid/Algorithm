class Solution {
    fun solution(n: Long) = n.toString().toCharArray().sortedDescending().joinToString("").toLong()
}