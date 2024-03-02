package com.example.homework;

public class CardModel {
    String text;
    String text2;
    int image;

    public CardModel(String text, int image) {
        this.text = text;
        this.text2=text2;
        this.image = image;
    }

    public String getText() {
        return text;
    }
    public String getText2() {
        return text2;
    }

    public int getImage() {
        return image;
    }
}