fun main() {

    var firstname = "Eric"
    var school = "EMOBILIS"

    println(firstname)
    println(firstname[1]) // printing second letter in var eric
    println(firstname.uppercase()) //converting text to caps
    println(school.lowercase())
    println(firstname   +   school)  //to join to strings use+
    println(firstname + "  " + school)

    //string interpolation
    println("My first name is " + firstname + " I study at " + school)

    println("My first name is $firstname . I study at $school") //use $ to easily join variables and string



}