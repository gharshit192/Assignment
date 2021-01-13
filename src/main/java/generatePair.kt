/*
Write a program to find all pairs of elements in an array whose sum is equal to a specified number.
            Example : {2, 7, 4, -5, 11, 5, 20}, 15 (Specified number enter by a user)

            Output : (4,11) & (-5 ,20)
*/

import java.util.Arrays
object generatePair {
    fun findThePairs(inputArray: IntArray, inputNumber: Int) {
        Arrays.sort(inputArray)
        println("Pairs of elements whose sum is $inputNumber are : ")
        var i = 0
        var j = inputArray.size - 1
        while (i < j) {
            if (inputArray[i] + inputArray[j] == inputNumber) {
                  println("(" + inputArray[i]+ ", " + inputArray[j] + ")")
                i++
                j--
            } else if (inputArray[i] + inputArray[j] < inputNumber) {
                i++
            } else if (inputArray[i] + inputArray[j] > inputNumber) {
                j--
            }
        }
  }
    @JvmStatic
    fun main(args: Array<String>) {
        findThePairs(intArrayOf(4, 6, 5, -10, 3, 5, 20), 10)
    }
}
