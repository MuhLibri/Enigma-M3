package com.enigma;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RotorPanel extends JPanel {
    JTextField leftRotor;
    JTextField middleRotor;
    JTextField rightRotor;
    Button upLeftButton;
    Button downLeftButton;
    Button upMiddleButton;
    Button downMiddleButton;
    Button upRightButton;
    Button downRightButton;

    public RotorPanel() {
        // Left Rotor
        leftRotor = new JTextField("A");
        leftRotor.setPreferredSize(new Dimension(30, 50));
        leftRotor.setHorizontalAlignment(SwingConstants.CENTER);
        leftRotor.setEditable(false);
        leftRotor.setBackground(Color.LIGHT_GRAY);
        leftRotor.setBorder(new LineBorder(Color.BLACK));
        upLeftButton = new Button("B");
        upLeftButton.setFocusable(false);
        upLeftButton.setBackground(Color.LIGHT_GRAY);
        downLeftButton = new Button("Z");
        downLeftButton.setFocusable(false);
        downLeftButton.setBackground(Color.LIGHT_GRAY);
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(upLeftButton, BorderLayout.NORTH);
        leftPanel.add(leftRotor, BorderLayout.CENTER);
        leftPanel.add(downLeftButton, BorderLayout.SOUTH);
        leftPanel.setOpaque(false);
        // Middle Rotor
        middleRotor = new JTextField("A");
        middleRotor.setPreferredSize(new Dimension(30, 40));
        middleRotor.setHorizontalAlignment(SwingConstants.CENTER);
        middleRotor.setEditable(false);
        middleRotor.setBackground(Color.LIGHT_GRAY);
        middleRotor.setBorder(new LineBorder(Color.BLACK));
        upMiddleButton = new Button("B");
        upMiddleButton.setFocusable(false);
        upMiddleButton.setBackground(Color.LIGHT_GRAY);
        downMiddleButton = new Button("Z");
        downMiddleButton.setFocusable(false);
        downMiddleButton.setBackground(Color.LIGHT_GRAY);
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout());
        middlePanel.add(upMiddleButton, BorderLayout.NORTH);
        middlePanel.add(middleRotor, BorderLayout.CENTER);
        middlePanel.add(downMiddleButton, BorderLayout.SOUTH);
        middlePanel.setOpaque(false);
        // Right Rotor
        rightRotor = new JTextField("A");
        rightRotor.setPreferredSize(new Dimension(30, 40));
        rightRotor.setHorizontalAlignment(SwingConstants.CENTER);
        rightRotor.setEditable(false);
        rightRotor.setBackground(Color.LIGHT_GRAY);
        rightRotor.setBorder(new LineBorder(Color.BLACK));
        upRightButton = new Button("B");
        upRightButton.setFocusable(false);
        upRightButton.setBackground(Color.LIGHT_GRAY);
        downRightButton = new Button("Z");
        downRightButton.setFocusable(false);
        downRightButton.setBackground(Color.LIGHT_GRAY);
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(upRightButton, BorderLayout.NORTH);
        rightPanel.add(rightRotor, BorderLayout.CENTER);
        rightPanel.add(downRightButton, BorderLayout.SOUTH);
        rightPanel.setOpaque(false);
        // Rotor Panel
        JPanel rotorPanel = new JPanel();
        rotorPanel.setLayout(new GridLayout(1, 3, 5, 5));
        rotorPanel.setPreferredSize(new Dimension(200,105));
        rotorPanel.setBackground(Color.BLACK);
        rotorPanel.setBorder(new LineBorder(Color.BLACK));
        rotorPanel.add(leftPanel);
        rotorPanel.add(middlePanel);
        rotorPanel.add(rightPanel);
        setBackground(new Color(31, 31, 33));
        setPreferredSize(new Dimension(750, 150));
        setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
        add(rotorPanel);
    }
}
