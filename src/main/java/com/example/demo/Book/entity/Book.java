package com.example.demo.Book.entity;


import com.example.demo.Book.enums.CategoryType;
import com.example.demo.Member.enums.MemMemberType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "BOOK")
@Getter @Setter
public class Book {

    @Id
    @SequenceGenerator(name = "Book", sequenceName = "BOOK_ID_SEQ")
    @GeneratedValue(generator = "Book")
    private Long id;

    @Column(name = "TITLE", length = 40, nullable = false)
    private String title;

    @Column(name = "AUTHOR", length = 40, nullable = false)
    private String author;

    @Column(name = "QUANTITY")
    private Long quantity;

    @Column(name = "CATEGORY", length = 40)
    @Enumerated(EnumType.STRING)
    private CategoryType category;

}
