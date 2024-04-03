class Solution {
    fun solution(price: Int, money: Int, count: Int): Long = ((1..count).sumOf { price.toLong() * it } - money).coerceAtLeast(0)
}