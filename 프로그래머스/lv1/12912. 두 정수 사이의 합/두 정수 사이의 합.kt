class Solution {
    fun solution(a: Int, b: Int) = if (a > b) (b.toLong()..a.toLong()).sum() else (a.toLong()..b.toLong()).sum().toLong()
}