package com.example.ffst;

public class ChatData {
    private String id;
    private String msg;
    private String nickname;

    public ChatData() {

    }

    public ChatData(String id, String msg, String nickname) {
        this.id = id;
        this.msg = msg;
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
