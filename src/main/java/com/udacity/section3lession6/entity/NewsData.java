package com.udacity.section3lession6.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "author",
        "content",
        "date",
        "imageUrl",
        "readMoreUrl",
        "time",
        "title",
        "url"
        })
@Generated("jsonschema2pojo")

public class NewsData {




    @JsonProperty("author")
    private String author;
    @JsonProperty("content")
    private String content;
    @JsonProperty("date")
    private String date;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("readMoreUrl")
    private String readMoreUrl;
    @JsonProperty("time")
    private String time;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("newsDataList")
    private List<NewsData> newsDataList;

    public NewsData() {
    }

    public NewsData(String author, String content, String date, String imageUrl, String readMoreUrl, String time, String title, String url) {
        this.author = author;
        this.content = content;
        this.date = date;
        this.imageUrl = imageUrl;
        this.readMoreUrl = readMoreUrl;
        this.time = time;
        this.title = title;
        this.url = url;
    }
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }
    @JsonProperty("content")
    public String getContent() {
        return content;
    }
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("readMoreUrl")
    public String getReadMoreUrl() {
        return readMoreUrl;
    }
    @JsonProperty("readMoreUrl")
    public void setReadMoreUrl(String readMoreUrl) {
        this.readMoreUrl = readMoreUrl;
    }
    @JsonProperty("time")
    public String getTime() {
        return time;
    }
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString(){
        return "{"+
                "author:"+getAuthor()+"\n"+
                "content:"+getContent()+"\n"+
                "date:"+getDate()+"\n"+
                "imageUrl:"+getImageUrl()+"\n"+
                "readMoreUrl:"+getReadMoreUrl()+"\n"+
                "time:"+getTime()+"\n"+
                "title:"+getTitle()+"\n"+
                "url:"+getUrl()+"\n"+
                "},";
    }
}

