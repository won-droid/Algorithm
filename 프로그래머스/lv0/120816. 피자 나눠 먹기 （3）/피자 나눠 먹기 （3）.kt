class Solution {
    fun solution(slice: Int, n: Int): Int = kotlin.math.ceil(n / slice.toDouble()).toInt()
}