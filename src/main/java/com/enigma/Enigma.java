package com.enigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enigma {
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

        this.leftRotor = new Rotor("Rotor I", rotorRing1, 'Q');
        this.middleRotor = new Rotor("Rotor II", rotorRing2,'E');
        this.rightRotor = new Rotor("Rotor III", rotorRing3, 'V');
        this.reflector = new Reflector();
        this.plugboard = new Plugboard();
        this.steps = "";
    }

    public char encrypt(char input) {
        StringBuilder tempSteps = new StringBuilder("Input: " + input + "\n");

        boolean rotateMiddle = this.rightRotor.rotateRotor();
        if (rotateMiddle) {
            boolean rotateLeft = this.middleRotor.rotateRotor();
            if (rotateLeft) {
                this.leftRotor.rotateRotor();
            }
        }
        tempSteps.append("Rotors Position: " + getLeftRotor().getFirstAlphabet() + getMiddleRotor().getFirstAlphabet() + getRightRotor().getFirstAlphabet() + "\n");

        input = plugboard.processIn(input);
        tempSteps.append("Plugboard: " + input + "\n");
        input = this.rightRotor.processIn(input);
        tempSteps.append("Right Rotor: " + input + "\n");
        input = this.middleRotor.processIn(input);
        tempSteps.append("Middle Rotor: " + input + "\n");
        input = this.leftRotor.processIn(input);
        tempSteps.append("Left Rotor: " + input + "\n");
        input = reflector.reflect(input);
        tempSteps.append("Reflector: " + input + "\n");
        input = this.leftRotor.processOut(input);
        tempSteps.append("Left Rotor: " + input + "\n");
        input = this.middleRotor.processOut(input);
        tempSteps.append("Middle Rotor: " + input + "\n");
        input = this.rightRotor.processOut(input);
        tempSteps.append("Right Rotor: " + input + "\n");
        input = plugboard.processOut(input);
        tempSteps.append("Plugboard: " + input + "\n");
        tempSteps.append("Output (Lampboard): " + input + "\n");
        tempSteps.append("------------------------------------------------------------------\n");
        steps = steps + tempSteps;

        return input;
    }

    public Rotor getRotor1() {
        List<Character> rotorRing1 = new ArrayList<>(Arrays.asList('E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X','U','S','P','A','I','B','R','C','J'));
        return new Rotor("Rotor I", rotorRing1, 'Q');
    }

    public Rotor getRotor2() {
        List<Character> rotorRing2 = new ArrayList<>(Arrays.asList('A','J','D','K','S','I','R','U','X','B','L','H','W','T','M','C','Q','G','Z','N','P','Y','F','V','O','E'));
        return new Rotor("Rotor II", rotorRing2,'E');
    }

    public Rotor getRotor3() {
        List<Character> rotorRing3 = new ArrayList<>(Arrays.asList('B','D','F','H','J','L','C','P','R','T','X','V','Z','N','Y','E','I','W','G','A','K','M','U','S','Q','O'));
        return new Rotor("Rotor III", rotorRing3, 'V');
    }

    public Rotor getLeftRotor() {
        return leftRotor;
    }

    public Rotor getMiddleRotor() {
        return middleRotor;
    }

    public Rotor getRightRotor() {
        return rightRotor;
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

    public Plugboard getPlugboard() {
        return plugboard;
    }

    public String getSteps() {
        return steps;
    }

    public void clearSteps() {
        this.steps = "";
    }
}
