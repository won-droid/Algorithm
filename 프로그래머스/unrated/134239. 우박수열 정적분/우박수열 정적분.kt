class Solution {
    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
        val collatz = arrayListOf(k)
        val squareArea = arrayListOf(0.0)

        while (collatz.last() != 1) {
            if (collatz.last() % 2 == 0) {
                collatz.add(collatz.last() / 2)
            } else {
                collatz.add((collatz.last() * 3) + 1)
            }
        }

        for (i in 0 until collatz.lastIndex) {
            squareArea.add(squareArea.last() + ((collatz[i] + collatz[i + 1]) / 2.0))
        }

        return arrayListOf<Double>().apply {
            ranges.forEach {
                if (it[0] > collatz.lastIndex + it[1]) {
                    add(-1.0)
                } else {
                    add(squareArea[collatz.lastIndex + it[1]] - squareArea[it[0]])
                }
            }
        }.toDoubleArray()
    }
}