package com.enigma;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame implements ActionListener {
    Enigma enigma;
    RotorPanel rotorPanel;
    LampboardPanel lampboardPanel;
    KeyboardPanel keyboardPanel;
    Button resetButton;
    Button settingButton;
    Button plugboardButton;
    JPanel encryptionTextSection;
    JPanel inputPanel;
    JPanel outputPanel;
    JTextArea inputText;
    JTextArea outputText;
    Button showProcessButton;
    Button clearButton;

    public GUI() {
        // Enigma
        this.enigma = new Enigma();


        // GUI Variables
        Font label1Font = new Font("Dialog", 1, 30);
        Font label2Font = new Font("Dialog", 1, 20);
        Font buttonFont = new Font("Dialog", 1, 15);


        // Rotor Section
        rotorPanel = new RotorPanel();
        rotorPanel.upRightButton.addActionListener(this);
        rotorPanel.downRightButton.addActionListener(this);
        rotorPanel.upMiddleButton.addActionListener(this);
        rotorPanel.downMiddleButton.addActionListener(this);
        rotorPanel.upLeftButton.addActionListener(this);
        rotorPanel.downLeftButton.addActionListener(this);


        // Lampboard Section
        lampboardPanel = new LampboardPanel();


        // Keyboard Section
        keyboardPanel = new KeyboardPanel();
        keyboardPanel.buttonA.addActionListener(this);
        keyboardPanel.buttonB.addActionListener(this);
        keyboardPanel.buttonC.addActionListener(this);
        keyboardPanel.buttonD.addActionListener(this);
        keyboardPanel.buttonE.addActionListener(this);
        keyboardPanel.buttonF.addActionListener(this);
        keyboardPanel.buttonG.addActionListener(this);
        keyboardPanel.buttonH.addActionListener(this);
        keyboardPanel.buttonI.addActionListener(this);
        keyboardPanel.buttonJ.addActionListener(this);
        keyboardPanel.buttonK.addActionListener(this);
        keyboardPanel.buttonL.addActionListener(this);
        keyboardPanel.buttonM.addActionListener(this);
        keyboardPanel.buttonN.addActionListener(this);
        keyboardPanel.buttonO.addActionListener(this);
        keyboardPanel.buttonP.addActionListener(this);
        keyboardPanel.buttonQ.addActionListener(this);
        keyboardPanel.buttonR.addActionListener(this);
        keyboardPanel.buttonS.addActionListener(this);
        keyboardPanel.buttonT.addActionListener(this);
        keyboardPanel.buttonU.addActionListener(this);
        keyboardPanel.buttonV.addActionListener(this);
        keyboardPanel.buttonW.addActionListener(this);
        keyboardPanel.buttonX.addActionListener(this);
        keyboardPanel.buttonY.addActionListener(this);
        keyboardPanel.buttonZ.addActionListener(this);


        // Enigma Panel
        JPanel enigmaPanel = new JPanel();
        enigmaPanel.setOpaque(false);
        enigmaPanel.setPreferredSize(new Dimension(800, 765));
        enigmaPanel.setLayout(new BorderLayout());
        enigmaPanel.add(rotorPanel, BorderLayout.NORTH);
        enigmaPanel.add(lampboardPanel, BorderLayout.CENTER);
        enigmaPanel.add(keyboardPanel, BorderLayout.SOUTH);


        // Center Panel
        JPanel centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(900, 800));
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 25));
        centerPanel.setBackground(new Color(95, 50, 20));
        centerPanel.add(enigmaPanel);


        // Text Section
        // Input Text
        // Label
        JLabel inputLabel = new JLabel("Input");
        inputLabel.setForeground(Color.WHITE);
        inputLabel.setBorder(BorderFactory.createEmptyBorder(0,0,7,0));
        inputLabel.setFont(label2Font);
        // Text Area
        inputText = new JTextArea();
        inputText.setEditable(false);
        inputText.setMargin(new Insets(7, 7, 7, 7));
        inputText.setLineWrap(true);
        inputText.setWrapStyleWord(true);
        JScrollPane scrollInput = new JScrollPane(inputText);
        scrollInput.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollInput.setPreferredSize(new Dimension(300, 120));
        // Panel
        inputPanel = new JPanel();
        inputPanel.setOpaque(false);
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(inputLabel, BorderLayout.NORTH);
        inputPanel.add(scrollInput, BorderLayout.CENTER);
        // Output Text
        // Label
        JLabel outputLabel = new JLabel("Output");
        outputLabel.setForeground(Color.WHITE);
        outputLabel.setBorder(BorderFactory.createEmptyBorder(0,0,7,0));
        outputLabel.setFont(label2Font);
        // Text Area
        outputText = new JTextArea();
        outputText.setEditable(false);
        outputText.setMargin(new Insets(7, 7, 7, 7));
        outputText.setLineWrap(true);
        outputText.setWrapStyleWord(true);
        JScrollPane scrollEncrypted = new JScrollPane(outputText);
        scrollEncrypted.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollEncrypted.setPreferredSize(new Dimension(300, 120));
        // Panel
        outputPanel = new JPanel();
        outputPanel.setOpaque(false);
        outputPanel.setLayout(new BorderLayout());
        outputPanel.add(outputLabel, BorderLayout.NORTH);
        outputPanel.add(scrollEncrypted, BorderLayout.CENTER);
        // Input and Output Text Panel
        encryptionTextSection = new JPanel();
        encryptionTextSection.setOpaque(false);
        encryptionTextSection.setPreferredSize(new Dimension(320, 350));
        encryptionTextSection.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 20));
        encryptionTextSection.add(inputPanel);
        encryptionTextSection.add(outputPanel);
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
        // Icon
        ImageIcon icon = new ImageIcon("assets/enigma.jpg");
        setIconImage(icon.getImage());
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
            inputText.setText("");
            outputText.setText("");
        }
        else if (e.getSource() == showProcessButton) {
            // TO DO IMPLEMENT
        }
        else if (e.getSource() == resetButton) {
            inputText.setText("");
            outputText.setText("");
        }
        else if (e.getSource() == settingButton) {
            // TO DO IMPLEMENT
        }
        else if (e.getSource() == rotorPanel.upRightButton) {
            this.enigma.getRightRotor().rotateToNextAlphabet();
            setRotor();
        }
        else if (e.getSource() == rotorPanel.downRightButton) {
            this.enigma.getRightRotor().rotateToPreviousAlphabet();
            setRotor();
        }
        else if (e.getSource() == rotorPanel.upMiddleButton) {
            this.enigma.getMiddleRotor().rotateToNextAlphabet();
            setRotor();
        }
        else if (e.getSource() == rotorPanel.downMiddleButton) {
            this.enigma.getMiddleRotor().rotateToPreviousAlphabet();
            setRotor();
        }
        else if (e.getSource() == rotorPanel.upLeftButton) {
            this.enigma.getLeftRotor().rotateToNextAlphabet();
            setRotor();
        }
        else if (e.getSource() == rotorPanel.downLeftButton) {
            this.enigma.getLeftRotor().rotateToPreviousAlphabet();
            setRotor();
        }
        else if (e.getSource() == this.keyboardPanel.buttonA) {
            processCharInput('A');
        }
        else if (e.getSource() == this.keyboardPanel.buttonB) {
            processCharInput('B');
        }
        else if (e.getSource() == this.keyboardPanel.buttonC) {
            processCharInput('C');
        }
        else if (e.getSource() == this.keyboardPanel.buttonD) {
            processCharInput('D');
        }
        else if (e.getSource() == this.keyboardPanel.buttonE) {
            processCharInput('E');
        }
        else if (e.getSource() == this.keyboardPanel.buttonF) {
            processCharInput('F');
        }
        else if (e.getSource() == this.keyboardPanel.buttonG) {
            processCharInput('G');
        }
        else if (e.getSource() == this.keyboardPanel.buttonH) {
            processCharInput('H');
        }
        else if (e.getSource() == this.keyboardPanel.buttonI) {
            processCharInput('I');
        }
        else if (e.getSource() == this.keyboardPanel.buttonJ) {
            processCharInput('J');
        }
        else if (e.getSource() == this.keyboardPanel.buttonK) {
            processCharInput('K');
        }
        else if (e.getSource() == this.keyboardPanel.buttonL) {
            processCharInput('L');
        }
        else if (e.getSource() == this.keyboardPanel.buttonM) {
            processCharInput('M');
        }
        else if (e.getSource() == this.keyboardPanel.buttonN) {
            processCharInput('N');
        }
        else if (e.getSource() == this.keyboardPanel.buttonO) {
            processCharInput('O');
        }
        else if (e.getSource() == this.keyboardPanel.buttonP) {
            processCharInput('P');
        }
        else if (e.getSource() == this.keyboardPanel.buttonQ) {
            processCharInput('Q');
        }
        else if (e.getSource() == this.keyboardPanel.buttonR) {
            processCharInput('R');
        }
        else if (e.getSource() == this.keyboardPanel.buttonS) {
            processCharInput('S');
        }
        else if (e.getSource() == this.keyboardPanel.buttonT) {
            processCharInput('T');
        }
        else if (e.getSource() == this.keyboardPanel.buttonU) {
            processCharInput('U');
        }
        else if (e.getSource() == this.keyboardPanel.buttonV) {
            processCharInput('V');
        }
        else if (e.getSource() == this.keyboardPanel.buttonW) {
            processCharInput('W');
        }
        else if (e.getSource() == this.keyboardPanel.buttonX) {
            processCharInput('X');
        }
        else if (e.getSource() == this.keyboardPanel.buttonY) {
            processCharInput('Y');
        }
        else if (e.getSource() == this.keyboardPanel.buttonZ) {
            processCharInput('Z');
        }
    }

    private void processCharInput(char input) {
        // Write input
        String currentText = inputText.getText();
        currentText = currentText + input;
        inputText.setText(currentText);

        // Search output
        char output = enigma.encryptOneChar(input);
        // Write output
        String outputText = this.outputText.getText();
        outputText = outputText + output;
        this.outputText.setText(outputText);

        // Set the rotors
        setRotor();

        // Turn on the lamp
        lampboardPanel.turnOnLamp(output);
    }

    private void setRotor() {
        rotorPanel.rightRotor.setText(Character.toString(this.enigma.getRightRotor().getFirstAlphabet()));
        rotorPanel.middleRotor.setText(Character.toString(this.enigma.getMiddleRotor().getFirstAlphabet()));
        rotorPanel.leftRotor.setText(Character.toString(this.enigma.getLeftRotor().getFirstAlphabet()));

        rotorPanel.upRightButton.setLabel(Character.toString(this.enigma.getRightRotor().getSecondAlphabet()));
        rotorPanel.downRightButton.setLabel(Character.toString(this.enigma.getRightRotor().getLastAlphabet()));

        rotorPanel.upMiddleButton.setLabel(Character.toString(this.enigma.getMiddleRotor().getSecondAlphabet()));
        rotorPanel.downMiddleButton.setLabel(Character.toString(this.enigma.getMiddleRotor().getLastAlphabet()));

        rotorPanel.upLeftButton.setLabel(Character.toString(this.enigma.getLeftRotor().getSecondAlphabet()));
        rotorPanel.downLeftButton.setLabel(Character.toString(this.enigma.getLeftRotor().getLastAlphabet()));
    }
}