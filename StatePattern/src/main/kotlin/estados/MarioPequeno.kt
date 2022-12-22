package estados
import MarioState
class MarioPequeno : MarioState
{
    override fun pegarCogumelo(): MarioState {
        println("Mario -> GRANDE")
        return MarioGrande()
    }

    override fun pegarFlor(): MarioState {
        println("Mario -> GRANDE COM FOGO")
        return MarioFogo()
    }

    override fun pegarPena(): MarioState {
        println("Mario -> GRANDE COM CAPA")
        return MarioCapa()
    }

    override fun levarDano(): MarioState {
        println("Mario -> MORTO")
        return MarioMorto()
    }
}