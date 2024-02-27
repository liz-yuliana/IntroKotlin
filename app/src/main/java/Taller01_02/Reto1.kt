package Taller01_02

class Reto1 {
}

fun main(){

    println("Cuantos mensajes ha recibido el usuario")
    var notificaciones = readLine()!!.toInt()

    if (notificaciones < 100){

        println("Sus notificaciones son $notificaciones")
    }else if (notificaciones > 100){
        println("+99")
    }else if(notificaciones == 0){
        println("No hay mensajes disponibles")
    }
}