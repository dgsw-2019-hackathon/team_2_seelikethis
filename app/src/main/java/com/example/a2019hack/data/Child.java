package com.example.a2019hack.data;

import android.graphics.Bitmap;
import android.net.Uri;

public class Child {

    private String childPhoto;

    private String childWeight;
    private String childHeight;

    private String childName;
    private String childSex;
    private String childPlace;
    private String childAge;

    public Child(String childPhoto, String childName, String childSex, String childPlace, String childAge, String childHeight, String childWeight) {

        this.childPhoto = childPhoto;
        this.childName = childName;
        this.childSex = childSex;
        this.childAge = childAge;
        this.childPlace = childPlace;
        this.childHeight = childHeight;
        this.childWeight = childWeight;
    }

    public String getChildPhoto() {

        return childPhoto;
    }

    public void setChildPhoto(String childPhoto) {

        this.childPhoto = childPhoto;
    }

    public String getChildHeight() {

        return childHeight;
    }

    public void setChildHeight(String childHeight) {

        this.childHeight = childHeight;
    }

    public String getChildWeight() {

        return childWeight;
    }

    public void setChildWeight(String childWeight) {

        this.childWeight = childWeight;
    }

    public String getChildName() {

        return childName;
    }

    public void setChildName(String childName) {

        this.childName = childName;
    }

    public String getChildSex() {

        return childSex;
    }

    public void setChildSex(String childSex) {

        this.childSex = childSex;
    }

    public String getChildPlace() {

        return childPlace;
    }

    public void setChildPlace(String childPlace) {

        this.childPlace = childPlace;
    }

    public String getChildAge() {

        return childAge;
    }

    public void setChildAge(String childAge) {

        this.childAge = childAge;
    }
}
