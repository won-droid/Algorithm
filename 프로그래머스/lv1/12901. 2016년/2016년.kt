import java.text.SimpleDateFormat
import java.util.*

class Solution {
    fun solution(a: Int, b: Int): String {
        val date = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse("2016-$a-$b")
        return SimpleDateFormat("EEE", Locale.getDefault()).format(date).uppercase()
    }
}