package estados
import MarioState
class MarioGrande : MarioState
{
    override fun pegarCogumelo(): MarioState {
        println("Mario -> GANHOU 1000 PONTOS")
        return this
    }

    override fun pegarFlor(): MarioState {
        println("Mario -> MARIO COM FOGO")
        return MarioFogo()
    }

    override fun pegarPena(): MarioState {
        println("Mario -> COM CAPA")
        return MarioCapa()
    }

    override fun levarDano(): MarioState {
        println("Mario -> PEQUENO")
        return MarioPequeno()
    }

}