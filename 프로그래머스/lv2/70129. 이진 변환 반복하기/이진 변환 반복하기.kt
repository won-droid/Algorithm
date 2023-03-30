class Solution {
    fun solution(s: String): IntArray  = binary(intArrayOf(0, 0), s)

    tailrec fun binary(array: IntArray, s: String): IntArray {
        
        if (s.equals("1")) {
            return array
        }
        
        val countZero = s.filter {it.equals('0')}.length
        val resultString = Integer.toBinaryString(s.length - countZero)
        
        array[0]++
        array[1] += countZero
        
        return binary(array, resultString)
    }
}