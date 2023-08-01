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

    public void rotateToPreviousAlphabet() {
        // Rotate to the previous alphabet ring
        char tempAlphabet = this.alphabetRing.get(25);
        this.alphabetRing.remove(25);
        this.alphabetRing.add(0, tempAlphabet);
        // Rotate the previous rotor ring
        char tempRotor = this.rotorRing.get(25);
        this.rotorRing.remove(25);
        this.rotorRing.add(0, tempRotor);
    }

    public void rotateToNextAlphabet() {
        // Rotate to the next alphabet ring
        char tempAlphabet = this.alphabetRing.get(0);
        this.alphabetRing.remove(0);
        this.alphabetRing.add(tempAlphabet);
        // Rotate the next rotor ring
        char tempRotor = this.rotorRing.get(0);
        this.rotorRing.remove(0);
        this.rotorRing.add(tempRotor);
    }

    public boolean rotateRotor() {
        // Advance next rotor boolean
        boolean rotateNextRotor = this.alphabetRing.get(0) == this.turnOverChar;
        // Rotate the rotor
        rotateToNextAlphabet();

        return rotateNextRotor;
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

    public char getFirstAlphabet() {
        return this.alphabetRing.get(0);
    }

    public char getSecondAlphabet() {
        return this.alphabetRing.get(1);
    }

    public char getLastAlphabet() {
        return this.alphabetRing.get(25);
    }

    public void setInitialPosition(char initialChar) {
        while (this.alphabetRing.get(0) != initialChar) {
            this.rotateToNextAlphabet();
        }
    }
}
