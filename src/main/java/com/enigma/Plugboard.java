package com.enigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Plugboard {
    private List<Character> etw;
    private List<Character> plugboardAlphabet;

    public Plugboard() {
        this.etw = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));
        this.plugboardAlphabet = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));
    }

    public void addPlugboard(char chr1, char chr2) {
        int index1 = this.plugboardAlphabet.indexOf(chr1);
        int index2 = this.plugboardAlphabet.indexOf(chr2);
        Collections.swap(this.plugboardAlphabet, index1, index2);
    }

    public void deletePlugboard(char chr) {
        int index1 = this.plugboardAlphabet.indexOf(chr);
        int index2 = this.etw.indexOf(chr);
        Collections.swap(this.plugboardAlphabet, index1, index2);
    }

    public char processIn(char input) {
        int indexInput = this.etw.indexOf(input);
        char match = this.plugboardAlphabet.get(indexInput);

        return match;
    }

    public char processOut(char input) {
        int indexInput = this.etw.indexOf(input);
        char match = this.plugboardAlphabet.get(indexInput);

        return match;
    }
}
