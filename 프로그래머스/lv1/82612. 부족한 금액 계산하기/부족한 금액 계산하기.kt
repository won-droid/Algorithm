class Solution {
    fun solution(price: Int, money: Int, count: Int) = ((1..count).sumOf { price.toLong() * it } - money).run {
        if (this <= 0) {
            0
        } else {
            this
        }
    }
}