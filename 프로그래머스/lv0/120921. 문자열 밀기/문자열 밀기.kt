class Solution {
    fun solution(A: String, B: String): Int {
        // for (i in A.length downTo 1 ) {
        //     if ((i .. A.lastIndex + i).map { A[it % A.length] }.joinToString("").equals(B, true)) {
        //         return A.length - i
        //     }
        // }
        // return -1
        return (B + B).indexOf(A)
    }
}