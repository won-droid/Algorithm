class Solution {
    fun solution(s: String): Int = mutableListOf<Int>().apply {
        s.split(" ").forEach {
            if (it.equals("Z")) removeLastOrNull() else add(it.toInt())
        }
    }.sum()
}