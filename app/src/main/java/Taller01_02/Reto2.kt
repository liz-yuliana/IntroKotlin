package Taller01_02

class Reto2 {
}

fun main(){

    var Bones = Cancion("Bones", "Imagine Dragons", 2022, 144990004)

    var Album = Album()
    println(Album.agregar_cancion(Bones))
    Album.canciones_totales()
    Album.espeficacion_canciones()
}


class Album {

    var canciones = mutableListOf<Cancion>()

    fun canciones_totales():Int{

        var total = canciones.size
        return total
    }
    fun agregar_cancion(cancion:Cancion):String.Companion{
        canciones.add(cancion)
        return cancion.titulo
    }

    fun espeficacion_canciones(){

        for (i in 0..canciones.size){
            println( "titulo : ${canciones[i].titulo}, Interpretada por: ${canciones[i].artista}, se lanzo en: ${canciones[i].año_publicacion}, cantidad de reproducciones: ${canciones[i].reproducciones}")
        }

    }
}

class Cancion (titulo:String, artista:String, año_publicacion:Int, reproducciones:Int){

    var titulo = String
    var artista = String
    var año_publicacion = Int
    var reproducciones = Int
}