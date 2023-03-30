class Solution {
    fun solution(strings: Array<String>, n: Int) = strings.sortedWith(compareBy<String> { it[n] }.thenBy { it })
}