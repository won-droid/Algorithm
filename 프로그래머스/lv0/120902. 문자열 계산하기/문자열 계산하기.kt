class Solution {
    fun solution(my_string: String): Int = my_string.replace("- ", "-").split(" ").sumOf { it.trim().toIntOrNull() ?: 0 }
}