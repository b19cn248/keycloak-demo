package com.lawman.keycloakdemo.controller;

import com.lawman.keycloakdemo.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

  private List<Book> books = new ArrayList<>(List.of(
        new Book("1", "Book 1", "Author 1", "Description 1"),
        new Book("2", "Book 2", "Author 2", "Description 2"),
        new Book("3", "Book 3", "Author 3", "Description 3")
  ));

  @PostMapping
  public Book create(@RequestBody Book book) {
    books.add(book);
    return book;
  }

  @GetMapping
  public List<Book> findAll() {
    return books;
  }

  @GetMapping("/{id}")
  public Book detail(String id) {
    return books.stream()
          .filter(book -> book.getId().equals(id))
          .findFirst()
          .orElse(null);
  }

}
