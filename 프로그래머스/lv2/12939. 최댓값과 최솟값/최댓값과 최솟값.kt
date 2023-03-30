import java.util.Collections

class Solution {
    fun solution(s: String): String = s.split(" ").map { it.toInt() }.let { "${Collections.min(it)} ${Collections.max(it)}" }
}