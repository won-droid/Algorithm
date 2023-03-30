class Solution {
    fun solution(i: Int, j: Int, k: Int): Int = (i..j).map { it.toString().count { char -> char == k.digitToChar() } }.sumOf { it }
}