package com.enigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enigma {
    private Rotor rotor1;
    private Rotor rotor2;
    private Rotor rotor3;
    private Rotor leftRotor;
    private Rotor middleRotor;
    private Rotor rightRotor;
    private Reflector reflector;
    private Plugboard plugboard;
    private String steps;

    public Enigma() {
        List<Character> rotorRing1 = new ArrayList<>(Arrays.asList('E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X','U','S','P','A','I','B','R','C','J'));
        List<Character> rotorRing2 = new ArrayList<>(Arrays.asList('A','J','D','K','S','I','R','U','X','B','L','H','W','T','M','C','Q','G','Z','N','P','Y','F','V','O','E'));
        List<Character> rotorRing3 = new ArrayList<>(Arrays.asList('B','D','F','H','J','L','C','P','R','T','X','V','Z','N','Y','E','I','W','G','A','K','M','U','S','Q','O'));

        this.rotor1 = new Rotor(rotorRing1, 'Q');
        this.rotor2 = new Rotor(rotorRing2,'E');
        this.rotor3 = new Rotor(rotorRing3, 'v');

        this.leftRotor = this.rotor1;
        this.middleRotor = this.rotor2;
        this.rightRotor = this.rotor3;

        this.reflector = new Reflector();
    }

    public void resetConfig() {

    }

    public char encrypt(char input) {
        boolean rotateMiddle = this.rightRotor.rotateRotor();

        if (rotateMiddle) {
            boolean rotateLeft = this.middleRotor.rotateRotor();
            if (rotateLeft) {
                this.leftRotor.rotateRotor();
            }
        }

        input = this.rightRotor.processIn(input);
        input = this.middleRotor.processIn(input);
        input = this.leftRotor.processIn(input);
        input = reflector.reflect(input);
        input = this.leftRotor.processOut(input);
        input = this.middleRotor.processOut(input);
        input = this.rightRotor.processOut(input);

        return input;
    }

    public String decrypt() {
        return "a";
    }

    public void setLeftRotor(Rotor leftRotor) {
        this.leftRotor = leftRotor;
    }

    public void setMiddleRotor(Rotor middleRotor) {
        this.middleRotor = middleRotor;
    }

    public void setRightRotor(Rotor rightRotor) {
        this.rightRotor = rightRotor;
    }

    public String getSteps() {
        return steps;
    }
}
