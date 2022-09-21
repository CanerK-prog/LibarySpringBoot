package com.example.demo.Book.service;

import com.example.demo.Book.dao.BookDAO;
import com.example.demo.Book.dto.BookSaveRequestDto;
import com.example.demo.Book.entity.Book;
import com.example.demo.Member.dao.MemMemberDAO;
import com.example.demo.Member.dto.MemMemberSaveRequestDto;
import com.example.demo.Member.enums.MemMemberType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookDAO bookDAO;

    public List<Book> findAll() {
        List<Book> bookList = bookDAO.findAll();
        return bookList;
    }

    public Book findById(Long id) {
        Book book = bookDAO.findById(id).orElseThrow();
        return book;
    }

    public Book save(BookSaveRequestDto bookSaveRequestDto) {
        Book book = new Book();
        book.setTitle(bookSaveRequestDto.getTitle());
        book.setAuthor(bookSaveRequestDto.getAuthor());
        book.setCategory(bookSaveRequestDto.getCategory());
        book.setQuantity(bookSaveRequestDto.getQuantity());

        book = bookDAO.save(book);
        return book;
    }

    public void delete(Long id) {
        bookDAO.deleteById(id);
    }
}
