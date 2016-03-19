package org.test.bookpub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.test.bookpub.entity.Book;
import org.test.bookpub.entity.SimpleBook;
import org.test.bookpub.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/{isbn}", method =
            RequestMethod.GET)
    public Book getBook(@PathVariable String isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postBook(@RequestBody SimpleBook simpleBook) {
        return "Hello";
    }


    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound() {
        return "Not Foud";
    }
}