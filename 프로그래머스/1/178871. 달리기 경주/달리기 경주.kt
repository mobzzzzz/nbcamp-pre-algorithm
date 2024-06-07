import java.util.TreeMap

class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerKeyRankMap = mutableMapOf<Int, String>()
        val playerKeyNameMap = mutableMapOf<String, Int>()

        players.forEachIndexed { index, player ->
            playerKeyRankMap[index + 1] = player
            playerKeyNameMap[player] = index + 1
        }

        callings.forEach { calling ->
            val currentPlayerRank = playerKeyNameMap[calling]!!
            val nextPlayerRank = currentPlayerRank - 1

            val currentPlayer = playerKeyRankMap[currentPlayerRank]!!
            val nextPlayer = playerKeyRankMap[nextPlayerRank]!!

            playerKeyRankMap[currentPlayerRank] = nextPlayer
            playerKeyRankMap[nextPlayerRank] = currentPlayer

            playerKeyNameMap[currentPlayer] = nextPlayerRank
            playerKeyNameMap[nextPlayer] = currentPlayerRank
        }

        return playerKeyRankMap.values.toTypedArray()
    }
}