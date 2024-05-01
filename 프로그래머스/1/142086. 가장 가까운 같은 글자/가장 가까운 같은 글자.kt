class Solution {
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()
        val charMap = mutableMapOf<Char, Int>()
        
        s.forEachIndexed { index, char ->
            if (charMap.contains(char)) answer.add(index - charMap[char]!!)
            else { answer.add(-1) }
            
            charMap[char] = index
        }
        
        return answer.toIntArray()
    }
}