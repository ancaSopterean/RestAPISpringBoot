package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter @NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String bookName;
    private String author;
    private String publisher;

    public Book(String bookName, String author, String publisher) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }
}
