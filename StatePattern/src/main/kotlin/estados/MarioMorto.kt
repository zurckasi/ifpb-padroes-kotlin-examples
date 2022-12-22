package estados
import MarioState

class MarioMorto : MarioState
{
    override fun pegarCogumelo(): MarioState {
        return this
    }

    override fun pegarFlor(): MarioState {
        return this
    }

    override fun pegarPena(): MarioState {
        return this
    }

    override fun levarDano(): MarioState {
        return this
    }
}