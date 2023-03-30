class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String = if (db.any { it.contentEquals(id_pw) }) {
        "login"
    } else if (db.any { it[0] == id_pw[0] }) {
        "wrong pw"
    } else {
        "fail"
    }
}