class Solution {
    fun solution(x: Int, n: Int) = ArrayList<Long>().apply { for (i in 1..n) add(x.toLong() * i) }
}