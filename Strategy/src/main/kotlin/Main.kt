import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    var cs = Jogo()
    cs.jogar()

    cs.setStrategy(Dificil())
    TimeUnit.SECONDS.sleep(6L)
    cs.jogar()
    cs.setStrategy(Experiente())
    TimeUnit.SECONDS.sleep(6L)
    cs.jogar()
}