package com.chocksaway.controllers;

import com.chocksaway.entity.Book;
import com.chocksaway.entity.SimpleBook;
import com.chocksaway.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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