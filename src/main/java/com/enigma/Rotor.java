package com.enigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotor {
    private List<Character> etw;
    private List<Character> alphabetRing;
    private List<Character> rotorRing;
    private char turnOverChar;

    public Rotor(List<Character> rotorRing, char turnOverChar) {
        this.etw = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));
        this.alphabetRing = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));
        this.rotorRing = rotorRing;
        this.turnOverChar = turnOverChar;
    }

    public boolean rotateRotor() {
        // Advance next rotor boolean
        boolean rotateNext = this.alphabetRing.get(0) == this.turnOverChar;
        // Rotate the alphabet ring
        char tempAlphabet = this.alphabetRing.get(0);
        this.alphabetRing.remove(0);
        this.alphabetRing.add(tempAlphabet);
        // Rotate the rotor ring
        char tempRotor = this.rotorRing.get(0);
        this.rotorRing.remove(0);
        this.rotorRing.add(tempRotor);

        return rotateNext;
    }

    public char processIn(char input) {
        int indexInput = this.etw.indexOf(input);
        char match = this.rotorRing.get(indexInput);
        int matchIndex = this.alphabetRing.indexOf(match);

        return this.etw.get(matchIndex);
    }

    public char processOut(char input) {
        int indexInput = this.etw.indexOf(input);
        char match = this.alphabetRing.get(indexInput);
        int matchIndex = this.rotorRing.indexOf(match);

        return this.etw.get(matchIndex);
    }
}
