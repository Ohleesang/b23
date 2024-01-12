class Solution {

    fun solution(n: Int): Array<IntArray> {
        var answer = Array(n) { (IntArray(n) { 0 }) }

        //범위 지정
        var iRange = (0..<n) // 0~n
        var jRange = (0..<n) // 0~n
        var count  = 1
        fun inputArr(i:Int,j:Int){
            if(!iRange.contains(i)) return
            if(!jRange.contains(j)) return
            if(answer[i][j]!=0) return
            answer[i][j] = count++


            inputArr(i,j-1)
            inputArr(i-1,j)

            inputArr(i,j+1)
            inputArr(i+1,j)


        }
        //찾기
        inputArr(0,0)
        return answer



    }

}
fun main() {
    Solution().solution(4)
    Solution().solution(5)

}