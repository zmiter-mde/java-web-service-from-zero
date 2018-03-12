package com.zmiter.test.posters.entity;

import java.io.Serializable;

public class Poster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public Poster(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Poster(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
