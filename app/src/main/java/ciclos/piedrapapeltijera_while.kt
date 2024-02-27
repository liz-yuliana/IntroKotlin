package ciclos

class piedrapapeltijera_while {
}

/*De acuerdo a la sintaxis vista, realice lo siguiente:
❑ Desarrolle un programa en kotlin que le permita generar la simulación
del juego piedra, papel o tijera (juego contra la máquina)
❑ Determine y muestre en pantalla el resultado del juego, si gana
alguien o hay empate. Preguntemos las veces maximas que quiera jugar
 el ususario si pierde vamos a restar un intento sino no resta*/


fun main(){

    println("Bienvenido al juego papel, piedra tijera\n" +
            "Cuantas vidas quieres para el juego: ")
    var vidas = readLine()!!.toInt()

    while (vidas != 0){

        println("1: piedra, 2:papel, 3:tijeras")
        var maquina:Int = (1..3).random()

        println("Que vas a jugar: ")
        var user = readLine()!!.toInt()

        if (maquina  == 1 && user == 1 || maquina  == 2 && user == 2 ||
            maquina  == 3 && user == 3){
            println("Empate")
        }else if (maquina  == 1 && user == 2 || maquina  == 2 && user == 3 ||
            maquina  == 3 && user == 1 ){
            println("Gana user")
        }else if(maquina  == 1 && user == 3 || maquina  == 3 && user == 2 ||
            maquina  == 2 && user == 1){
            println("Gana maquina")
            vidas = vidas-1
        }else{
            println("Se ingreso un número incorrecto, vuelve a intentar")
            var user = readLine()!!.toInt()
        }
    }
    println("Sin vidas gracias por jugar")
}