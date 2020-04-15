package com.example.listviewimage;

public class ContactModel {
    String name;
    String content;
    boolean isSelected;
    String date;

    public ContactModel(String name, String date, String content) {
        this.name = name;
        this.content = content;
        this.date = date;
        this.isSelected = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }




}
