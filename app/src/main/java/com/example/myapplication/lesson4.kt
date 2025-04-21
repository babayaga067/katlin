package com.example.myapplication


fun main() {
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")


//Assignment operator
    var a1:Int = 20
    var b2:Int = 10
    var c:Int = 0
    c = a1+b2
    println("c= a + b = $c")
    c +=a1
    println("c += a =$c")
    c ==a1
    println("z -= x = $c")
    c*= a1
    println("z *= x = $c")
    c /= a1
    println("z /= x = $c")
    c %= a1
    println("z%=x=$c")


//unary operator
    var number:Double = 7.6
    var isCheck:Boolean = true;
    println("+number = ${+number}" );
    println("-number = ${-number}" );
    println("++number = ${++number}" );
    println("--number = ${--number}" );
    println("!isCheck = ${!isCheck}" );
    println("-----")
        var result1:Double = 4.7
    println("result :$result1")
//when the result+t is executed, the original value is evaluated first //and value of result is increased only after that
    println("result++:"+result1++)

//Equality and Relational Operators
    var a:Int = 5
    var b:Int = 5
    println("a == b: " + (a == b))
    println("a != b: " + (a != b))
    println("a < b: " + (a < b))
    println("a > b: " + (a > b))
    println("a >= b: " + (a >= b))
    println("a <= b:"+(a<=b))


    //conditional operators
    var number1:Int = 5
    var number2:Int = 8
    var number3: Int = 12
    var result2:Boolean = false;
//conditional operator (&&)
    result2 = (number1 > number2) && (number3 > number2)
    println(result2)
//conditional operator (||)
    result2 = (number1 > number2) || (number3 > number2)
    println(result2)



    //BODMAS
    var result3:Int = 5+2*4
    println ("Result = "+result)
    result3 = (5+2) * 4
    println("Result = "+result)
    var x:Int = 8;
    var y:Int = 4;
    var z:Int = 2;
    var sum:Int = 0;
    sum = x+--y+--z
    print("x+ --y +--z:::$sum")



    //rangeTo) Function and "in" operator
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a' <= 'j'

    var check = 'Z' in testCharRange
    println("mycharRange has Z : $check")
    println(myCharRange)
    println(testCharRange)


//console Input in Android App Development
    print("Enter name:: ")
    var name:String? = readln();
// The data user inputs is always a String so,
//type conversion for data type other than String
    print("Enter age: ")
        var age: Int = readln()!!.toInt();


}