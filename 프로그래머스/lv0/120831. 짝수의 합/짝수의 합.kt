class Solution {
    fun solution(n: Int): Int = (2..n).fold(0) { acc, num -> if(num % 2 == 0) acc + num else acc}
}