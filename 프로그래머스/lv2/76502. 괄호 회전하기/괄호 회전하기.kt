class Solution {
    fun solution(s: String): Int {
        var answer = 0
        (0 until s.length).forEach {
            var testString = ""

            for (i in it until it + s.length) {
                testString += s[i % s.length]
            }
            if (checkString(testString)) {
                answer++
            }
        }
        return answer
    }
    
    tailrec fun checkString(s: String): Boolean {
        return if (!s.contains("()") && !s.contains("[]") && !s.contains("{}")) {
            s.isBlank()
        } else {
            var returnString = s
            returnString = returnString.replace("()", "")
            returnString = returnString.replace("[]", "")
            returnString = returnString.replace("{}", "")
            checkString(returnString)
        }
    }
}