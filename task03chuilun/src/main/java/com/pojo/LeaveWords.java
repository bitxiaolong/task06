package com.pojo;


import java.io.Serializable;

public class LeaveWords implements Serializable {

    private Long id;

    private Long work_id;

    private String leaveword;

    private String state;

    private String compileby;

    private String create_at;

    private String update_at;

    private String nickname;

    private Long parent_id;

    public LeaveWords() {
    }

    public LeaveWords(Long id, Long work_id, String leaveword, String state, String compileby, String create_at, String update_at, String nickname, Long parent_id) {
        this.id = id;
        this.work_id = work_id;
        this.leaveword = leaveword;
        this.state = state;
        this.compileby = compileby;
        this.create_at = create_at;
        this.update_at = update_at;
        this.nickname = nickname;
        this.parent_id = parent_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWork_id() {
        return work_id;
    }

    public void setWork_id(Long work_id) {
        this.work_id = work_id;
    }

    public String getLeaveword() {
        return leaveword;
    }

    public void setLeaveword(String leaveword) {
        this.leaveword = leaveword;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }
}
