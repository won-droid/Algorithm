class Solution {
    fun solution(n: Int) = n.toString().split("").sumOf { if (it.isNotEmpty()) it.toInt() else 0 }
}