class Solution {
    fun solution(s: String): IntArray {
        var zeroCount = 0
        var binaryCount = 0
        var temp = s
        
        while (temp != "1") {
            zeroCount += temp.count { it == '0' }
            temp = temp.filter { it == '1' }.length.toString(2)
            binaryCount += 1
        }
        
        return intArrayOf(binaryCount, zeroCount)
    }
}