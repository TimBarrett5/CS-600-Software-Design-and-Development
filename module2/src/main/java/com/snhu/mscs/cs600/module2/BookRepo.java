package com.snhu.mscs.cs600.module2;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepo extends JpaRepository<Book, Integer> {
    /** findBooks finds all books in DB using SQL query
     * @return list of all book records
     * Created by Tim Barrett
     **/
    @Query(
        nativeQuery = true,
        value = "SELECT id,title,author,year FROM books"
    )
    List<Book> findBooks();
}
