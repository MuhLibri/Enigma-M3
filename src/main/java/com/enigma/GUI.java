package com.enigma;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame implements ActionListener {
    Button resetButton;
    Button settingButton;
    Button plugboardButton;
    JLabel encryptionTextLabel;
    JPanel encryptionTextSection;
    JPanel plainPanel;
    JPanel encryptedPanel;
    JTextArea plainText;
    JTextArea encryptedText;
    Button solveButton;
    Button showProcessButton;
    Button changeModeButton;

    public GUI() {
        // GUI Variables
        Font label1Font = new Font("Dialog", 1, 30);
        Font label2Font = new Font("Dialog", 1, 20);
        Font buttonFont = new Font("Dialog", 1, 15);


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
        rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 300));
        rightPanel.setPreferredSize(new Dimension(300, 800));
        rightPanel.setBackground(new Color(161, 92, 42));
        rightPanel.add(configButtonPanel);


        // Rotor Section
        // Left Rotor
        JTextField leftRotor = new JTextField("A");
        leftRotor.setHorizontalAlignment(SwingConstants.CENTER);
        leftRotor.setEditable(false);
        leftRotor.setBackground(Color.LIGHT_GRAY);
        leftRotor.setBorder(new LineBorder(Color.BLACK));
        // Middle Rotor
        JTextField middleRotor = new JTextField("A");
        middleRotor.setHorizontalAlignment(SwingConstants.CENTER);
        middleRotor.setEditable(false);
        middleRotor.setBackground(Color.LIGHT_GRAY);
        middleRotor.setBorder(new LineBorder(Color.BLACK));
        // Right Rotor
        JTextField rightRotor = new JTextField("A");
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


        // Keyboard Section
        // Encryption/Decryption Title
        encryptionTextLabel = new JLabel("Encryption");
        encryptionTextLabel.setForeground(Color.WHITE);
        encryptionTextLabel.setFont(label1Font);
        encryptionTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
        encryptionTextLabel.setBorder(BorderFactory.createEmptyBorder(5,0,25,0));
        // Plain Text
        // Label
        JLabel plainLabel = new JLabel("Plain Text");
        plainLabel.setForeground(Color.WHITE);
        plainLabel.setBorder(BorderFactory.createEmptyBorder(0,0,7,0));
        plainLabel.setFont(label2Font);
        // Text Area
        plainText = new JTextArea();
        plainText.setMargin(new Insets(7, 7, 7, 7));
        plainText.setLineWrap(true);
        plainText.setWrapStyleWord(true);
        JScrollPane scrollPlain = new JScrollPane(plainText);
        scrollPlain.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPlain.setPreferredSize(new Dimension(320, 120));
        // Panel
        plainPanel = new JPanel();
        plainPanel.setOpaque(false);
        plainPanel.setLayout(new BorderLayout());
        plainPanel.add(plainLabel, BorderLayout.NORTH);
        plainPanel.add(scrollPlain, BorderLayout.CENTER);
        // Encrypted Text
        // Label
        JLabel encryptedLabel = new JLabel("Encrypted Text");
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
        scrollEncrypted.setPreferredSize(new Dimension(320, 120));
        // Panel
        encryptedPanel = new JPanel();
        encryptedPanel.setOpaque(false);
        encryptedPanel.setLayout(new BorderLayout());
        encryptedPanel.add(encryptedLabel, BorderLayout.NORTH);
        encryptedPanel.add(scrollEncrypted, BorderLayout.CENTER);
        // Encrypted and Plain Text Panel
        encryptionTextSection = new JPanel();
        encryptionTextSection.setOpaque(false);
        encryptionTextSection.setPreferredSize(new Dimension(800, 100));
        encryptionTextSection.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 0));
        encryptionTextSection.add(plainPanel);
        encryptionTextSection.add(encryptedPanel);
        // Solve Button
        solveButton = new Button("Solve");
        solveButton.setFocusable(false);
        solveButton.addActionListener(this);
        solveButton.setFont(buttonFont);
        solveButton.setPreferredSize(new Dimension(100, 30));
        // Show Process Button
        showProcessButton = new Button("Show Process");
        showProcessButton.setFocusable(false);
        showProcessButton.addActionListener(this);
        showProcessButton.setFont(buttonFont);
        showProcessButton.setPreferredSize(new Dimension(150, 30));
        // Change Mode Button
        changeModeButton = new Button("Change To Decryption");
        changeModeButton.setFocusable(false);
        changeModeButton.addActionListener(this);
        changeModeButton.setFont(buttonFont);
        changeModeButton.setPreferredSize(new Dimension(200, 30));
        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        buttonPanel.add(changeModeButton);
        buttonPanel.add(showProcessButton);
        buttonPanel.add(solveButton);
        // Text Section Panel
        JPanel textSection = new JPanel();
        textSection.setOpaque(false);
        textSection.setPreferredSize(new Dimension(800, 300));
        textSection.setLayout(new BorderLayout());
        textSection.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        textSection.add(encryptionTextLabel, BorderLayout.NORTH);
        textSection.add(encryptionTextSection);
        textSection.add(buttonPanel, BorderLayout.SOUTH);


        // Center Panel
        JPanel centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(900, 800));
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));
        centerPanel.setBackground(new Color(95, 50, 20));
        centerPanel.add(rotorPanel);
        centerPanel.add(textSection);


        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1200,800));
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(95, 50, 20));
        mainPanel.add(rightPanel, BorderLayout.EAST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);


        // Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1200, 800));
        setTitle("Enigma M3");
        add(mainPanel);
        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == solveButton) {
            System.out.println();
        }
        else if (e.getSource() == changeModeButton) {
            if (changeModeButton.getLabel() == "Change To Encryption"){
                changeModeButton.setLabel("Change To Decryption");
                encryptionTextLabel.setText("Encryption");
                plainText.setEditable(true);
                encryptedText.setEditable(false);
                plainText.setText("");
                encryptedText.setText("");
                encryptionTextSection.add(encryptedPanel);

            }
            else {
                changeModeButton.setLabel("Change To Encryption");
                encryptionTextLabel.setText("Decryption");
                plainText.setEditable(false);
                encryptedText.setEditable(true);
                plainText.setText("");
                encryptedText.setText("");
                encryptionTextSection.add(plainPanel);
            }
        }
        else if (e.getSource() == showProcessButton) {

        }
        else if (e.getSource() == resetButton) {
            plainText.setText("");
            encryptedText.setText("");
        }
        else if (e.getSource() == settingButton) {

        }
    }
}
