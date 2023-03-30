class Solution {
    fun solution(numbers: IntArray) = mutableSetOf<Int>().apply {
        (numbers.forEachIndexed { index, i ->
            if (index != numbers.size - 1) {
                for (j in index + 1 until numbers.size) {
                    add(numbers[j] + i)
                }
            }
        })
    }.sorted()
}