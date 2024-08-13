fun main() {
    //arithmetic operators
    var x = 12
    var y = 3

    println(x + y)
    println(x - y)
    println(x * y)
    println(x / y)
    println(x % y) //modulus


  //comparison operators



    println( x < y)
    println( x > y)
    println( x <= y)
    println( x >= y)
    println( x == y) //equal to
    println( x != y) //equal to

    //assignment operators

    var number = 56
    println(number)

    number += 2
    println(number)

    number -= 2
    println(number)

    //logic operators -&& (specifing and), || (specifing or ,!

    println((23 < 56) && (2 > 10)) //and returning  a true if all statement is true
    println((23 < 56) || ( 2 > 10)) //or returning  a true if any statement is true
    println(!((23 < 56) || (2 > 10)) ) //not true



}