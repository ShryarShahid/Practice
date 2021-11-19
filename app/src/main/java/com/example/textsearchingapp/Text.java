package com.example.textsearchingapp;

public class Text {
    String [] text = {
            "Hello",
            "How are you?",
            "What are you doing?",
            "What would you like to eat?",
            "What are your hobbies"
    };

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }
}
