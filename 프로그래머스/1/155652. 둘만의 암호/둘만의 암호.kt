class Solution {
    fun solution(s: String, skip: String, index: Int): String = ('a'..'z')
        .filterNot { skip.contains(it) }
        .let { actualAlphabetList ->
            s.map { actualAlphabetList[(actualAlphabetList.indexOf(it) + index) % actualAlphabetList.size] }
        }.joinToString("")
}