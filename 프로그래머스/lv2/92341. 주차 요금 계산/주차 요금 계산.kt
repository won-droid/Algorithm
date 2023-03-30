class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val mapResult = mutableMapOf<String, Long>()

        records.forEachIndexed { index, s ->
            val data = s.split(" ")
            if (data[2] == "IN") {
                val inTime = data[0].split(":")[0].toLong() * 60 + data[0].split(":")[1].toLong()
                val outTime = records.copyOfRange(index, records.size).firstOrNull { it.split(" ")[1] == data[1] && it.split(" ")[2] == "OUT" }?.let {
                    it.split(" ")[0].split(":")[0].toLong() * 60 +it.split(" ")[0].split(":")[1].toLong()
                } ?: kotlin.run{
                    23L * 60 + 59
                }

                mapResult[data[1]] = (mapResult[data[1]] ?: 0L) + outTime - inTime
            }
        }

        return mapResult.toSortedMap().map {
            if (it.value >= fees[0]) {
                (fees[1] + kotlin.math.ceil((it.value - fees[0]).toFloat() / fees[2]).toLong() * fees[3]).toInt()
            } else {
                fees[1]
            }
        }.toIntArray()
    }
}