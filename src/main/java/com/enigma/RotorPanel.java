package com.enigma;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RotorPanel extends JPanel {
    JTextField leftRotor;
    JTextField middleRotor;
    JTextField rightRotor;

    public RotorPanel() {
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
        setBackground(new Color(31, 31, 33));
        setPreferredSize(new Dimension(750, 150));
        setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
        add(rotorPanel);
    }
}
