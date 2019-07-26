package com.pojo;

import java.io.Serializable;

public class Banners implements Serializable {

    private Long id;

    private String picture;

    private String compileby;

    private String url;

    private String state;

    private String create_at;

    private String update_at;

    public Banners(Long id, String picture, String compileby, String url, String state, String create_at, String update_at) {
        this.id = id;
        this.picture = picture;
        this.compileby = compileby;
        this.url = url;
        this.state = state;
        this.create_at = create_at;
        this.update_at = update_at;
    }

    public Banners() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCompileby() {
        return compileby;
    }

    public void setCompileby(String compileby) {
        this.compileby = compileby;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }
}
