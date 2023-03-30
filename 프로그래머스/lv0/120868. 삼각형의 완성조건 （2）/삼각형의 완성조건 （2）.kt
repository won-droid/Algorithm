class Solution {
    // fun solution(sides: IntArray): Int = (sides.maxOf { it } - sides.minOf { it } + 1 .. sides.maxOf { it }).count() + (sides.maxOf { it } + 1 until sides.sum()).count()
    
    fun solution(sides: IntArray): Int = (sides.maxOf { it } - sides.minOf { it } + 1 until sides.sum()).count()
}