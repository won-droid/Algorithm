class Solution {
    fun solution(X: String, Y: String): String = X.groupBy {
        it
    }.map { x ->
        Pair(x.key, kotlin.math.min(x.value.size, Y.count { it == x.key }))
    }.sortedByDescending {
        it.first
    }.joinToString("") {
        it.first.toString().repeat(it.second)
    }.replaceFirst("^0+(?!$)".toRegex(), "").ifEmpty { "-1" }
}