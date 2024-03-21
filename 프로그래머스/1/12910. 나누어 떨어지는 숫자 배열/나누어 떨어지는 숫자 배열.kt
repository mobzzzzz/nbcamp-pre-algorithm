class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        var filteredList: List<Int>
        
        filteredList = arr.filter { it % divisor == 0}
        
        if (filteredList.count() == 0) {
            answer = intArrayOf(-1)
        } else {
            answer = filteredList.sorted().toIntArray()
        }
        
        return answer
    }
}