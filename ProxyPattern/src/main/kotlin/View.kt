class View {
    private var cache: BookCacheLocalMemory
    constructor(proxy : BookCacheLocalMemory){
        this.cache = proxy
    }

    fun pesquisarPorLivro(isbn:String){
        println(this.cache.pesquisarLivro(isbn).titulo)
    }
}