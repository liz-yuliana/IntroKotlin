package com.example.introkotlin.IntroduccionKotlin_y_Retos

class Introduccion {
}

fun main(){

    print("Hola")
    println("Hola Liz")

    val name : String= "Liz"

    print("El nombre es $name \n")

    println("Ingrese su edad")
    var edad = readLine() !!.toInt()
    println("Ingrese su apellido")

    var apellido = readLine()!!.toString()

    println("La edad es $edad \n")
    println("Su apellido es $apellido \n")
}