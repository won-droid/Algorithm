class Solution {
    fun solution(sides: IntArray): Int = sides.maxOf { it }.let { maxNum ->
        if (sides.sum() - maxNum > maxNum) 1 else 2
    }
}