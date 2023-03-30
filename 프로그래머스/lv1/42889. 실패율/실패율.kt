class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val fail = mutableMapOf<Int,Float>()
        for(i in 0..N-1){
            var clear = 0
            var stop = 0
            for(j in stages.indices){
                if(stages[j]>=i+1){
                    clear++
                    if(stages[j]==i+1)
                        stop++
                }
            }
            if(clear==0)
                fail.put(i+1,0.toFloat())
            else
                fail.put(i+1,stop.toFloat()/clear.toFloat())
        }
        val answer = fail.toList().sortedWith(compareByDescending({it.second})).toMap().keys.toIntArray()
        return answer
    }
}