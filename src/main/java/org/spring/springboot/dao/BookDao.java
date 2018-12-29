package org.spring.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.spring.springboot.domain.Book;

import java.util.List;

/**
 * Created by pj on 2018/12/26.
 */
@Mapper
public interface BookDao {
    @Select("SELECT b.*,bc.name bookCategory FROM book b LEFT OUTER JOIN book_category bc ON b.book_category_id = bc.id")
    List<Book> listAll();

    @Select("SELECT b.*,bc.name bookCategory FROM book b LEFT OUTER JOIN book_category bc ON b.book_category_id = bc.id WHERE b.name = #{name}")
    Book getBookByName(@Param("name") String name);


    @Select("SELECT b.*,bc.name bookCategory FROM book b LEFT OUTER JOIN book_category bc ON b.book_category_id = bc.id WHERE b.id = #{id}")
    Book getBookById(@Param("id") Integer id);

    @Select("INSERT INTO book (name,writer,introduction,book_category_id) VALUES (#{b.name},#{b.writer},#{b.introduction},#{b.bookCategoryID})")
    void insertBook(@Param("b")Book book);
}
