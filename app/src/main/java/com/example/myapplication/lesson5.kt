package com.example.myapplication

import kotlin.random.Random

fun main() {
    print("please enter a number: ")
    var number: Any = readln()!!.toInt()

    if (number.toString().toInt() % 2 == 0) {
        println("$number is even ")
    } else {
        println("$number is odd")
    }


//If-Else - if ladder statement
    print("please enter your age :: ")
    var YourAge: Int = readln()!!.toInt()
    if (YourAge < 13) {
        print("you are a child")
    } else if (YourAge < 19) {
        print("you are a teenager")
    } else {
        if (YourAge < 50) {
            print("you are an teenager")
        } else {
            print("you are a senior")
        }
    }


//Nested If statement
    println("please enter 3 numbers : ")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()
    var largestNumber: Int
    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }
    println("the largest number is $largestNumber")


    //when loop
    print("Please enter a day number of week : - ")
    var dayNumber: Int = readln()!!.toInt()
    var day: String
    when (dayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }
    println(day)


    //for loop
    // for loop from 1 to 9
    for (i in 1..9) {
        println(i)
    }

// Calculate sum from 0 to 5
    var sum = 0
    for (x in 0..5) {
        println(x)
        sum += x // sum = sum + x
    }

// Calculate sum of even numbers from 0 to 10
    sum = 0 // reuse the same variable
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sum += x // sum = sum + x
        }
    }
    println("The sum of even numbers is $sum")

// Iterating over array list
    val vehicles = arrayListOf("Tata", "Kia", "Hyundai", "MG")
    for (y in vehicles.indices) {
        println("The value in $y index is: - ${vehicles[y]}")
    }


    //for each loop
    var vehicle = arrayListOf<String> ("Tata", "Kia", "Hyundai", "MG")
    vehicle.forEach { it: String ->
    println(it)
    }


    //whileloop
    var i = 0
    while (i < 5) {
        println(i)
        ++i
    }
    //3 -> 3*2*1 factorial of 3 - 3!
    //5 -> 5*4*3*2*1 factorial of 5 - 5!
    // In math factorial is represented by ! -> 5!

    var k = 1
    var fact = 1
    while (k<6)1 //setting the conditions while k < 6
    fact*=k; // fact = fact * k
    println("$k! =$fact");
    k++; //increment k by 1


    //infinite loops
    var number4 = kotlin.random.Random.nextInt(from = 0, until = 10000)
    println("Please enter any number from 0 to 10000: - ")
    while (true) {
        var userGuess: Int = readln()!!.toInt()
        if (userGuess == number4) {
            println("congratulations!!!!, you won"); break
        } else if (userGuess < number4) println("Increase your guess") else println("Decrease your guess")
    }

    //do while loop
    var num = 1
    do {
        println(num)
        num++
    } while (num <= 15)

}





