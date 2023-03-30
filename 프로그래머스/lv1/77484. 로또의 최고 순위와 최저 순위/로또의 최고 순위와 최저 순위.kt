class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var high = 0
        var low = 0
        for(i in lottos.indices){
            for(j in win_nums.indices){
                if(win_nums[j] == lottos[i]){
                    high++
                    low++
                }
            }
            if(lottos[i] == 0)
                high++
        }
        var answer: IntArray = intArrayOf(rankCheck(high), rankCheck(low))
        return answer
    }
    fun rankCheck(match : Int): Int{
        when(match){
            6 -> return 1
            5 -> return 2
            4 -> return 3
            3 -> return 4
            2 -> return 5
            else -> return 6
        }
    }
}