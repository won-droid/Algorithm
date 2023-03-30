class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = IntArray(id_list.size) { 0 }

        val reportSet = mutableSetOf<List<String>>()
        val reportResult = mutableMapOf<String, Int>()

        reportSet.addAll(report.map { it.split(" ") })

        id_list.forEach { id ->
            reportResult[id] = reportSet.count { it[1] == id }
        }

        for (i in id_list.indices) {
            reportSet.filter { it[0] == id_list[i] }.forEach {
                if ((reportResult[it[1]] ?: 0) >= k) {
                    answer[i]++
                }
            }
        }
        
        return answer
    }
}