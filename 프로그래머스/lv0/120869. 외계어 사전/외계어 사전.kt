class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int = if (dic.any { spell.sorted() ==  it.map { it.toString() }.sorted()}) 1 else 2
}