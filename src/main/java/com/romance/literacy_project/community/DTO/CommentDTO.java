package com.romance.literacy_project.community.DTO;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


public class CommentDTO {
    private int commentNo;
    private int question_no;
    private String comment_txt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate question_date;
    private String mem_nick;

    public CommentDTO() {
    }

    public CommentDTO(int commentNo, int question_no, String comment_txt, LocalDate question_date, String mem_nick) {
        this.commentNo = commentNo;
        this.question_no = question_no;
        this.comment_txt = comment_txt;
        this.question_date = question_date;
        this.mem_nick = mem_nick;
    }

    public int getCommentNo() {
        return commentNo;
    }

    public void setCommentNo(int commentNo) {
        this.commentNo = commentNo;
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

    public LocalDate getQuestion_date() {
        return question_date;
    }

    public void setQuestion_date(LocalDate question_date) {
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
        return "CommentDTO{" +
                "commentNo=" + commentNo +
                ", question_no=" + question_no +
                ", comment_txt='" + comment_txt + '\'' +
                ", question_date=" + question_date +
                ", mem_nick='" + mem_nick + '\'' +
                '}';
    }
}
