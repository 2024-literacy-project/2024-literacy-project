package com.romance.literacy_project.community.DTO;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


public class CommentDTO {
    private int comment_no;
    private int question_no;
    private String comment_txt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate comment_date;
    private String mem_nick;

    public CommentDTO() {
    }

    public CommentDTO(int comment_no, int question_no, String comment_txt, LocalDate comment_date, String mem_nick) {
        this.comment_no = comment_no;
        this.question_no = question_no;
        this.comment_txt = comment_txt;
        this.comment_date = comment_date;
        this.mem_nick = mem_nick;
    }

    public int getComment_no() {
        return comment_no;
    }

    public void setComment_no(int comment_no) {
        this.comment_no = comment_no;
    }

    public int getQuestion_no() {
        return question_no;
    }

    public void setQuestion_no(int question_no) {
        this.question_no = question_no;
    }

    public String getComment_txt() {
        return comment_txt;
    }

    public void setComment_txt(String comment_txt) {
        this.comment_txt = comment_txt;
    }

    public LocalDate getComment_date() {
        return comment_date;
    }

    public void setComment_date(LocalDate comment_date) {
        this.comment_date = comment_date;
    }

    public String getMem_nick() {
        return mem_nick;
    }

    public void setMem_nick(String mem_nick) {
        this.mem_nick = mem_nick;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "comment_no=" + comment_no +
                ", question_no=" + question_no +
                ", comment_txt='" + comment_txt + '\'' +
                ", comment_date=" + comment_date +
                ", mem_nick='" + mem_nick + '\'' +
                '}';
    }
}