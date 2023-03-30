class Solution {
    fun solution(my_string: String): Int = my_string.replace(Regex("[a-zA-Z]"), " ").split(" ").filter { it.isNotEmpty() }.map { it.toInt() }.sum()
}