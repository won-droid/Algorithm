class Solution {
    fun solution(x: Int) = x % x.toString().toCharArray().sumOf { it.digitToInt() } == 0
}