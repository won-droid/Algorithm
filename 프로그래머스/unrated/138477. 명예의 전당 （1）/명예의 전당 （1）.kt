class Solution {
    fun solution(k: Int, score: IntArray): IntArray = score.mapIndexed { index, i ->
        score.copyOfRange(0, index + 1).sortedDescending().run { getOrNull(k - 1) ?: minOf { it } }
    }.toIntArray()
}