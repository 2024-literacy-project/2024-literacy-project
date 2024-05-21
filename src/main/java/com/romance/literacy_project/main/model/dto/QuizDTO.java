package com.romance.literacy_project.main.model.dto;

import java.util.Date;

public class QuizDTO {

    private String quiz_question;
    private String quiz_select1;
    private String quiz_select2;
    private String quiz_answer;
    private String quiz_user_answer;
    private Date date;

    public QuizDTO() {
    }

    public QuizDTO(String quiz_question, String quiz_select1, String quiz_select2, String quiz_answer, String quiz_user_answer, Date date) {
        this.quiz_question = quiz_question;
        this.quiz_select1 = quiz_select1;
        this.quiz_select2 = quiz_select2;
        this.quiz_answer = quiz_answer;
        this.quiz_user_answer = quiz_user_answer;
        this.date = date;
    }

    public String getQuiz_question() {
        return quiz_question;
    }

    public void setQuiz_question(String quiz_question) {
        this.quiz_question = quiz_question;
    }

    public String getQuiz_select1() {
        return quiz_select1;
    }

    public void setQuiz_select1(String quiz_select1) {
        this.quiz_select1 = quiz_select1;
    }

    public String getQuiz_select2() {
        return quiz_select2;
    }

    public void setQuiz_select2(String quiz_select2) {
        this.quiz_select2 = quiz_select2;
    }

    public String getQuiz_answer() {
        return quiz_answer;
    }

    public void setQuiz_answer(String quiz_answer) {
        this.quiz_answer = quiz_answer;
    }

    public String getQuiz_user_answer() {
        return quiz_user_answer;
    }

    public void setQuiz_user_answer(String quiz_user_answer) {
        this.quiz_user_answer = quiz_user_answer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "QuizDTO{" +
                "quiz_question='" + quiz_question + '\'' +
                ", quiz_select1='" + quiz_select1 + '\'' +
                ", quiz_select2='" + quiz_select2 + '\'' +
                ", quiz_answer='" + quiz_answer + '\'' +
                ", quiz_user_answer='" + quiz_user_answer + '\'' +
                ", date=" + date +
                '}';
    }

}
