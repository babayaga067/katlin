package com.example.myapplication

//list

fun main() {
    val numbers = listOf("one", "two", "three", "four")

    println("number of element: ${numbers.size}")
    println("third element : ${numbers.get(2)}")
    println("forth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")


    //immutable list
    val lst = listOf("one", "two", "three")
    println("mutable list")
    for (i in lst.indices) {
        println(lst[i])
        println()

    }


    //mutable list
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("four")
    println("immutable list")
    for (i in mutableLst.indices) {
        println(mutableLst[i])



    //set

    val numbers = setOf(1, 2, 3, 4)
    for (elements in numbers) {
        println(elements)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("the sets are equal: ${numbers == numbersBackwards}")


    //map

    val countriesCapitals = mapOf(
        "nepal" to "kathmandu",
        "china" to "Beijing",
        "India" to "new Delhi"
    )

    println("All keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")

    println("Capital of nepal is : ${countriesCapitals["Nepal"]}")
    }

    //Example : (Immutable Map)
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    println("enter studdent name : ")
    val input: String = readln().lowercase()
    println(studentMarks[input])


//Example : (mutable Map)
    val studentMarks1 = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    studentMarks1["ram"] =60
    studentMarks1.put("sabin",80)
    println("enter student name: ")
    val input12 : String = readln().lowercase()
    println(studentMarks1[input12])
}
