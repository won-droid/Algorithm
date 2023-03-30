class Solution {
    fun solution(s: String, n: Int) = s.map {
        if (it.toString().isBlank()) {
            it
        } else {
            if (it.code in 65..90) {
                val shift = (it.code + n)
                if (shift in 65..90) {
                    shift.toChar()
                } else {
                    (65 + shift - 91).toChar()
                }
            } else {
                val shift = (it.code + n)
                if (shift in 97..122) {
                    shift.toChar()
                } else {
                    (97 + shift - 123).toChar()
                }
            }
        }
    }.joinToString("")
}