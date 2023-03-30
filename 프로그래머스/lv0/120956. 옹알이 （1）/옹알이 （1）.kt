class Solution {
    fun solution(babbling: Array<String>): Int = babbling.map { it.replace("aya", " ").replace("ye", " ").replace("woo", " ").replace("ma", " ") }.count { it.isBlank() }
}