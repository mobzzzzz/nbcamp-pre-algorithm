class Solution {
    fun solution(arr: IntArray): IntArray {
        var list = arr.toMutableList()
        
        return when {
            list.count() == 0 -> intArrayOf()
            list.count() == 1 -> intArrayOf(-1)
            else -> { 
                list.removeAt(list.indexOf(list.minOrNull()))
                list.toIntArray()
            }
        }
    }
}

class Solution2 {
    fun solution(arr: IntArray): IntArray = if(arr.size == 1) arrayOf(-1).toIntArray() 
                                            else arr.filter { it != arr.min() }.toIntArray()
}