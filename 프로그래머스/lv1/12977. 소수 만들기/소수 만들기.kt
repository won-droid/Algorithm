/*class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        for(i in 0 .. nums.size-3){
            for(j in i+1 .. nums.size-2)
                for(k in j+1 .. nums.size-1)
                    if(check(nums[i],nums[j],nums[k]))
                        answer++
        }
        return answer
    }
    fun check(a:Int,b:Int,c:Int):Boolean{
        var num = a+b+c
        for(i in 2..num/2){
            if(num%i == 0){
                return false
            }
        }
        return true
    }
}*/
class Solution {
    fun isPrime(n: Int): Boolean {
        if(n<2)return false
        else if(n<6){
            if(n==4)
            return false
            else return true}
        for (i in 2..Math.sqrt(n.toDouble()).toInt()){
            if(n%i==0)return false
        }
        return true
    }
    fun solution(nums: IntArray): Int {
        var answer = 0
        for (i in 0..nums.size-3){
            for(j in i+1..nums.size-2){
                for(k in j+1..nums.size-1){           
                    println(nums[i]+nums[j]+nums[k])
                    if(isPrime(nums[i]+nums[j]+nums[k]))answer++
                }
            }
        }

        return answer
    }
}