class Solution {
    fun solution(s: String): String = s.lowercase().split(" ").map { it.replaceFirstChar { it.uppercase() } }.joinToString(" ")
}