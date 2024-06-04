class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var rowMin = Int.MAX_VALUE
        var colMin = Int.MAX_VALUE
        var rowMax = Int.MIN_VALUE
        var colMax = Int.MIN_VALUE
        
        wallpaper.forEachIndexed { index, row ->
            if (row.contains("#")) {
                row.forEachIndexed { subIndex, column ->
                    if (column == '#') {
                        if (index < rowMin) rowMin = index
                        if (index > rowMax) rowMax = index
                        if (subIndex < colMin) colMin = subIndex
                        if (subIndex > colMax) colMax = subIndex
                    }
                }
            }
        }

        return intArrayOf(rowMin, colMin, rowMax + 1, colMax + 1)
    }
}