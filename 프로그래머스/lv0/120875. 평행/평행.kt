import kotlin.math.abs

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        for (i in 1 .. dots.lastIndex) {
            arrayOf(1, 2, 3).filterNot { it == i }.run { 
                val a = abs(dots[0][1] - dots[i][1]).toDouble() / abs(dots[0][0] - dots[i][0]).toDouble()
                val b = abs(dots[first()][1] - dots[last()][1]).toDouble() / abs(dots[first()][0] - dots[last()][0])
                
                if (a == b) return 1
            }
        }
        return 0
    }
}