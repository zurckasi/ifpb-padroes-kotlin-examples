class BookCacheLocalMemory : BookSearchInterface{
    private var local:BookSearchInterface
    private val cacheList = mutableListOf<Book>()

    constructor(base :BookSearchInterface){
        this.local = base
    }

    override fun pesquisarLivro(isbn: String): Book {
        for(book in cacheList){
            if(book.isbn.equals(isbn)){
                println("Livro encontrado no BookProxyLibrary")
                return book
            }
        }
        println("Buscando pelo livro no BookBaseLibrary")
        var searchLocal : Book = local.pesquisarLivro(isbn)
        if(!searchLocal.isbn.equals("")){
            println("Livro encontrado no BookBaseLibrary")
            this.cacheList.add(searchLocal)
        }else{
            println("Livro nao encontrado")
        }
        return searchLocal
    }
}