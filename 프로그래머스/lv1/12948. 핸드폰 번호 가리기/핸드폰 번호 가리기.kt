class Solution {
    fun solution(phone_number: String): String = "${(0..phone_number.length - 5).joinToString(""){"*"}}${phone_number.substring(phone_number.length-4, phone_number.length)}"
}