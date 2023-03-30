import java.util.Collections.max

class Solution {
    fun solution(sizes: Array<IntArray>) =
        max(sizes.map { if (it[0] > it[1]) it[1] else it[0] }) * max(sizes.map { if (it[0] > it[1]) it[0] else it[1] })
}