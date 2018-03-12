package com.zmiter.test.posters.entity;

import java.io.Serializable;

public class Poster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String filename;

    public Poster(Integer id, String filename) {
        this.id = id;
        this.filename = filename;
    }

    public Poster(String filename) {
        this.filename = filename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
