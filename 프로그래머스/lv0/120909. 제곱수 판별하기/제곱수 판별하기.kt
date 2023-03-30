import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int = if (sqrt(n.toFloat()) - sqrt(n.toFloat()).toInt() == 0f) 1 else 2  
}