class Solution {
    fun solution(ingredient: IntArray): Int {
        var array = mutableListOf<Int>()

        for (i in ingredient) {
            array.add(i)

            if (array.getOrNull(array.lastIndex - 3) == 1 && 
                array.getOrNull(array.lastIndex - 2) == 2 && 
                array.getOrNull(array.lastIndex - 1) == 3 && 
                array.getOrNull(array.lastIndex) == 1) {
                for (i in 0..3) array.removeLast()
            }
        }

        return (ingredient.size - array.size) / 4
    }
}