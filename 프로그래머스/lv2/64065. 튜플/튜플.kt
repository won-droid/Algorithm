class Solution {
    fun solution(s: String): IntArray  {
        val array = s.split(",").map { it.filter { it.isDigit() }.toInt() }
        
        return array.toSet().sortedByDescending { num -> array.count { arrayNum -> arrayNum == num } }.toIntArray()
    }
}