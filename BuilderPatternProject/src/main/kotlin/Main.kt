fun main(args: Array<String>) {
    val refeicaoBuilder = RefeicaoBuilder()

    val refeicaoVegetariana = refeicaoBuilder.prepararRefeicaoVegetariana()
    println("Refeição Vegetariana")
    refeicaoVegetariana.mostrarItens()
    println("Custo total: ${refeicaoVegetariana.getCusto()}\n")

    val refeicaoNaoVegetariana = refeicaoBuilder.prepararRefeicaoNaoVegetariana()
    println("Refeição Não Vegetariana")
    refeicaoNaoVegetariana.mostrarItens()
    println("Custo total: ${refeicaoNaoVegetariana.getCusto()}")
}