import java.util.Collections.min

class Solution {
    fun solution(arr: IntArray): IntArray = arr.toCollection(ArrayList()).apply { remove(min(this)) }.run { if (isEmpty()) intArrayOf(-1) else toIntArray() }
}