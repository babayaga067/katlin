package com.example.myapplication

// arrays
fun main(array: Array<String>) {
    var age = arrayOf(1,2,3)
    println(age)
    println("the first element of the age is " + age[0])
    println("the second element of age is " + age[1])
    println("the third element of the age is " + age[2])

    println("***************************")

    var name = arrayOf("ram","shyam","hari")
    name[1] ="sandis"
    println("the first element of the name is "+name[0])
    println("the second element of the name is "+name[1])
    println("the third element of the name is "+name[2])

    println(name.size)

  //arraylist
  var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add( 1,20)
    age1.add(5)

    //we can add value directly in the array while initilizing variables.
    var age2 = arrayListOf<Int>(1,20,5)

    var name1 = arrayListOf<String>("sandis","ram","shari")
    name1.add("hari")
    name1.add(4,"sita")

    name1.remove("shari")
    name1.removeAt(0)

    println(name1)

    var mixArrayList = arrayListOf<Any>("hello",5,2,0)
    println(mixArrayList[0]);
    println(mixArrayList[1]);
    println(mixArrayList[2]);
}