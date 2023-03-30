class Solution {
    fun solution(n: Int): Int = (4..n).count { num ->
        (1..num).count { num % it == 0 } >= 3
    }
}