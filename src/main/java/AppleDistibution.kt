/*Problem 2 : My Money My Shares

Ram , sham and rahim went for shopping apple. They bought apple worth 100 rupees. Ram paid 50 rupees, sham paid 30 rupees  and rahim paid 20 rupees. Each apple is tagged with its weight on it.  Write a program to distribute apples such that the quantity of apple they get is in best proportionate to the amount they paid. 

Note : you cannot cut a apple into pieces have to allocate the whole apple to one of them.
For example : 


If there is 8 apple  of  400g , 100g  , 400g , 300g , 200g , 300g ,100g , 200g  then we can distribute them as 
Ram :  400g , 400g , 200g  (total 1kg , 50%)
Sham :  300g , 300g (tatal 600g , 30%)
rahim , 200g , 100g , 100g  (tatal 400g , 20%)

Distribution Result : 
Ram : 400 400 100
Sham : 300 , 300
Rahim  : 200 , 100 , 100

*/
import java.util.*

fun main() {

    var totalWeight = 0
    val weightsList = mutableListOf<Int>()
    val scanner = Scanner(System.`in`)
    while (true) {
        print("Enter apple weight in gram (-1 to stop ) : ")
        val appleWeight = scanner.nextInt()
        if (appleWeight == -1) break
        weightsList.add(appleWeight)
        totalWeight += appleWeight
    }

    distributeApples(weightsList, totalWeight)
}


fun distributeApples(weightsList: MutableList<Int>, sum: Int) {
    val ramShare: Int = (0.5 * sum).toInt()
    val shamShare: Int = (0.3 * sum).toInt()
    val rahimShare: Int = (0.2 * sum).toInt()

    weightsList.sort()

    println("Distribution Result : ")

    print("Ram : ")
    getEachShare(weightsList, ramShare)
    print("Sham : ")
    getEachShare(weightsList, shamShare)
    print("Rahim : ")
    getEachShare(weightsList, rahimShare)

}
    fun getEachShare(weightList: MutableList<Int>, share: Int) {

        var count = weightList.size - 1
        var eachShare = share

        while (count >= 0) {
            if (eachShare >= weightList[count]) {
                print("${weightList[count]} ")
                eachShare -= weightList[count]
                weightList.removeAt(count)
                count = weightList.size - 1
            } else {
                count--
            }
        }

        if (weightList.contains(eachShare)) {
            print(eachShare)
            weightList.remove(eachShare)
        }
        println()
    }

