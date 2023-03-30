class Solution {
    // fun solution(k: Int, m: Int, score: IntArray): Int {
    //     var answer: Int = 0
    //     score.sortDescending()
    //     for (i in m..score.size step(m)) {
    //         answer += score.copyOfRange(i-m, i).minOf { it } * m
    //     }
    //     return answer
    // }
    
    fun solution(k: Int, m: Int, score: IntArray): Int = score.sortedDescending().run {
        (m-1..lastIndex step (m)).fold(0) { acc, i -> acc + (get(i) * m) }
    }
}