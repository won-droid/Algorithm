class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer = ""
        val result = mutableMapOf<String, Int>()
        for (i in survey.indices) {
            if (choices[i] > 4) {
                result[survey[i][1].toString()] = (result[survey[i][1].toString()] ?: 0) + choices[i] - 4
            } else if (choices[i] < 4) {
                result[survey[i][0].toString()] = (result[survey[i][0].toString()] ?: 0) + 4 - choices[i]
            }
        }

        answer += if ((result["R"] ?: 0) >= (result["T"] ?: 0)) "R" else "T"
        answer += if ((result["C"] ?: 0) >= (result["F"] ?: 0)) "C" else "F"
        answer += if ((result["J"] ?: 0) >= (result["M"] ?: 0)) "J" else "M"
        answer += if ((result["A"] ?: 0) >= (result["N"] ?: 0)) "A" else "N"
        print("$result")
        return answer
    }
}