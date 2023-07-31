package com.enigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        new GUI();
        Enigma enigma = new Enigma();

        System.out.println(enigma.encrypt('B'));
        System.out.println(enigma.encrypt('D'));
        System.out.println(enigma.encrypt('Z'));
    }
}