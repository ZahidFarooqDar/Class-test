package com.zahid.mapping.repository;

import com.zahid.mapping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
