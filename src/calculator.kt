import java.util.Scanner

fun main() {
    var calculator = Scanner(System.`in`)
    println("Enter the first numbers : ")
    var firstnumber = calculator.nextInt()
    println("Enter the second number")
    var secondnumber = calculator.nextInt()
    println("please enter an  operator : +,-,*,/")
    var operator = readLine()



    when(operator){
        "+" -> println(" ${firstnumber + secondnumber}")
        "-" -> println(" ${firstnumber - secondnumber}")
        "*" -> println(" ${firstnumber * secondnumber}")
        "/" -> println(" ${firstnumber / secondnumber}")
        else ->println("unknown operator")

    }





}