fun main() {
    var languages = arrayOf("kotlin","php","java")
    println(languages[2])



    for (lang in languages){
        println(lang)
    }

    var new = languages.plus("C++")
    for (language in new){
        println("language is $language")
    }


    println(languages.size)
    println(new.size)







}