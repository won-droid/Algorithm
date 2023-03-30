class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray = numbers.toList().run {
        if (direction.equals("left")) {
            java.util.Collections.rotate(this, -1)
        } else {
            java.util.Collections.rotate(this, 1)
        }

        toIntArray()
    }
}