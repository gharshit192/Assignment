import java.util.*

object generatePairWhoseSumEqualsToUserNo {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(2, 7, 4, -5, 11, 5, 20)
        println("Enter any no")
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        var i: Int
        var j: Int
        i = 0
        while (i < arr.size) {
            j = 0
            while (j < arr.size) {
                if (arr[i] + arr[j] == n) {
                    println("(" + arr[i] + ", " + arr[j] + ")")
                }
                j++
            }
            i++
        }
    }
}