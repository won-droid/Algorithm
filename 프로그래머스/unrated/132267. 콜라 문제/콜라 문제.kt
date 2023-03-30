class Solution {
    fun solution(a: Int, b: Int, n: Int): Int = cal (n, a, b, 0)

    tailrec fun cal (n: Int, a: Int, b: Int, result: Int): Int = if (n < a) {
            result
        } else {
            cal(n / a * b + n % a, a, b, result + n / a * b)
        }
}