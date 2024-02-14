package clase13_02_EstructurasAlgoritmicas

import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {
}

fun main(){

    println("Ingrese su primer número: ")
    var n1 = readLine()!!.toDouble()
    println("Ingrese su segundo número: ")
    var n2 = readLine()!!.toDouble()

    println("Que operación le gustaria realizar:" +
            "1. Suma" + "2. Resta" + "3. Multiplicación" + "4. División" + "5.Raíz" + "6.Potencia")
    var eleccion = readLine()!!.toInt()

    var suma = n1+n2
    var resta = n1 - n2
    var multiplicacion = n1*n2
    var division = n1/n2
    var raiz1 = sqrt(n1)
    var raiz2 = sqrt(n2)
    var potencia1 = n1.pow(n2)
    var potencia2 = n2.pow(n1)

    when(eleccion){
        1 -> println("La suma es $suma")
        2 -> println("La resta es $resta")
        3 -> println("La multiplicacion es $multiplicacion")
        4 -> println("La división es $division")
        5 -> println("La raiz del primer número es $raiz1 y la del segundo numero es $raiz2")
        6 -> println("La potencia del primer número al segundo es $potencia1 y la potenccia del segundo número al primero es $potencia2")
    }
}

