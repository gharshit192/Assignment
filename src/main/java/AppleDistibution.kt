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

