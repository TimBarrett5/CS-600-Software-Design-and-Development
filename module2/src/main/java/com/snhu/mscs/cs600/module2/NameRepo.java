package com.snhu.mscs.cs600.module2;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Name repo is the interface for the name entity
 * Created by Tim Barrett
 **/

public interface NameRepo extends JpaRepository<Name, Long> {
    /**@Query string of query for the DB
     * @return list of all name records
     */
    @Query(
        nativeQuery = true,
        value = "SELECT id,first,middle,last,suffix FROM books"
    ) 
    List<Name> findNames();
    List<Name> findByLast(String last);
}
