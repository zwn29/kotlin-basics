var a = 1
// simple name in template:
val s1 = "a is $a" 

// arbitrary expression in template:
val s2 = "${s1.replace("is", "was")}, but now is $a"

fun main(){
    println(s1)
    println(s2)
}