class Solution {
    fun solution(n: Int, k: Int): Int =
        n.toString(k).split("0").filter { it.isNotEmpty() && it != "1" }.count {
            var result = true
            for (i in 2L..kotlin.math.sqrt(it.toDouble()).toLong()) {
                if (it.toLong() % i == 0L) {
                    result = false
                    break
                }
            }
            result
        }
}