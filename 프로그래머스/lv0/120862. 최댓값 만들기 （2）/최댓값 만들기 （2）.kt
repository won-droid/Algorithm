class Solution {
    fun solution(numbers: IntArray): Int = numbers.sorted().run {
        kotlin.math.max(first() * get(1), last() * get(lastIndex - 1))
    }
}