package com.enigma;

import java.util.ArrayList;
import java.util.List;

public class Rotor {
    private List<String> dictionary;
    private int currentIndex;
    private String changeWord;

    public Rotor() {
        dictionary = new ArrayList<>();
        currentIndex = 0;
        changeWord = "W";

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            this.dictionary.add(String.valueOf(ch));
        }

    }
    public boolean rotateRotor() {
        if (this.currentIndex != dictionary.size()-1) {
            this.currentIndex++;

        }
        else {
            this.currentIndex = 0;
        }

        return dictionary.get(currentIndex) == changeWord;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public void setChangeWord(String changeWord) {
        this.changeWord = changeWord;
    }
}
