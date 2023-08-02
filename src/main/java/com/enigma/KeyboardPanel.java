package com.enigma;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class KeyboardPanel extends JPanel {
    KeyboardJButton buttonA;
    KeyboardJButton buttonB;
    KeyboardJButton buttonC;
    KeyboardJButton buttonD;
    KeyboardJButton buttonE;
    KeyboardJButton buttonF;
    KeyboardJButton buttonG;
    KeyboardJButton buttonH;
    KeyboardJButton buttonI;
    KeyboardJButton buttonJ;
    KeyboardJButton buttonK;
    KeyboardJButton buttonL;
    KeyboardJButton buttonM;
    KeyboardJButton buttonN;
    KeyboardJButton buttonO;
    KeyboardJButton buttonP;
    KeyboardJButton buttonQ;
    KeyboardJButton buttonR;
    KeyboardJButton buttonS;
    KeyboardJButton buttonT;
    KeyboardJButton buttonU;
    KeyboardJButton buttonV;
    KeyboardJButton buttonW;
    KeyboardJButton buttonX;
    KeyboardJButton buttonY;
    KeyboardJButton buttonZ;

    public KeyboardPanel() {
        // Buttons
        buttonA = new KeyboardJButton("A");
        buttonB = new KeyboardJButton("B");
        buttonC = new KeyboardJButton("C");
        buttonD = new KeyboardJButton("D");
        buttonE = new KeyboardJButton("E");
        buttonF = new KeyboardJButton("F");
        buttonG = new KeyboardJButton("G");
        buttonH = new KeyboardJButton("H");
        buttonI = new KeyboardJButton("I");
        buttonJ = new KeyboardJButton("J");
        buttonK = new KeyboardJButton("K");
        buttonL = new KeyboardJButton("L");
        buttonM = new KeyboardJButton("M");
        buttonN = new KeyboardJButton("N");
        buttonO = new KeyboardJButton("O");
        buttonP = new KeyboardJButton("P");
        buttonQ = new KeyboardJButton("Q");
        buttonR = new KeyboardJButton("R");
        buttonS = new KeyboardJButton("S");
        buttonT = new KeyboardJButton("T");
        buttonU = new KeyboardJButton("U");
        buttonV = new KeyboardJButton("V");
        buttonW = new KeyboardJButton("W");
        buttonX = new KeyboardJButton("X");
        buttonY = new KeyboardJButton("Y");
        buttonZ = new KeyboardJButton("Z");
        // Panel
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
        keyboardPanel2.setPreferredSize(new Dimension(574, 60));
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

        this.setBackground(new Color(31, 31, 33));
        this.setPreferredSize(new Dimension(750, 300));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
        this.add(keyboardPanel1);
        this.add(keyboardPanel2);
        this.add(keyboardPanel3);
    }
}


class KeyboardJButton extends JButton {
    private Shape shape;

    public KeyboardJButton(String text) {
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
        g.setFont(new Font("Dialog", 1, 15));
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