package com.example.eventsapp;

public class MyChatWithPeople {
    int avatar;
    String name, lastMessage, latMessageDate;

    public MyChatWithPeople(int avatar, String name, String lastMessage, String latMessageDate) {
        this.avatar = avatar;
        this.name = name;
        this.lastMessage = lastMessage;
        this.latMessageDate = latMessageDate;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLatMessageDate() {
        return latMessageDate;
    }

    public void setLatMessageDate(String latMessageDate) {
        this.latMessageDate = latMessageDate;
    }
}
