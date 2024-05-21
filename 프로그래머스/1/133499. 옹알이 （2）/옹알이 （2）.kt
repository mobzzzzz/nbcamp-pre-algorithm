class Solution {
    fun solution(babblings: Array<String>): Int {
        val babuList = listOf("aya", "ye", "woo", "ma")
        var answer = 0
        
        babblings.forEach {
            var babu = it
            
            if (!it.hasConsecutiveKeywords(babuList)) { 
                babuList.forEach { actualBabu ->
                    babu = babu.replace(actualBabu, "?")
                }
                
                if (babu.replace("?", "").isEmpty()) answer++
            }
        }
        
        return answer
    }

    fun String.hasConsecutiveKeywords(keywords: List<String>): Boolean {
        keywords.forEach { keyword ->
            if (this.contains(keyword + keyword)) return true
        }

        return false
    }
}