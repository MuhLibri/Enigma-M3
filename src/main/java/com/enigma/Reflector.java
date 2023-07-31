package com.enigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reflector {
    List<Character> etw;
    List<Character> ukwB;

    public Reflector() {
        this.etw = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));
        this.ukwB = new ArrayList<>(Arrays.asList('Y','R','U','H','Q','S','L','D','P','X','N','G','O','K','M','I','E','B','F','Z','C','W','V','J','A','T'));
    }

    public char reflect(char input) {
        int indexInput = this.etw.indexOf(input);

        return this.ukwB.get(indexInput);
    }
}
