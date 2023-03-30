class Solution {
    fun solution(n: Int) = (1 until n).first { n%it == 1 }
}