class Solution {
    fun solution(brown: Int, yellow: Int): IntArray  = (brown + yellow).let { sum -> (sum / 3 downTo 3).first { x -> (x - 2) * (sum / x - 2) == yellow }.let { intArrayOf(it, sum / it) } }
}