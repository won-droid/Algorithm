class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val day = mutableListOf<Int>()
        for(i in progresses.indices){
            val progress = 100-progresses[i]
            if(progress%speeds[i]==0)
                day.add(progress/speeds[i])
            else
                day.add(progress/speeds[i]+1)
        }
        for(i in 0 until day.size-1){
            var count = 1
            if(day[i] != -1){
                for(j in i+1 until day.size){
                    if(day[j]!=-1) {
                        if(day[i]>=day[j]){
                            count++
                            day[j] = -1
                        }else   break
                    }
                }
                day[i] = -1
                answer.add(count)
            }
        }
        if(day[day.size-1] != -1)
            answer.add(1)
        return answer.toIntArray()
    }
}