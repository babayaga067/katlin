package com.example.myapplication

fun main(args: Array<String>) {
    print("hello kotlin");


//mutable
//we can re assign values to mutuble variables
var age = 20;

age = 25
        //imutable
//we can't re assign values to imutable variables
//val roll = 15
//roll = 10


//data type
    var a: Boolean = true
    var b: Char = 'R'
    var c: Byte = 12
    var d: Short = -356
    var e: Int = 43543
    var f: Long = -51321354L
    var i: Float = 5.6451344F
    var h: Double = 7.32644564

println(a)
println(b)
println(c)
println(d)
println(e)
println(f)
println(i)
println(h)


//type conversion in kotlin

    var x: Double = 132.32
    var y: Int = x.toInt()
    var z: Byte = y.toByte()
println(x)
println(y)
println(z)


//String Data types in kotlin
var aq: String = "hello kitty"
    var iq: Int = aq.length
    var xq : Boolean = aq.equals("hello world")
    var username: String = "Softwarica"

    println(username.trim())
    println(aq);
    println(iq)
    print(aq.isEmpty())
    println(aq.lowercase())
    println(aq.uppercase())
    println(xq)
    print(aq.plus(",how are you"));








}

