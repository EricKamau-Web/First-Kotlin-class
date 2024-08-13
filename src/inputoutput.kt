import java.util.Scanner


fun main() {

    var read = Scanner(System.`in`)

    println("Enter your fullname : ")
    var fullname = readln()
    println("My fullname is $fullname")

    println("Enter Age : ")
    var age = read.nextInt() //whole number .nextInt for a decimal .nextDouble
    println("My name is $fullname.I am $age years old")


}