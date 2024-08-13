import  java.util.Scanner
fun main() {

    var large  = Scanner(System.`in`)
    println("Enter the first number")
    var first = large.nextInt()
    println("Enter the second number")
    var second = large.nextInt()
    println("Enter the third number")
    var third = large.nextInt()
    println("Enter the fourth number")
    var fourth = large.nextInt()
    if (first  >= second && first  >= third && first  >= fourth)
    println("$first is the largest number.")
    else if (second  >= first && second  >= third && second  >= fourth)
    println("$2num is the largest number.")
    else if (third  >= first && third  >= second && third  >= fourth)
    println("$3num is the largest number.")
    else println("$4num is the largest number.")









}


