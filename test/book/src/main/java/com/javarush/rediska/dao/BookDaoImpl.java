package com.javarush.rediska.dao;

import com.javarush.rediska.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by metib on 09.10.2017.
 */

@Repository
public class BookDaoImpl implements BookDao{
    private SessionFactory sessionFactory;
    private int pageSize = 10;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Book getBookById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Book book = (Book) session.get(Book.class, id);
        return book;
    }

    @Override
    public void createBook(Book book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(book);
    }

    @Override
    public void readBook(Book book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(book);
    }

    @Override
    public void deleteBook(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(getBookById(id));
    }

    @Override
    public void updateBook(Book book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(book);
    }

    @Override
    @SuppressWarnings("uncheked")
    public List<Book> listBook() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Book> listBook = session.createQuery("from Book").list();
        return listBook;
    }

    @Override
    public List<Book> listBookByPage(int page) {
        List<Book> list = listBook();
        return list.subList((page - 1 ) * pageSize, pageSize);
    }

    @Override
    @SuppressWarnings("uncheked")
    public List<Book> searchBookByTitleAndAuthorAndYear(String searchTitle, String searchAuthor, int searchYear) {
        Session session = sessionFactory.getCurrentSession();
        String sql = "from Book";
        if(searchTitle != null) sql = sql + " where title like '%" + searchTitle + "%'";
        if(searchAuthor != null) {
            if (sql.length() > 10) sql =  sql +"AND author like '%" + searchAuthor + "%'";
            else sql = sql + " where author like '%" + searchAuthor + "%'";
        }
        if(searchYear != 0){
            if (sql.length() > 10) sql =  sql +"AND printYear like " + searchYear;
            else sql = sql + " where printYear like " + searchYear;
        }

        List<Book> books =  session.createQuery(sql).list();
        return books;
    }

    @Override
    public void makeRead(boolean isUpdate, Book book) {
        Session session = this.sessionFactory.getCurrentSession();

        if (isUpdate)
            book.setReadAlready(false);
        else
            book.setReadAlready(true);
        session.update(book);
    }

}
