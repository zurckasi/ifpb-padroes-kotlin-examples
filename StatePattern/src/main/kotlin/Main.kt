import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    var mario = Mario()
    println("Estado Inicial -> Mario Pequeno")
    TimeUnit.SECONDS.sleep(6L)
    mario.pegarCogumelo()
    TimeUnit.SECONDS.sleep(6L)
    mario.pegarPena()
    TimeUnit.SECONDS.sleep(6L)
    mario.levarDano()
    TimeUnit.SECONDS.sleep(6L)
    mario.pegarFlor()
    TimeUnit.SECONDS.sleep(6L)
    mario.pegarFlor()
    TimeUnit.SECONDS.sleep(6L)
    mario.levarDano()
    TimeUnit.SECONDS.sleep(6L)
    mario.levarDano()
    TimeUnit.SECONDS.sleep(6L)
    mario.pegarPena()
    TimeUnit.SECONDS.sleep(6L)
    mario.levarDano()
    TimeUnit.SECONDS.sleep(6L)
    mario.levarDano()
    TimeUnit.SECONDS.sleep(6L)
    mario.levarDano()
}