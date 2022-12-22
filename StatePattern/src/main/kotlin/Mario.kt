import estados.MarioPequeno
class Mario {
    var estado : MarioState
    constructor(){
        estado = MarioPequeno()
    }

    fun pegarCogumelo(){
        estado = estado.pegarCogumelo()
    }

    fun pegarFlor(){
        estado = estado.pegarFlor()
    }

    fun pegarPena(){
        estado = estado.pegarPena()
    }

    fun levarDano(){
        estado = estado.levarDano()
    }
}
