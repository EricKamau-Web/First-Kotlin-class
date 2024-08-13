import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter the temperature of patient : ")
    var temperature = read.nextDouble()

    if (temperature > 37){
        println("High fever")
    }
    else if (temperature < 37){
        println("low fever")
    }
    else{
        println("Normal temperature")
    }



}