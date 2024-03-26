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