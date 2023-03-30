class Solution {
    fun solution(score: Array<IntArray>): IntArray = score.map { it.sumOf { it } }.let { sumScores -> sumScores.map { sumScores.sortedDescending().indexOf(it) + 1 } }.toIntArray()
}