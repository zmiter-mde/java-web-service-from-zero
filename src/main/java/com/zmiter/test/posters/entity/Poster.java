package com.zmiter.test.posters.entity;

import java.io.Serializable;

public class Poster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String filename;
    private byte[] image;

    public Poster(Integer id, String filename, byte[] image) {
        this.id = id;
        this.filename = filename;
        this.image = image;
    }

    public Poster(Integer id, String filename) {
        this.id = id;
        this.filename = filename;
    }

    public Poster(String filename, byte[] image) {
        this.filename = filename;
        this.image = image;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
