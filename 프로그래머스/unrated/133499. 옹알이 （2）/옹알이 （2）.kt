class Solution {
    // fun solution(babbling: Array<String>): Int = babbling.map {
    //     it.replace("ayaaya|yeye|woowoo|mama".toRegex(), "cont").replace("aya|ye|woo|ma".toRegex(), "")
    // }.count { it.isEmpty() }
    fun solution(babbling: Array<String>): Int = babbling.count { it.matches("(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$".toRegex()) }
}