class Solution {
    fun solution(n: Int): Long = calc(1, n, Pair(0L, 1L))

    tailrec fun calc(s: Int, n: Int, pair: Pair<Long, Long>): Long = if (s >= n) {
        (pair.first + pair.second) % 1234567
    } else {
        calc(s + 1, n, Pair(pair.second, (pair.first + pair.second) % 1234567))
    }
}