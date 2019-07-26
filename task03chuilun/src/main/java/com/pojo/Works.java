package com.pojo;

import java.io.Serializable;

public class Works implements Serializable {

    private Long id;

    private String workname;

    private int parent_id;

    private String state;

    private String compileby;

    private String create_at;

    private String update_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCompileby() {
        return compileby;
    }

    public void setCompileby(String compileby) {
        this.compileby = compileby;
    }

    public Works() {
    }

    public Works(Long id, String workname, int parent_id, String state, String compileby, String create_at, String update_at) {
        this.id = id;
        this.workname = workname;
        this.parent_id = parent_id;
        this.state = state;
        this.compileby = compileby;
        this.create_at = create_at;
        this.update_at = update_at;
    }
}
