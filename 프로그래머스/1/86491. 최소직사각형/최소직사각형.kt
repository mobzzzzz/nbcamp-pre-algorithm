class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var sizeAlignedList = sizes.map { size -> 
            if (size[0] < size[1]) intArrayOf(size[1], size[0]) else size
        }
        
        var maxWidth = sizeAlignedList.map { it[0] }.maxOrNull() ?: Int.MIN_VALUE
        var maxHeight = sizeAlignedList.map { it[1] }.maxOrNull() ?: Int.MIN_VALUE
        
        return maxWidth * maxHeight
    }

    fun solution2(sizes: Array<IntArray>): Int {
        val widths = mutableListOf<Int>()
        val heights = mutableListOf<Int>()

        sizes.forEach {
            widths.add(Math.max(it[0], it[1]))
            heights.add(Math.min(it[0], it[1]))
        }

        return widths.maxOrNull()!! * heights.maxOrNull()!!
    }

    fun solution3(sizes: Array<IntArray>): Int
        = sizes.map{it.maxOrNull()!!}.maxOrNull()!! * sizes.map{it.minOrNull()!!}.maxOrNull()!!
    
    // fun solution(sizes: Array<IntArray>): Int = sizes.sortedBy { it[0] }.map { it[0] to it[1] }
    //     .let { widths, heights ->
    //         (widths.maxOrNull() ?: Int.MIN_VALUE) * (heights.maxOrNull() ?: Int.MIN_VALUE)
    //     }
}