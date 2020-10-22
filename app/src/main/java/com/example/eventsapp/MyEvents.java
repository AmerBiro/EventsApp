package com.example.eventsapp;

public class MyEvents {

    private int event_logo;
    private String event_name, event_age;

    public MyEvents(int event_logo, String event_name, String event_age) {
        this.event_logo = event_logo;
        this.event_name = event_name;
        this.event_age = event_age;
    }

    public int getEvent_logo() {
        return event_logo;
    }

    public void setEvent_logo(int event_logo) {
        this.event_logo = event_logo;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getEvent_age() {
        return event_age;
    }

    public void setEvent_age(String event_age) {
        this.event_age = event_age;
    }
}
