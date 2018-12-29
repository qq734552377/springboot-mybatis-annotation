package org.spring.springboot.domain;

/**
 * Created by pj on 2018/12/26.
 */

public class Book {
    private int id ;
    private String name;
    private String writer;
    private String introduction;
    private String bookCategory;
    private int book_category_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public int getBook_category_id() {
        return book_category_id;
    }

    public void setBook_category_id(int book_category_id) {
        this.book_category_id = book_category_id;
    }
}
