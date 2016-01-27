package com.example.android.myfirstapplication.app.models;

/**
 * Created by Sunil Kumar on 24-12-2015.
 */
public class SampleModel {
    String SubTitle;
    String Title;
    int ImgSrc;

    public String getSubTitle() {
        return SubTitle;
    }

    public void setSubTitle(String subTitle) {
        SubTitle = subTitle;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public int getImgSrc() {
        return ImgSrc;
    }

    public void setImgSrc(int imgResId) {
        this.ImgSrc = imgResId;
    }
}
