package clase13_02_EstructurasAlgoritmicas

class clase1302 {
}

fun main(){

    /*println("Ingrese un número")
    var n1:Int = readLine()!!.toInt()

    if(n1 in 1 .. 10) {

        println("el número $(n1) esta dentro del rango")
    }else{
        println("el número $(n1) no esta dentro del rango")
    }*/

    /*println("Ingrese una letra: ")

    var l1:String = readln()!!.toString()

    var char = "a" downTo("u")

    var n2 = 1..10 step 2 */

    println("Ingrese su edad: ")

    var edad = readLine()!!.toInt()

    if(edad in 0..18) {
        print("Es menor de edad, vayase a dormir")
    }else if (edad in 18..60){
        print("Puede entrar")
    }else {
        println("Demasiado mayor")
    }
}