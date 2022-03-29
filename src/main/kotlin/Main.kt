import Series.Serie
import Videjuego.videoJuego

fun main(args: Array<String>) {

var SeriesV = arrayOf<Serie>()
var videoJuegoV = arrayOf<videoJuego>()



    //Vectores de series
    val Serie1 = Serie("Rurouni Kenshin: Meiji Swordsman Romantic Story",5,"Anime","Nobuhiro Watsuki")
    val Serie2 = Serie("Arcane",1,"Ciencia Ficcion","Christian Linke & Alex Yee")
    val Serie3 = Serie("Dr House",8,"Drama","David Shore")
    val Serie4 = Serie("Gotham",5,"Ciencia Ficcion","Bruno Heller")
    val Serie5 = Serie("Superman & Lois",2,"Greg Berlanti","Nobuhiro Watsuki")

    //Vectores de juegos
    val VJ1 = videoJuego("Metal Gear Solid: Peace Walker", 20, "Sigilo", "Konami")
    val VJ2 = videoJuego("God Of War", 28, "Accion y Aventura", "Santa Monica")
    val VJ3 = videoJuego("Valorant", 20, "Multiplayer", "Riot Company")
    val VJ4 = videoJuego("Need For Speed: Heat", 35, "Carreras", "EA Games")
    val VJ5 = videoJuego("Horizon Zero Dawn", 40, "Accion y Aventura", "Guerrilla")

    SeriesV = SeriesV.plus(Serie1)
    SeriesV = SeriesV.plus(Serie2)
    SeriesV = SeriesV.plus(Serie3)
    SeriesV = SeriesV.plus(Serie4)
    SeriesV = SeriesV.plus(Serie5)
    //---------------------------
    videoJuegoV = videoJuegoV.plus(VJ1)
    videoJuegoV = videoJuegoV.plus(VJ2)
    videoJuegoV = videoJuegoV.plus(VJ3)
    videoJuegoV = videoJuegoV.plus(VJ4)
    videoJuegoV = videoJuegoV.plus(VJ5)

        //Entregar Series
        Serie1.entregar()
        Serie2.entregar()
        Serie3.entregar()
        Serie4.entregar()
        Serie5.entregar()
        //Entregar VideoJuegos
        VJ1.entregar()
        VJ2.entregar()
        VJ3.entregar()
        VJ4.entregar()

        //------------------- Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
        var contSeries = 0
        var contJuegos = 0

    for(i in SeriesV.indices){
       if (SeriesV[i].isEntregado()){
         contSeries++
       }

    }
    println("Series entregadas:" + contSeries)


    for (i in videoJuegoV.indices){
        if (videoJuegoV[i].isEntregado()){
            contJuegos++
        }

    }
    println("Juegos entregadas:" + contJuegos)
}