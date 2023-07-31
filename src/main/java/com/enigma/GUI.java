package com.enigma;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GUI extends JFrame implements ActionListener {
    Enigma enigma;
    JTextField leftRotor;
    JTextField middleRotor;
    JTextField rightRotor;
    Button resetButton;
    Button settingButton;
    Button plugboardButton;
    JPanel encryptionTextSection;
    JPanel plainPanel;
    JPanel encryptedPanel;
    JTextArea plainText;
    JTextArea encryptedText;
    Button showProcessButton;
    Button clearButton;
    // Lamps
    RoundJTextField lampA;
    RoundJTextField lampB;
    RoundJTextField lampC;
    RoundJTextField lampD;
    RoundJTextField lampE;
    RoundJTextField lampF;
    RoundJTextField lampG;
    RoundJTextField lampH;
    RoundJTextField lampI;
    RoundJTextField lampJ;
    RoundJTextField lampK;
    RoundJTextField lampL;
    RoundJTextField lampM;
    RoundJTextField lampN;
    RoundJTextField lampO;
    RoundJTextField lampP;
    RoundJTextField lampQ;
    RoundJTextField lampR;
    RoundJTextField lampS;
    RoundJTextField lampT;
    RoundJTextField lampU;
    RoundJTextField lampV;
    RoundJTextField lampW;
    RoundJTextField lampX;
    RoundJTextField lampY;
    RoundJTextField lampZ;
    // Keyboard Buttons
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

    public GUI() {
        // Enigma
        this.enigma = new Enigma();

        // GUI Variables
        Font label1Font = new Font("Dialog", 1, 30);
        Font label2Font = new Font("Dialog", 1, 20);
        Font buttonFont = new Font("Dialog", 1, 15);


        // Rotor Section
        // Left Rotor
        leftRotor = new JTextField("A");
        leftRotor.setHorizontalAlignment(SwingConstants.CENTER);
        leftRotor.setEditable(false);
        leftRotor.setBackground(Color.LIGHT_GRAY);
        leftRotor.setBorder(new LineBorder(Color.BLACK));
        // Middle Rotor
        middleRotor = new JTextField("A");
        middleRotor.setHorizontalAlignment(SwingConstants.CENTER);
        middleRotor.setEditable(false);
        middleRotor.setBackground(Color.LIGHT_GRAY);
        middleRotor.setBorder(new LineBorder(Color.BLACK));
        // Right Rotor
        rightRotor = new JTextField("A");
        rightRotor.setHorizontalAlignment(SwingConstants.CENTER);
        rightRotor.setEditable(false);
        rightRotor.setBackground(Color.LIGHT_GRAY);
        rightRotor.setBorder(new LineBorder(Color.BLACK));
        // Rotor Panel
        JPanel rotorPanel = new JPanel();
        rotorPanel.setLayout(new GridLayout());
        rotorPanel.setPreferredSize(new Dimension(200,80));
        rotorPanel.setBackground(Color.BLACK);
        rotorPanel.add(leftRotor);
        rotorPanel.add(middleRotor);
        rotorPanel.add(rightRotor);
        JPanel upperPanel = new JPanel();
        upperPanel.setBackground(new Color(31, 31, 33));
        upperPanel.setPreferredSize(new Dimension(750, 150));
        upperPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
        upperPanel.add(rotorPanel);


        // Lampboard Section
        // Lamps
        lampA = new RoundJTextField(10);
        lampA.setText("A");
        lampA.setEditable(false);

        lampB = new RoundJTextField(10);
        lampB.setText("B");
        lampB.setEditable(false);

        lampC = new RoundJTextField(10);
        lampC.setText("C");
        lampC.setEditable(false);

        lampD = new RoundJTextField(10);
        lampD.setText("D");
        lampD.setEditable(false);

        lampE = new RoundJTextField(10);
        lampE.setText("E");
        lampE.setEditable(false);

        lampF = new RoundJTextField(10);
        lampF.setText("F");
        lampF.setEditable(false);

        lampG = new RoundJTextField(10);
        lampG.setText("G");
        lampG.setEditable(false);

        lampH = new RoundJTextField(10);
        lampH.setText("H");
        lampH.setEditable(false);

        lampI = new RoundJTextField(10);
        lampI.setText("I");
        lampI.setEditable(false);

        lampJ = new RoundJTextField(10);
        lampJ.setText("J");
        lampJ.setEditable(false);

        lampK = new RoundJTextField(10);
        lampK.setText("K");
        lampK.setEditable(false);

        lampL = new RoundJTextField(10);
        lampL.setText("L");
        lampL.setEditable(false);

        lampM = new RoundJTextField(10);
        lampM.setText("M");
        lampM.setEditable(false);

        lampN = new RoundJTextField(10);
        lampN.setText("N");
        lampN.setEditable(false);

        lampO = new RoundJTextField(10);
        lampO.setText("O");
        lampO.setEditable(false);

        lampP = new RoundJTextField(10);
        lampP.setText("P");
        lampP.setEditable(false);

        lampQ = new RoundJTextField(10);
        lampQ.setText("Q");
        lampQ.setEditable(false);

        lampR = new RoundJTextField(10);
        lampR.setText("R");
        lampR.setEditable(false);

        lampS = new RoundJTextField(10);
        lampS.setText("S");
        lampS.setEditable(false);

        lampT = new RoundJTextField(10);
        lampT.setText("T");
        lampT.setEditable(false);

        lampU = new RoundJTextField(10);
        lampU.setText("U");
        lampU.setEditable(false);

        lampV = new RoundJTextField(10);
        lampV.setText("V");
        lampV.setEditable(false);

        lampW = new RoundJTextField(10);
        lampW.setText("W");
        lampW.setEditable(false);

        lampX = new RoundJTextField(10);
        lampX.setText("X");
        lampX.setEditable(false);

        lampY = new RoundJTextField(10);
        lampY.setText("Y");
        lampY.setEditable(false);

        lampZ = new RoundJTextField(10);
        lampZ.setText("Z");
        lampZ.setEditable(false);

        // Panel
        // 1st Row
        JPanel lampboardPanel1 = new JPanel();
        lampboardPanel1.setOpaque(false);
        lampboardPanel1.setPreferredSize(new Dimension(650, 60));
        lampboardPanel1.setLayout(new GridLayout(1, 9, 10, 10));
        lampboardPanel1.add(lampQ);
        lampboardPanel1.add(lampW);
        lampboardPanel1.add(lampE);
        lampboardPanel1.add(lampR);
        lampboardPanel1.add(lampT);
        lampboardPanel1.add(lampZ);
        lampboardPanel1.add(lampU);
        lampboardPanel1.add(lampI);
        lampboardPanel1.add(lampO);
        // 2nd Row
        JPanel lampboardPanel2 = new JPanel();
        lampboardPanel2.setOpaque(false);
        lampboardPanel2.setPreferredSize(new Dimension(650, 60));
        lampboardPanel2.setLayout(new GridLayout(1, 8, 10, 10));
        lampboardPanel2.add(lampA);
        lampboardPanel2.add(lampS);
        lampboardPanel2.add(lampD);
        lampboardPanel2.add(lampF);
        lampboardPanel2.add(lampG);
        lampboardPanel2.add(lampH);
        lampboardPanel2.add(lampJ);
        lampboardPanel2.add(lampK);
        // 3rd Row
        JPanel lampboardPanel3 = new JPanel();
        lampboardPanel3.setOpaque(false);
        lampboardPanel3.setPreferredSize(new Dimension(650, 60));
        lampboardPanel3.setLayout(new GridLayout(1, 9, 10, 10));
        lampboardPanel3.add(lampP);
        lampboardPanel3.add(lampY);
        lampboardPanel3.add(lampX);
        lampboardPanel3.add(lampC);
        lampboardPanel3.add(lampV);
        lampboardPanel3.add(lampB);
        lampboardPanel3.add(lampN);
        lampboardPanel3.add(lampM);
        lampboardPanel3.add(lampL);

        JPanel lampboardPanel = new JPanel();
        lampboardPanel.setBackground(new Color(31, 31, 33));
        lampboardPanel.setPreferredSize(new Dimension(750, 300));
        lampboardPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
        lampboardPanel.add(lampboardPanel1);
        lampboardPanel.add(lampboardPanel2);
        lampboardPanel.add(lampboardPanel3);


        // Keyboard Section
        // Buttons
        buttonA = new RoundJButton("A");
        buttonA.addActionListener(this);

        buttonB = new RoundJButton("B");
        buttonB.addActionListener(this);

        buttonC = new RoundJButton("C");
        buttonC.addActionListener(this);

        buttonD = new RoundJButton("D");
        buttonD.addActionListener(this);

        buttonE = new RoundJButton("E");
        buttonE.addActionListener(this);

        buttonF = new RoundJButton("F");
        buttonF.addActionListener(this);

        buttonG = new RoundJButton("G");
        buttonG.addActionListener(this);

        buttonH = new RoundJButton("H");
        buttonH.addActionListener(this);

        buttonI = new RoundJButton("I");
        buttonI.addActionListener(this);

        buttonJ = new RoundJButton("J");
        buttonJ.addActionListener(this);

        buttonK = new RoundJButton("K");
        buttonK.addActionListener(this);

        buttonL = new RoundJButton("L");
        buttonL.addActionListener(this);

        buttonM = new RoundJButton("M");
        buttonM.addActionListener(this);

        buttonN = new RoundJButton("N");
        buttonN.addActionListener(this);

        buttonO = new RoundJButton("O");
        buttonO.addActionListener(this);

        buttonP = new RoundJButton("P");
        buttonP.addActionListener(this);

        buttonQ = new RoundJButton("Q");
        buttonQ.addActionListener(this);

        buttonR = new RoundJButton("R");
        buttonR.addActionListener(this);

        buttonS = new RoundJButton("S");
        buttonS.addActionListener(this);

        buttonT = new RoundJButton("T");
        buttonT.addActionListener(this);

        buttonU = new RoundJButton("U");
        buttonU.addActionListener(this);

        buttonV = new RoundJButton("V");
        buttonV.addActionListener(this);

        buttonW = new RoundJButton("W");
        buttonW.addActionListener(this);

        buttonX = new RoundJButton("X");
        buttonX.addActionListener(this);

        buttonY = new RoundJButton("Y");
        buttonY.addActionListener(this);

        buttonZ = new RoundJButton("Z");
        buttonZ.addActionListener(this);

        // Panel
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setBackground(new Color(31, 31, 33));
        keyboardPanel.setPreferredSize(new Dimension(750, 300));
        keyboardPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
        // 1st Row
        JPanel keyboardPanel1 = new JPanel();
        keyboardPanel1.setOpaque(false);
        keyboardPanel1.setPreferredSize(new Dimension(650, 60));
        keyboardPanel1.setLayout(new GridLayout(1, 9, 10, 10));
        keyboardPanel1.add(buttonQ);
        keyboardPanel1.add(buttonW);
        keyboardPanel1.add(buttonE);
        keyboardPanel1.add(buttonR);
        keyboardPanel1.add(buttonT);
        keyboardPanel1.add(buttonZ);
        keyboardPanel1.add(buttonU);
        keyboardPanel1.add(buttonI);
        keyboardPanel1.add(buttonO);
        // 2nd Row
        JPanel keyboardPanel2 = new JPanel();
        keyboardPanel2.setOpaque(false);
        keyboardPanel2.setPreferredSize(new Dimension(650, 60));
        keyboardPanel2.setLayout(new GridLayout(1, 8, 10, 10));
        keyboardPanel2.add(buttonA);
        keyboardPanel2.add(buttonS);
        keyboardPanel2.add(buttonD);
        keyboardPanel2.add(buttonF);
        keyboardPanel2.add(buttonG);
        keyboardPanel2.add(buttonH);
        keyboardPanel2.add(buttonJ);
        keyboardPanel2.add(buttonK);
        // 3rd Row
        JPanel keyboardPanel3 = new JPanel();
        keyboardPanel3.setOpaque(false);
        keyboardPanel3.setPreferredSize(new Dimension(650, 60));
        keyboardPanel3.setLayout(new GridLayout(1, 9, 10, 10));
        keyboardPanel3.add(buttonP);
        keyboardPanel3.add(buttonY);
        keyboardPanel3.add(buttonX);
        keyboardPanel3.add(buttonC);
        keyboardPanel3.add(buttonV);
        keyboardPanel3.add(buttonB);
        keyboardPanel3.add(buttonN);
        keyboardPanel3.add(buttonM);
        keyboardPanel3.add(buttonL);

        keyboardPanel.add(keyboardPanel1);
        keyboardPanel.add(keyboardPanel2);
        keyboardPanel.add(keyboardPanel3);


        // Enigma Panel
        JPanel enigmaPanel = new JPanel();
        enigmaPanel.setOpaque(false);
        enigmaPanel.setPreferredSize(new Dimension(800, 765));
        enigmaPanel.setLayout(new BorderLayout());
        enigmaPanel.add(upperPanel, BorderLayout.NORTH);
        enigmaPanel.add(lampboardPanel, BorderLayout.CENTER);
        enigmaPanel.add(keyboardPanel, BorderLayout.SOUTH);


        // Center Panel
        JPanel centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(900, 800));
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 25));
        centerPanel.setBackground(new Color(95, 50, 20));
        centerPanel.add(enigmaPanel);


        // Text Section
        // Plain Text
        // Label
        JLabel plainLabel = new JLabel("Input");
        plainLabel.setForeground(Color.WHITE);
        plainLabel.setBorder(BorderFactory.createEmptyBorder(0,0,7,0));
        plainLabel.setFont(label2Font);
        // Text Area
        plainText = new JTextArea();
        plainText.setEditable(false);
        plainText.setMargin(new Insets(7, 7, 7, 7));
        plainText.setLineWrap(true);
        plainText.setWrapStyleWord(true);
        JScrollPane scrollPlain = new JScrollPane(plainText);
        scrollPlain.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPlain.setPreferredSize(new Dimension(300, 120));
        // Panel
        plainPanel = new JPanel();
        plainPanel.setOpaque(false);
        plainPanel.setLayout(new BorderLayout());
        plainPanel.add(plainLabel, BorderLayout.NORTH);
        plainPanel.add(scrollPlain, BorderLayout.CENTER);
        // Encrypted Text
        // Label
        JLabel encryptedLabel = new JLabel("Output");
        encryptedLabel.setForeground(Color.WHITE);
        encryptedLabel.setBorder(BorderFactory.createEmptyBorder(0,0,7,0));
        encryptedLabel.setFont(label2Font);
        // Text Area
        encryptedText = new JTextArea();
        encryptedText.setEditable(false);
        encryptedText.setMargin(new Insets(7, 7, 7, 7));
        encryptedText.setLineWrap(true);
        encryptedText.setWrapStyleWord(true);
        JScrollPane scrollEncrypted = new JScrollPane(encryptedText);
        scrollEncrypted.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollEncrypted.setPreferredSize(new Dimension(300, 120));
        // Panel
        encryptedPanel = new JPanel();
        encryptedPanel.setOpaque(false);
        encryptedPanel.setLayout(new BorderLayout());
        encryptedPanel.add(encryptedLabel, BorderLayout.NORTH);
        encryptedPanel.add(scrollEncrypted, BorderLayout.CENTER);
        // Encrypted and Plain Text Panel
        encryptionTextSection = new JPanel();
        encryptionTextSection.setOpaque(false);
        encryptionTextSection.setPreferredSize(new Dimension(320, 350));
        encryptionTextSection.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 20));
        encryptionTextSection.add(plainPanel);
        encryptionTextSection.add(encryptedPanel);
        // Clear Button
        clearButton = new Button("Clear");
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);
        clearButton.setFont(buttonFont);
        clearButton.setPreferredSize(new Dimension(100, 30));
        // Show Process Button
        showProcessButton = new Button("Show Process");
        showProcessButton.setFocusable(false);
        showProcessButton.addActionListener(this);
        showProcessButton.setFont(buttonFont);
        showProcessButton.setPreferredSize(new Dimension(150, 30));
        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.add(clearButton, BorderLayout.WEST);
        buttonPanel.add(showProcessButton, BorderLayout.EAST);
        // Text Section Panel
        JPanel textSection = new JPanel();
        textSection.setOpaque(false);
        textSection.setPreferredSize(new Dimension(320, 420));
        textSection.setLayout(new BorderLayout());
        textSection.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        textSection.add(encryptionTextSection);
        textSection.add(buttonPanel, BorderLayout.SOUTH);


        // Right Section
        // Reset Rotor Button
        resetButton = new Button("Reset");
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        resetButton.setFont(buttonFont);
        resetButton.setPreferredSize(new Dimension(100, 30));
        // Setting Button
        settingButton = new Button("Setting");
        settingButton.setFocusable(false);
        settingButton.addActionListener(this);
        settingButton.setFont(buttonFont);
        settingButton.setPreferredSize(new Dimension(100, 30));
        // Plugboard Button
        plugboardButton = new Button("Plugboard");
        plugboardButton.setFocusable(false);
        plugboardButton.addActionListener(this);
        plugboardButton.setFont(buttonFont);
        plugboardButton.setPreferredSize(new Dimension(100, 30));
        // Buttons Panel
        JPanel configButtonPanel = new JPanel();
        configButtonPanel.setOpaque(false);
        configButtonPanel.setPreferredSize(new Dimension(150, 200));
        configButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 20));
        configButtonPanel.add(resetButton);
        configButtonPanel.add(settingButton);
        configButtonPanel.add(plugboardButton);
        // Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 20));
        rightPanel.setPreferredSize(new Dimension(500, 800));
        rightPanel.setBackground(new Color(161, 92, 42));
        rightPanel.add(configButtonPanel);
        rightPanel.add(textSection);


        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1400,800));
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(95, 50, 20));
        mainPanel.add(rightPanel, BorderLayout.EAST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);


        // Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1400, 850));
        setTitle("Enigma M3");
        add(mainPanel);
        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            plainText.setText("");
            encryptedText.setText("");
        }
        else if (e.getSource() == showProcessButton) {
            // TO DO IMPLEMENT
        }
        else if (e.getSource() == resetButton) {
            plainText.setText("");
            encryptedText.setText("");
        }
        else if (e.getSource() == settingButton) {
            // TO DO IMPLEMENT
        }
        else if (e.getSource() == buttonA) {
            processCharInput('A');
        }
        else if (e.getSource() == buttonB) {
            processCharInput('B');
        }
        else if (e.getSource() == buttonC) {
            processCharInput('C');
        }
        else if (e.getSource() == buttonD) {
            processCharInput('D');
        }
        else if (e.getSource() == buttonE) {
            processCharInput('E');
        }
        else if (e.getSource() == buttonF) {
            processCharInput('F');
        }
        else if (e.getSource() == buttonG) {
            processCharInput('G');
        }
        else if (e.getSource() == buttonH) {
            processCharInput('H');
        }
        else if (e.getSource() == buttonI) {
            processCharInput('I');
        }
        else if (e.getSource() == buttonJ) {
            processCharInput('J');
        }
        else if (e.getSource() == buttonK) {
            processCharInput('K');
        }
        else if (e.getSource() == buttonL) {
            processCharInput('L');
        }
        else if (e.getSource() == buttonM) {
            processCharInput('M');
        }
        else if (e.getSource() == buttonN) {
            processCharInput('N');
        }
        else if (e.getSource() == buttonO) {
            processCharInput('O');
        }
        else if (e.getSource() == buttonP) {
            processCharInput('P');
        }
        else if (e.getSource() == buttonQ) {
            processCharInput('Q');
        }
        else if (e.getSource() == buttonR) {
            processCharInput('R');
        }
        else if (e.getSource() == buttonS) {
            processCharInput('S');
        }
        else if (e.getSource() == buttonT) {
            processCharInput('T');
        }
        else if (e.getSource() == buttonU) {
            processCharInput('U');
        }
        else if (e.getSource() == buttonV) {
            processCharInput('V');
        }
        else if (e.getSource() == buttonW) {
            processCharInput('W');
        }
        else if (e.getSource() == buttonX) {
            processCharInput('X');
        }
        else if (e.getSource() == buttonY) {
            processCharInput('Y');
        }
        else if (e.getSource() == buttonZ) {
            processCharInput('Z');
        }
    }

    private void processCharInput(char input) {
        // Write input
        String currentText = plainText.getText();
        currentText = currentText + input;
        plainText.setText(currentText);

        // Search output
        char output = enigma.encryptOneChar(input);
        // Write output
        String outputText = encryptedText.getText();
        outputText = outputText + output;
        encryptedText.setText(outputText);

        // Set the rotors
        rightRotor.setText(Character.toString(this.enigma.getRightRotor().getFirstAlphabet()));
        middleRotor.setText(Character.toString(this.enigma.getMiddleRotor().getFirstAlphabet()));
        leftRotor.setText(Character.toString(this.enigma.getLeftRotor().getFirstAlphabet()));

        // Turn on the lamp
        turnOnLamp(output);
    }

    private void turnOnLamp(char output) {
        Thread thread = new Thread(() -> {
            try {
                if (output == 'A') {
                    lampA.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampA.setBackground(Color.BLACK);
                }
                else if (output == 'B') {
                    lampB.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampB.setBackground(Color.BLACK);
                }
                else if (output == 'C') {
                    lampC.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampC.setBackground(Color.BLACK);
                }
                else if (output == 'D') {
                    lampD.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampD.setBackground(Color.BLACK);
                }
                else if (output == 'E') {
                    lampE.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampE.setBackground(Color.BLACK);
                }
                else if (output == 'F') {
                    lampF.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampF.setBackground(Color.BLACK);
                }
                else if (output == 'G') {
                    lampG.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampG.setBackground(Color.BLACK);
                }
                else if (output == 'H') {
                    lampH.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampH.setBackground(Color.BLACK);
                }
                else if (output == 'I') {
                    lampI.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampI.setBackground(Color.BLACK);
                }
                else if (output == 'J') {
                    lampJ.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampJ.setBackground(Color.BLACK);
                }
                else if (output == 'K') {
                    lampK.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampK.setBackground(Color.BLACK);
                }
                else if (output == 'L') {
                    lampL.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampL.setBackground(Color.BLACK);
                }
                else if (output == 'M') {
                    lampM.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampM.setBackground(Color.BLACK);
                }
                else if (output == 'N') {
                    lampN.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampN.setBackground(Color.BLACK);
                }
                else if (output == 'O') {
                    lampO.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampO.setBackground(Color.BLACK);
                }
                else if (output == 'P') {
                    lampP.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampP.setBackground(Color.BLACK);
                }
                else if (output == 'Q') {
                    lampQ.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampQ.setBackground(Color.BLACK);
                }
                else if (output == 'R') {
                    lampR.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampR.setBackground(Color.BLACK);
                }
                else if (output == 'S') {
                    lampS.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampS.setBackground(Color.BLACK);
                }
                else if (output == 'T') {
                    lampT.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampT.setBackground(Color.BLACK);
                }
                else if (output == 'U') {
                    lampU.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampU.setBackground(Color.BLACK);
                }
                else if (output == 'V') {
                    lampV.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampV.setBackground(Color.BLACK);
                }
                else if (output == 'W') {
                    lampW.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampW.setBackground(Color.BLACK);
                }
                else if (output == 'X') {
                    lampX.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampX.setBackground(Color.BLACK);
                }
                else if (output == 'Y') {
                    lampY.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampY.setBackground(Color.BLACK);
                }
                else if (output == 'Z') {
                    lampZ.setBackground(Color.ORANGE);
                    Thread.sleep(1000);
                    lampZ.setBackground(Color.BLACK);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }
}


class RoundJTextField extends JTextField {
    private Shape shape;

    public RoundJTextField(int size) {
        super(size);
        setOpaque(false);
        setHorizontalAlignment(CENTER);
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
        Border border = new Border() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.setColor(getBackground()); // Set border color to background color
                g.drawRoundRect(x, y, width - 1, height - 1, height, height);
            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(4, 8, 4, 8);
            }

            @Override
            public boolean isBorderOpaque() {
                return true;
            }
        };
        setBorder(border);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque() && getBorder() instanceof Border) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getHeight(), getHeight());
            g2.dispose();
        }
        super.paintComponent(g);
    }
}

class RoundJButton extends JButton {
    private Shape shape;

    public RoundJButton(String text) {
        super(text);
        setOpaque(false);
        setForeground(Color.WHITE);
        setBackground(Color.GRAY);
        Border border = new Border() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.setColor(Color.WHITE); // Set the border color to white
                g.drawRoundRect(x, y, width - 1, height - 1, height, height);
            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(4, 8, 4, 8);
            }

            @Override
            public boolean isBorderOpaque() {
                return true;
            }
        };
        setFocusable(false);
        setBorder(border);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque() && getBorder() instanceof Border) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getHeight(), getHeight());
            g2.dispose();
        }
        super.paintComponent(g);
    }
}