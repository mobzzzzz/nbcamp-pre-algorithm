class Solution {
    fun solution(t: String, p: String): Int = p.length.let { 
        (0..t.length - it).fold(0) { acc, index -> 
            if (t.substring(index, index + it).toLong() <= p.toLong()) {
                acc + 1 
            } else { acc }
        } 
    }
}