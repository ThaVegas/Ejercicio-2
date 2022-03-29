package Series

import Interfaces.Entregable

class Serie : Entregable{

   var titulo : String = ""
    var numTemporadas : Int = 0
    var entregado : Boolean = false
    var genero : String = ""
    var creador : String = ""
    //----------------------------------

    constructor(){}//Constructor por defecto

   constructor(titulo_S : String, creador_S : String){ //Constructor con titulo y creador
    this.titulo = titulo_S
    this.creador = creador_S
   }

    constructor(titulo_S: String, numTemporadas_s: Int, genero_s: String, creador_S: String) {
        this.titulo = titulo_S
        this.numTemporadas = numTemporadas_s
        this.genero = genero_s
        this.creador = creador_S
    }
    //-------------------------- Implementacion de metodos de la interface
    override fun entregar() {
        this.entregado = true
    }

    override fun devolver() {
        this.entregado = false
    }

    override fun isEntregado(): Boolean {
       return entregado
    }


}