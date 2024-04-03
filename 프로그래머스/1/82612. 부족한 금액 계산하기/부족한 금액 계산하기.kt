class Solution {
    fun solution(price: Int, money: Int, count: Int): Long = ((1..count).fold(0L) { total, num -> price.toLong() * num + total } - money).coerceAtLeast(0)
}