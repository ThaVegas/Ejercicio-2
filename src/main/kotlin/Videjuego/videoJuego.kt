package Videjuego

import Interfaces.Entregable

class videoJuego : Entregable {

    var tituloVJ : String = ""
    var hEstimadas : Int = 10
    var entregadoVJ : Boolean = false
    var genero : String = ""
    var compania : String = ""


    constructor(){}//Constructor por defecto

    constructor(tituloVJ_V : String,hEstimadas_V : Int ){
        this.tituloVJ = tituloVJ_V
        this.hEstimadas = hEstimadas_V
    }

    constructor(tituloVJ: String, hEstimadas: Int, genero: String, compania: String) {
        this.tituloVJ = tituloVJ
        this.hEstimadas = hEstimadas
        this.genero = genero
        this.compania = compania
    }
//-------------------------- Implementacion de metodos de la interface

    override fun entregar() {
        this.entregadoVJ = true
    }

    override fun devolver() {
        this.entregadoVJ = false
    }

    override fun isEntregado(): Boolean {
        return entregadoVJ
    }

}