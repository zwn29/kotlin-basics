class Shape

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

val rectangle =  Rectangle(5.0, 2.0)
// The default constructor with parameters listed in the class declaration is available automatically


fun main() {
    println(rectangle.perimeter)
    println("The perimeter is ${rectangle.perimeter}")
}