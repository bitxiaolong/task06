package com.pojo;

import java.io.Serializable;

public class FirstAndSecond implements Serializable {

    private Long id;

    private String name;

    private Long parent_id;

    private String state;

    private String compileby;

    private String create_at;

    private String update_at;

    private String introduce;

    private String url;

    private String article;

    public FirstAndSecond(Long id, String name, Long parent_id, String state, String compileby, String create_at, String update_at, String introduce, String url, String article) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
        this.state = state;
        this.compileby = compileby;
        this.create_at = create_at;
        this.update_at = update_at;
        this.introduce = introduce;
        this.url = url;
        this.article = article;
    }

    public FirstAndSecond() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public String getCompileby() {
        return compileby;
    }

    public void setCompileby(String compileby) {
        this.compileby = compileby;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
