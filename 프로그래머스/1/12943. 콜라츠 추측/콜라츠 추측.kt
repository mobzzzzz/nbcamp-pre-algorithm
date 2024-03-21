class Solution {
    fun solution(num: Int): Int {
        var answer = num
        var count = 0
        
        if (num == 1) { return 0 }
        
        while (answer != 1 && count < 501) {
            if (answer % 2 == 1) {
                answer *= 3
                answer += 1
            } else { 
                answer /= 2   
            }
            
            count++ 
        }
        
        if (count == 501) { return -1 }
        
        return count
    }
}