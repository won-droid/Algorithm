class Solution {
    fun solution(k: Int, tangerine: IntArray): Int = cal(k, tangerine.groupBy { it }.values.sortedByDescending { it.size })

    fun cal(k: Int, tangerine: List<List<Int>>): Int {
        var result = 0
        tangerine.forEachIndexed { index, list ->
            result += list.size
            if (k <= result) {
                return index + 1
            }
        }
        return 0
    }
}