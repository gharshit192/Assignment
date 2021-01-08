import java.util.Scanner
fun main(args: Array<String>) {

    val userInput = Scanner(System.`in`)
    println("Enter your Name: ")
    var inputName = userInput.nextLine()
    println("Enter your Address: ")
    var inputAddress = userInput.nextLine()
    println("Enter your Age: ")
    var inputAge = userInput.nextInt()


    if (inputAge > 18) {
        println("User is verified and can able to work in a company")
        println("Name- $inputName")
        println("Age- $inputAge")
        println("Address- $inputAddress")
    } else {
        println("Apply after your age will be 18")
        println("Thank You")
    }
}