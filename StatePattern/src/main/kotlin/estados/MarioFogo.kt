package estados
import MarioState

class MarioFogo : MarioState
{
    override fun pegarCogumelo(): MarioState {
        println("Mario -> GANHOU 1000 PONTOS")
        return this
    }

    override fun pegarFlor(): MarioState {
        println("Mario -> GANHOU 1000 PONTOS")
        return this
    }

    override fun pegarPena(): MarioState {
        println("Mario -> COM CAPA")
        return MarioCapa()
    }

    override fun levarDano(): MarioState {
        println("Mario -> GRANDE")
        return MarioGrande()
    }
}