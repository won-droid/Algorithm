class Solution {
    fun solution(s: String) = s.split(" ").map { it.mapIndexed { index, c -> if (index % 2 == 0) c.uppercase() else c.lowercase() }.joinToString("") }.joinToString(" ")
}