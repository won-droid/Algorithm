class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray = intArrayOf(0, 0).apply {
        keyinput.forEach {
            when (it) {
                "left" -> set(0, kotlin.math.max(board[0] / 2 * -1, get(0) - 1))
                "right" -> set(0, kotlin.math.min(board[0] / 2, get(0) + 1))
                "up" -> set(1, kotlin.math.min(board[1] / 2, get(1) + 1))
                "down" -> set(1, kotlin.math.max(board[1] / 2 * -1, get(1) - 1))
            }
        }
    }
}