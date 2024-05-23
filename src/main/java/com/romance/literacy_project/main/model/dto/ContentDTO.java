package com.romance.literacy_project.main.model.dto;

import java.util.Date;

public class ContentDTO {

    private String contents_topic;
    private String contents_txt;
    private Date date;

    public ContentDTO() {
    }

    public ContentDTO(String contents_topic, String contents_txt, Date date) {
        this.contents_topic = contents_topic;
        this.contents_txt = contents_txt;
        this.date = date;
    }

    public String getContents_topic() {
        return contents_topic;
    }

    public void setContents_topic(String contents_topic) {
        this.contents_topic = contents_topic;
    }

    public String getContents_txt() {
        return contents_txt;
    }

    public void setContents_txt(String contents_txt) {
        this.contents_txt = contents_txt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ContentDTO{" +
                "contents_topic='" + contents_topic + '\'' +
                ", contents_txt='" + contents_txt + '\'' +
                ", date=" + date +
                '}';
    }
}
