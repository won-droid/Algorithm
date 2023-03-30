class Solution {
    fun solution(num: Int, k: Int): Int = if (num.toString().indexOf(k.toString()) == -1) -1 else num.toString().indexOf(k.toString()).inc()
}