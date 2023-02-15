fun main(args: Array<String>) {
    var blm = BookLocalMemory()
    var bclm = BookCacheLocalMemory(blm)
    var view = View(bclm)
    view.pesquisarPorLivro("1")
    view.pesquisarPorLivro("10")
    view.pesquisarPorLivro("1")
    view.pesquisarPorLivro("11")

}