class Solution {
    // fun solution(age: Int): String = age.toString().map { (it.digitToInt() + 97).toChar() }.joinToString("")
    fun solution(age: Int): String = age.toString().map { ('a'.toInt() + it.digitToInt()).toChar() }.joinToString("")
}