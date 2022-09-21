package com.example.demo.Book.dto;

import com.example.demo.Book.enums.CategoryType;
import lombok.Data;

@Data
public class BookSaveRequestDto {

    private String title;
    private String author;
    private CategoryType category;
    private Long quantity;

}

