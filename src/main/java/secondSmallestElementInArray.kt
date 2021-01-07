object secondSmallestElementInArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(7 , 3, 1, 30, 90, 65)
        println("Array elements after sorting:")
        for (i in arr.indices) {
            for (j in i + 1 until arr.size) {
                var temp = 0
                if (arr[i] > arr[j]) {
                    temp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                }
            }
            println(arr[i])
        }
        println("Second smallest element")
        println(arr[1])
    }
}
