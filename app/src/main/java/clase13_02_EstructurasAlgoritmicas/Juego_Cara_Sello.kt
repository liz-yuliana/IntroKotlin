package clase13_02_EstructurasAlgoritmicas

class Juego_Cara_Sello {
}

fun main(){

    println("Bienvenido al juego de cara o cruz\n" + "Cuantas veces quieres juegar cara o cruz: ")
    var juegos = readLine()!!.toInt()

    for (i in 1..juegos){
        var moneda:Int = (1..2).random()

        println("Escoge 1. Cara o 2. Sello")
        var eleccion = readLine()!!.toInt()

        if (eleccion == 1){
            println("Ganaste!!")
        }else if (eleccion == 2){
            println("Perdiste T-T")
        }else{
            println("Porfavor escoge entre 1 o 2")
        }
    }

    println("Gracias por juegar Cara o Sello")
}