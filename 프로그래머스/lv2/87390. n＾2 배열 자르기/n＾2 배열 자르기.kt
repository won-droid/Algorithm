class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray =
        IntArray((right - left + 1).toInt()) {
            (kotlin.math.max((left + it) / n, (left + it) % n) + 1).toInt()
        }
}