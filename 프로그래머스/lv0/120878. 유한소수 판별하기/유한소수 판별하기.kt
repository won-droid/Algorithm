class Solution {
    fun solution(a: Int, b: Int): Int = (b / (kotlin.math.min(a, b) downTo 1).first { a % it == 0 && b % it == 0 }).let {
        if (a % b == 0 || checkPrimeFact(it)) 1 else 2
    }

    tailrec fun checkPrimeFact(num: Int): Boolean {
        return if (num % 2 == 0 || num % 5 == 0) {
            checkPrimeFact(if (num % 5 == 0) num / 5 else num / 2)
        } else num == 1
    }
}