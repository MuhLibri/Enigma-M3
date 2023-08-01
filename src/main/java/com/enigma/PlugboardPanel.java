package com.enigma;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlugboardPanel extends JPanel {
    Enigma enigma;
    RoundJButton buttonA;
    RoundJButton buttonB;
    RoundJButton buttonC;
    RoundJButton buttonD;
    RoundJButton buttonE;
    RoundJButton buttonF;
    RoundJButton buttonG;
    RoundJButton buttonH;
    RoundJButton buttonI;
    RoundJButton buttonJ;
    RoundJButton buttonK;
    RoundJButton buttonL;
    RoundJButton buttonM;
    RoundJButton buttonN;
    RoundJButton buttonO;
    RoundJButton buttonP;
    RoundJButton buttonQ;
    RoundJButton buttonR;
    RoundJButton buttonS;
    RoundJButton buttonT;
    RoundJButton buttonU;
    RoundJButton buttonV;
    RoundJButton buttonW;
    RoundJButton buttonX;
    RoundJButton buttonY;
    RoundJButton buttonZ;


    public PlugboardPanel(Enigma enigma) {
        this.enigma = enigma;


        // GUI Variables
        Font plugboardFont = new Font("Dialog", 1, 20);


        this.setBackground(new Color(31, 31, 33));
        this.setPreferredSize(new Dimension(800, 350));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 20));

    }
}
