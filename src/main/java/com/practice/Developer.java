package com.practice;

import java.util.HashSet;
import java.util.Set;

public class Developer {

    private Integer id;
    private String name;
    private Set<String> book;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String> getBook() {
        return book;
    }



    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

}
