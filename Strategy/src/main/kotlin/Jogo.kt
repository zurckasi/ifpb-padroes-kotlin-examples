class Jogo
{
    private var strategy : Strategy

    constructor(){
        strategy = Facil()
    }

    fun setStrategy(nivelEscolhido: Strategy){
        strategy = nivelEscolhido
    }

    fun jogar(){
        strategy.definir()
    }
}