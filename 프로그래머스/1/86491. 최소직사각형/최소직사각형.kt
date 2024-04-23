class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var sizeAlignedList = sizes.map { size -> 
            if (size[0] < size[1]) intArrayOf(size[1], size[0]) else size
        }
        
        var maxWidth = sizeAlignedList.map { it[0] }.maxOrNull() ?: Int.MIN_VALUE
        var maxHeight = sizeAlignedList.map { it[1] }.maxOrNull() ?: Int.MIN_VALUE
        
        return maxWidth * maxHeight
    }
    
    // fun solution(sizes: Array<IntArray>): Int = sizes.sortedBy { it[0] }.map { it[0] to it[1] }
    //     .let { widths, heights ->
    //         (widths.maxOrNull() ?: Int.MIN_VALUE) * (heights.maxOrNull() ?: Int.MIN_VALUE)
    //     }
}