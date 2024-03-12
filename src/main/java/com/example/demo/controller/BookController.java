package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping()
    public ResponseEntity<List<Book>> findAll(){
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Book> save(@RequestBody Book book){
        return new ResponseEntity<>(bookService.add(book),HttpStatus.CREATED);
    }
}
