class Solution {
    fun solution(n: Int): Int = (1..n).first { (it * 6) % n == 0 }
}