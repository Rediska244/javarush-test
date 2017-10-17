package com.javarush.rediska.service;

import com.javarush.rediska.model.Book;

import java.util.List;

public interface BookService {
    public Book getBookById(int id);
    public void createBook(Book book);
    public void readBook(Book book);
    public void deleteBook(int id);
    public void updateBook(Book book);
    public List<Book> listBook();
    public List<Book> listBookByPage(int page);
    public List<Book> searchBookByTitleAndAuthorAndYear(String title, String author, int year);
    public void makeRead(boolean isUpdate, Book book);
}
