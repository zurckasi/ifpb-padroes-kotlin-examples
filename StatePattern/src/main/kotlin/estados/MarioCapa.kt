package estados
import MarioState

class MarioCapa : MarioState
{
    override fun pegarCogumelo(): MarioState {
        println("Mario -> GANHOU 1000 PONTOS")
        return this
    }

    override fun pegarFlor(): MarioState {
        println("Mario -> COM FOGO")
        return MarioFogo()
    }

    override fun pegarPena(): MarioState {
        println("Mario -> GANHOU 1000 PONTOS")
        return this
    }

    override fun levarDano(): MarioState {
        println("Mario -> GRANDE")
        return MarioGrande()
    }
}