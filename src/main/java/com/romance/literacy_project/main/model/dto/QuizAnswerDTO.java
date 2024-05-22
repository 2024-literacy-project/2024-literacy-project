package com.romance.literacy_project.main.model.dto;

import java.util.Date;

public class QuizAnswerDTO {

    private String selected_option;
    private Boolean is_correct;
    private String mem_nick;
    private Date date;

    public QuizAnswerDTO() {
    }

    public QuizAnswerDTO(String selected_option, Boolean is_correct, String mem_nick, Date date) {
        this.selected_option = selected_option;
        this.is_correct = is_correct;
        this.mem_nick = mem_nick;
        this.date = date;
    }

    public String getSelected_option() {
        return selected_option;
    }

    public void setSelected_option(String selected_option) {
        this.selected_option = selected_option;
    }

    public Boolean getIs_correct() {
        return is_correct;
    }

    public void setIs_correct(Boolean is_correct) {
        this.is_correct = is_correct;
    }

    public String getMem_nick() {
        return mem_nick;
    }

    public void setMem_nick(String mem_nick) {
        this.mem_nick = mem_nick;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "QuizAnswerDTO{" +
                "selected_option='" + selected_option + '\'' +
                ", is_correct=" + is_correct +
                ", mem_nick='" + mem_nick + '\'' +
                ", date=" + date +
                '}';
    }
}
