package com.romance.literacy_project.community.DTO;

import java.util.Date;

public class CmuDTO {


    private int question_no;

    private String question_title;

    private String question_txt;

    private Date question_date;

    private String mem_nick;

    public CmuDTO() {
    }

    public CmuDTO(int question_no, String question_title, String question_txt, Date question_date, String mem_nick) {
        this.question_no = question_no;
        this.question_title = question_title;
        this.question_txt = question_txt;
        this.question_date = question_date;
        this.mem_nick = mem_nick;
    }

    public int getQuestion_no() {
        return question_no;
    }

    public void setQuestion_no(int question_no) {
        this.question_no = question_no;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }

    public String getQuestion_txt() {
        return question_txt;
    }

    public void setQuestion_txt(String question_txt) {
        this.question_txt = question_txt;
    }

    public Date getQuestion_date() {
        return question_date;
    }

    public void setQuestion_date(Date question_date) {
        this.question_date = question_date;
    }

    public String getMem_nick() {
        return mem_nick;
    }

    public void setMem_nick(String mem_nick) {
        this.mem_nick = mem_nick;
    }

    @Override
    public String toString() {
        return "CmuDTO{" +
                "question_no=" + question_no +
                ", question_title='" + question_title + '\'' +
                ", question_txt='" + question_txt + '\'' +
                ", question_date=" + question_date +
                ", mem_nick='" + mem_nick + '\'' +
                '}';
    }
}
