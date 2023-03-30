class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>) = arr1.mapIndexed { i, ints -> 
        ints.mapIndexed { j, int -> int + arr2[i][j] }
    }
}