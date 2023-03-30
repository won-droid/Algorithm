class Solution {
    fun solution(order: Int): Int = order.toString().count { it in arrayOf('3', '6', '9') }
}