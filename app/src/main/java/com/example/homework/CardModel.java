package com.example.homework;

public class CardModel {
    String text;
    int image;

    public CardModel(String text, int image) {
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }
}