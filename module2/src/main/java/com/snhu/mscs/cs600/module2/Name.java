package com.snhu.mscs.cs600.module2;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The Name Entity class maps names from the table in the database
 * Created by Tim Barrett 
 **/

 @Entity
 @Table(name = "names")
public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String first;
    private String middle;
    private String last;
    private String suffix;

    protected Name() { }

    public Long getId() { return id; }
    public String getFirst() { return first; }
    public String fetMiddle() { return middle; }
    public String getLast() { return last; }
    public String getSuffix() { return suffix; }
}
