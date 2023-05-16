package com.zahid.mapping.service;

import com.zahid.mapping.model.Book;
import com.zahid.mapping.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book create(Book book) {
        return bookRepository.save(book);
    }

    public Book read(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public Book update(Book book) {
        return bookRepository.save(book);
    }
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
