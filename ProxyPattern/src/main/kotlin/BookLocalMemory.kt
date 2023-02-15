class BookLocalMemory : BookSearchInterface {
    private val itemList = mutableListOf<Book>()
    constructor(){
        this.itemList.add(Book("1","O pequeno principe"))
        this.itemList.add(Book("2","Harry Potter"))
        this.itemList.add(Book("3","Game of thrones"))
        this.itemList.add(Book("4","A ultima busca de Gilgamesh"))
        this.itemList.add(Book("5","O Poder do habito"))
        this.itemList.add(Book("6","Biblioteca da meia noite"))
        this.itemList.add(Book("7","Antes que o cafe esfrie"))
        this.itemList.add(Book("8","Senhor dos Aneis"))
        this.itemList.add(Book("9","O homem de giz"))
        this.itemList.add(Book("10","O peregrino"))
    }

    override fun pesquisarLivro(isbn: String): Book {
        for(book in itemList){
            if(book.isbn.equals(isbn)) return book
        }
        return Book("","")
    }
}