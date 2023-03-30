class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""

        food.forEachIndexed { index, i ->
            for (j in 1..i/2) {
                answer += index
            }
        }

        return "${answer}0${answer.reversed()}"
    }
}