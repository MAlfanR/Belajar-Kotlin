package com.alfan.kotlin.modul1

fun main(){
//    val textString = "Kotlin"
//    val firstChar = textString[0]
//
//    println("First character of $textString is $firstChar ")
//
//
//    val text = "Kotlin"
//    for(char in text){
//        println("$char ")
//    }


    val statement = "Kotlin is \nawesome\n"
    println(statement)

    //unicode
    val name = "Unicode test: \u0394"
    println(name)

    //Kedua, adalah Raw String yang memungkinkan kita menuliskan multiline dan arbitrary text. Ketika ingin membuat
    // beberapa baris String biasanya kita melakukan escaped terhadap String dengan memanfaatkan karakter escape \n
    // seperti berikut:

    val line = """
        Line 1
        Line 2
        Line 3
    """.trimIndent()

    println(line)

}