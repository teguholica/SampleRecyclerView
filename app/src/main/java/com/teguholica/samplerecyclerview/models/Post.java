package com.teguholica.samplerecyclerview.models;

public class Post {

    private String title;
    private String subTitle;

    public Post(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
