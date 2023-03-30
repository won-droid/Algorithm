class Solution {
    fun solution(s: String) = s.none { !it.isDigit() } && (s.length == 4 || s.length == 6)
}