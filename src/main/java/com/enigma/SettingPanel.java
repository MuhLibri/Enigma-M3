package com.enigma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingPanel extends JPanel implements ActionListener {
    Enigma enigma;
    RotorPanel rotorPanel;
    JComboBox changeLeftRotor;
    JComboBox changeMiddleRotor;
    JComboBox changeRightRotor;
    JComboBox initialLeftRotor;
    JComboBox initialMiddleRotor;
    JComboBox initialRightRotor;
    Button saveButton;

    public SettingPanel(Enigma enigma, RotorPanel rotorPanel) {
        this.enigma = enigma;
        this.rotorPanel = rotorPanel;


        // GUI Variables
        Font settingFont = new Font("Dialog", 1, 20);


        this.setBackground(new Color(31, 31, 33));
        this.setPreferredSize(new Dimension(800, 350));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 20));


        // Upper Section
        JLabel emptyLabel = new JLabel("                             ");
        emptyLabel.setFont(settingFont);
        JLabel leftRotorLabel = new JLabel("Left Rotor ");
        leftRotorLabel.setForeground(Color.WHITE);
        leftRotorLabel.setFont(settingFont);
        JLabel middleRotorLabel = new JLabel("Middle Rotor");
        middleRotorLabel.setForeground(Color.WHITE);
        middleRotorLabel.setFont(settingFont);
        JLabel rightRotorLabel = new JLabel("Right Rotor");
        rightRotorLabel.setForeground(Color.WHITE);
        rightRotorLabel.setFont(settingFont);
        JPanel upperPanel = new JPanel();
        upperPanel.setPreferredSize(new Dimension(700, 60));
        upperPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 20));
        upperPanel.setOpaque(false);
        upperPanel.add(emptyLabel);
        upperPanel.add(leftRotorLabel);
        upperPanel.add(middleRotorLabel);
        upperPanel.add(rightRotorLabel);


        // Change Rotor Section
        // Label
        JLabel rotorLabel = new JLabel("Rotor              ");
        rotorLabel.setForeground(Color.WHITE);
        rotorLabel.setFont(settingFont);
        // Left Rotor
        String[] rotors = {"Rotor I", "Rotor II", "Rotor III"};
        changeLeftRotor = new JComboBox(rotors);
        changeLeftRotor.setSelectedItem(enigma.getLeftRotor().getName());
        changeLeftRotor.setPreferredSize(new Dimension(100, 30));
        // Middle Rotor
        changeMiddleRotor = new JComboBox(rotors);
        changeMiddleRotor.setSelectedItem(enigma.getMiddleRotor().getName());
        changeMiddleRotor.setPreferredSize(new Dimension(100, 30));
        // Right Rotor
        changeRightRotor = new JComboBox(rotors);
        changeRightRotor.setSelectedItem(enigma.getRightRotor().getName());
        changeRightRotor.setPreferredSize(new Dimension(100, 30));
        // Panel
        JPanel changeRotorPanel = new JPanel();
        changeRotorPanel.setPreferredSize(new Dimension(700, 60));
        changeRotorPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 55, 20));
        changeRotorPanel.setOpaque(false);
        changeRotorPanel.add(rotorLabel);
        changeRotorPanel.add(changeLeftRotor);
        changeRotorPanel.add(changeMiddleRotor);
        changeRotorPanel.add(changeRightRotor);


        // Initial Position Section
        // Label
        JLabel initialLabel = new JLabel("Initial Position");
        initialLabel.setForeground(Color.WHITE);
        initialLabel.setFont(settingFont);
        // Left Rotor
        Character[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        initialLeftRotor = new JComboBox(alphabet);
        initialLeftRotor.setSelectedItem(enigma.getLeftRotor().getFirstAlphabet());
        initialLeftRotor.setPreferredSize(new Dimension(100, 30));
        // Middle Rotor
        initialMiddleRotor = new JComboBox(alphabet);
        initialMiddleRotor.setSelectedItem(enigma.getMiddleRotor().getFirstAlphabet());
        initialMiddleRotor.setPreferredSize(new Dimension(100, 30));
        // Right Rotor
        initialRightRotor = new JComboBox(alphabet);
        initialRightRotor.setSelectedItem(enigma.getRightRotor().getFirstAlphabet());
        initialRightRotor.setPreferredSize(new Dimension(100, 30));
        // Panel
        JPanel initialPanel = new JPanel();
        initialPanel.setPreferredSize(new Dimension(700, 60));
        initialPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 55, 20));
        initialPanel.setOpaque(false);
        initialPanel.add(initialLabel);
        initialPanel.add(initialLeftRotor);
        initialPanel.add(initialMiddleRotor);
        initialPanel.add(initialRightRotor);


        // Save Section
        saveButton = new Button("Save");
        saveButton.setFocusable(false);
        saveButton.setFont(new Font("Dialog", 1, 15));
        saveButton.setPreferredSize(new Dimension(80, 30));
        saveButton.addActionListener(this);
        JPanel savePanel = new JPanel();
        savePanel.setPreferredSize(new Dimension(100, 60));
        savePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        savePanel.setOpaque(false);
        savePanel.add(saveButton);


        this.add(upperPanel);
        this.add(changeRotorPanel);
        this.add(initialPanel);
        this.add(savePanel);
    }

    private Rotor getSelectedRotor(String selected) {
        if (selected.equals("Rotor I")) {
            return enigma.getRotor1();
        }
        else if (selected.equals("Rotor II")) {
            return enigma.getRotor2();
        }
        else {
            return enigma.getRotor3();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            enigma.setLeftRotor(getSelectedRotor(changeLeftRotor.getSelectedItem().toString()));
            enigma.setMiddleRotor(getSelectedRotor(changeMiddleRotor.getSelectedItem().toString()));
            enigma.setRightRotor(getSelectedRotor(changeRightRotor.getSelectedItem().toString()));

            enigma.getLeftRotor().setInitialPosition(initialLeftRotor.getSelectedItem().toString().charAt(0));
            enigma.getMiddleRotor().setInitialPosition(initialMiddleRotor.getSelectedItem().toString().charAt(0));
            enigma.getRightRotor().setInitialPosition(initialRightRotor.getSelectedItem().toString().charAt(0));

            rotorPanel.setAllRotor();
        }
    }
}
