package com.example.demo.Book.controller;


import com.example.demo.Book.dto.BookSaveRequestDto;
import com.example.demo.Book.entity.Book;
import com.example.demo.Book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping()
    public ResponseEntity<List<Book>> findAll(){
        List<Book> bookList = bookService.findAll();
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        Book book = bookService.findById(id);
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody BookSaveRequestDto bookSaveRequestDto){
        Book book = bookService.save(bookSaveRequestDto);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }
}
