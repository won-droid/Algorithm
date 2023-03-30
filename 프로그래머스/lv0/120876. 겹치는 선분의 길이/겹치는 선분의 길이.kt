class Solution {
    fun solution(lines: Array<IntArray>): Int = lines.map { (it[0] until it[1]).toList() }.reduce { acc, list -> acc + list}.run {
        toSet().count { setNum ->
            count { it == setNum } >= 2
        }
    }
}