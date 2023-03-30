class Solution {
    fun solution(n: Int): String = (0 until n).map { if (it % 2 == 0) '수' else '박' }.joinToString("")
}