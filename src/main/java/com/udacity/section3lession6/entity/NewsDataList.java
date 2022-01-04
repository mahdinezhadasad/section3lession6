package com.udacity.section3lession6.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsDataList {
    @JsonProperty("newsDataList")
    private List<NewsData> newsDataList;

    @JsonProperty("newsDataList")
    public List<NewsData> getNewsDataList() {
        return newsDataList;
    }
    @JsonProperty("newsDataList")
    public void setNewsDataList(NewsData newsData) {
        newsDataList.add(newsData);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (NewsData data : getNewsDataList()){
            sb.append(data.toString()).append("\n");
        }

        return sb.toString();
    }
}
