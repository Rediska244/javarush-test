package com.javarush.rediska.service;

import com.javarush.rediska.dao.BookDao;
import com.javarush.rediska.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public void createBook(Book book) {
        this.bookDao.createBook(book);
    }

    @Override
    @Transactional
    public void readBook(Book book) {
        this.bookDao.readBook(book);
    }

    @Override
    @Transactional
    public void deleteBook(int id) {
        this.bookDao.deleteBook(id);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public List<Book> listBook() {
        return this.bookDao.listBook();
    }

    @Override
    @Transactional
    public List<Book> listBookByPage(int page) {
        return this.bookDao.listBookByPage(page);
    }

    @Override
    @Transactional
    public List<Book> searchBookByTitleAndAuthorAndYear(String title, String author, int year) {
        return this.bookDao.searchBookByTitleAndAuthorAndYear(title, author, year);
    }

    @Override
    @Transactional
    public void makeRead(boolean isUpdate, Book book) {
        this.bookDao.makeRead(isUpdate, book);
    }

}
