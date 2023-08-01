package com.enigma;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class KeyboardPanel extends JPanel {
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

    public KeyboardPanel() {
        // Buttons
        buttonA = new RoundJButton("A");
        buttonB = new RoundJButton("B");
        buttonC = new RoundJButton("C");
        buttonD = new RoundJButton("D");
        buttonE = new RoundJButton("E");
        buttonF = new RoundJButton("F");
        buttonG = new RoundJButton("G");
        buttonH = new RoundJButton("H");
        buttonI = new RoundJButton("I");
        buttonJ = new RoundJButton("J");
        buttonK = new RoundJButton("K");
        buttonL = new RoundJButton("L");
        buttonM = new RoundJButton("M");
        buttonN = new RoundJButton("N");
        buttonO = new RoundJButton("O");
        buttonP = new RoundJButton("P");
        buttonQ = new RoundJButton("Q");
        buttonR = new RoundJButton("R");
        buttonS = new RoundJButton("S");
        buttonT = new RoundJButton("T");
        buttonU = new RoundJButton("U");
        buttonV = new RoundJButton("V");
        buttonW = new RoundJButton("W");
        buttonX = new RoundJButton("X");
        buttonY = new RoundJButton("Y");
        buttonZ = new RoundJButton("Z");
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