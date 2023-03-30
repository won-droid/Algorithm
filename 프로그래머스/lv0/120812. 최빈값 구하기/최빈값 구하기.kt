class Solution {
    // fun solution(array: IntArray): Int = array.toSet().map { num -> Pair(num, array.count { it == num }) }.run {
    //     if (count { it.second == maxOf { it.second } } != 1)
    //         -1
    //     else
    //         first { it.second == maxOf { it.second } }.first
    // }
        
    fun solution(array: IntArray): Int = array.toSet().map { num -> Pair(num, array.count { it == num }) }.sortedByDescending { it.second }.run {
        if (first().second == getOrNull(1)?.second) -1 else first().first
    }
}