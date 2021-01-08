object secondSmallest {
    /*
    Question:Write a program to find the second smallest element in an array
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val array = intArrayOf(4, 9, 1, 32, 12)
        val sizeOfArray = array.size
        var firstmin = Int.MAX_VALUE
        var secondmin = Int.MAX_VALUE
        for (item in 0 until sizeOfArray) {
            if (array[item] < firstmin) {
                secondmin = firstmin
                firstmin = array[item]
            } else if (array[item] < secondmin) {
                secondmin = array[item]
            }
        }
        println("Second smallest no is  = $secondmin")
    }
}