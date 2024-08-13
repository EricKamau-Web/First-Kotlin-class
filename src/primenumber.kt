import java.util.Scanner

fun main() {
    var num = Scanner(System.`in`)
    println("Enter the number")

    var number = num.nextInt()
    if (number == 0 || number == 1){
        println("not a prime number or odd number")
    }
    if (number % 2 == 0){
        println("is a prime number")
    }
    else {
        println("is an odd number")
    }


}