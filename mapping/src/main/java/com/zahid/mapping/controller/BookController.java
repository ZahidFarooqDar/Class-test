package com.zahid.mapping.controller;

import com.zahid.mapping.model.Book;
import com.zahid.mapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("")
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    @GetMapping("/{id}")
    public Book read(@PathVariable Long id) {
        return bookService.read(id);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        //book.setID(id);
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }

    @GetMapping("")
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
