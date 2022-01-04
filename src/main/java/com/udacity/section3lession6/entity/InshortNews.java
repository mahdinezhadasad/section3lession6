package com.udacity.section3lession6.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "category",
        "newsDataList",
        "success"
})
@Generated("jsonschema2pojo")
public class InshortNews {



    @JsonProperty("category")
    private String category;
    @JsonProperty("newsDataList")
    private NewsDataList newsDataList;
    @JsonProperty("success")
    private String success;

    public InshortNews() {
    }

    public InshortNews(String category, NewsDataList newsDataList, String success) {
        this.category = category;
        this.newsDataList = newsDataList;
        this.success = success;
    }
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }
    @JsonProperty("newsDataList")
    public NewsDataList getNewsDataList() {
        return newsDataList;
    }
    @JsonProperty("newsDataList")
    public void setNewsDataList(NewsDataList newsDataList) {
        this.newsDataList = newsDataList;
    }
    @JsonProperty("success")
    public String getSuccess() {
        return success;
    }
    @JsonProperty("success")
    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("{").append("\n")
                .append("category:").append(getCategory()).append(",").append("\n")
                .append("data:[").append("\n")
               .append(getNewsDataList().toString()).append("\n")
                .append("],").append("\n")
                .append("success:").append(getSuccess());

        return sb.toString();
    }

}
