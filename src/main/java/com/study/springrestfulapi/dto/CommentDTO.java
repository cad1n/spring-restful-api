package com.study.springrestfulapi.dto;

import java.io.Serial;
import java.io.Serializable;

public class CommentDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String text;
    private String date;

    private AuthorDTO author;

    public CommentDTO() {
    }

    public CommentDTO(String text, String date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
