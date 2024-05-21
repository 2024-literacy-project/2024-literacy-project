package com.romance.literacy_project.community.DTO;

import java.util.Date;

public class TestDTO {

    private String poem_title;
    private String poem_txt;
    private String poet;
    private Date date;

    public TestDTO() {
    }

    public TestDTO(String poem_title, String poem_txt, String poet, Date date) {
        this.poem_title = poem_title;
        this.poem_txt = poem_txt;
        this.poet = poet;
        this.date = date;
    }

    public String getPoem_title() {
        return poem_title;
    }

    public void setPoem_title(String poem_title) {
        this.poem_title = poem_title;
    }

    public String getPoem_txt() {
        return poem_txt;
    }

    public void setPoem_txt(String poem_txt) {
        this.poem_txt = poem_txt;
    }

    public String getPoet() {
        return poet;
    }

    public void setPoet(String poet) {
        this.poet = poet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "poem_title='" + poem_title + '\'' +
                ", poem_txt='" + poem_txt + '\'' +
                ", poet='" + poet + '\'' +
                ", date=" + date +
                '}';
    }
}