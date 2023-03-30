class Solution {
    fun solution(record: Array<String>): Array<String> {
        val answer = mutableListOf<String>()
        val finalname = mutableMapOf<String, String>()
        for(i in record){
            val a = i.split(" ")
            if(a.size > 2)
                finalname.put(a[1],a[2])
        }
        for(i in record){
            val a = i.split(" ")
            if(a[0].equals("Enter"))
                answer.add(finalname[a[1]]+"님이 들어왔습니다.")
            else if(a[0].equals("Leave"))
                answer.add(finalname[a[1]]+"님이 나갔습니다.")
        }
        return answer.toTypedArray()
    }
}