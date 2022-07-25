var x = 5

fun main() {
    println("Hello world")
    println(addtwoInt(2 , 3))
    printSum( 2 , 3)
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 4
    println(c)
    println(x)
    incrementX()
    println(x)
}


// A function with two Int parameters and Int return type.

fun addtwoNum(a:Int , b:Int):Int {
    return a + b
}

// A function body can be an expression. Its return type is inferred.

fun addtwoInt(a:Int , b:Int):Int  = a + b

// A function that returns no meaningful value

fun printSum(a:Int , b:Int): Unit{
    println("sum of $a  and $b is  ${a + b}")
}

fun incrementX() { 
    x += 1 
}