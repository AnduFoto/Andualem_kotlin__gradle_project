package org.dbu.library.ui

import org.dbu.library.model.Book
import org.dbu.library.model.Patron
import org.dbu.library.service.LibraryService
import org.dbu.library.util.display

class MenuHandler(private val service: LibraryService) {

    fun addBook(book: Book) {
        service.addBook(book)
    }

    fun borrowBook(patronId: String, isbn: String) {
        service.borrowBook(patronId, isbn)
    }

    fun returnBook(patronId: String, isbn: String) {
        service.returnBook(patronId, isbn)
    }

    fun search(query: String): List<Book> {
        return service.search(query)
    }

    fun listAllBooks() {
        service.search("").forEach { println(it.display()) }
    }
}