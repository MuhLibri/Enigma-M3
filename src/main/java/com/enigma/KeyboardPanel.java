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
//        buttonA.addActionListener(this);
        buttonB = new RoundJButton("B");
//        buttonB.addActionListener(this);
        buttonC = new RoundJButton("C");
//        buttonC.addActionListener(this);
        buttonD = new RoundJButton("D");
//        buttonD.addActionListener(this);
        buttonE = new RoundJButton("E");
//        buttonE.addActionListener(this);
        buttonF = new RoundJButton("F");
//        buttonF.addActionListener(this);
        buttonG = new RoundJButton("G");
//        buttonG.addActionListener(this);
        buttonH = new RoundJButton("H");
//        buttonH.addActionListener(this);
        buttonI = new RoundJButton("I");
//        buttonI.addActionListener(this);
        buttonJ = new RoundJButton("J");
//        buttonJ.addActionListener(this);
        buttonK = new RoundJButton("K");
//        buttonK.addActionListener(this);
        buttonL = new RoundJButton("L");
//        buttonL.addActionListener(this);
        buttonM = new RoundJButton("M");
//        buttonM.addActionListener(this);
        buttonN = new RoundJButton("N");
//        buttonN.addActionListener(this);
        buttonO = new RoundJButton("O");
//        buttonO.addActionListener(this);
        buttonP = new RoundJButton("P");
//        buttonP.addActionListener(this);
        buttonQ = new RoundJButton("Q");
//        buttonQ.addActionListener(this);
        buttonR = new RoundJButton("R");
//        buttonR.addActionListener(this);
        buttonS = new RoundJButton("S");
//        buttonS.addActionListener(this);
        buttonT = new RoundJButton("T");
//        buttonT.addActionListener(this);
        buttonU = new RoundJButton("U");
//        buttonU.addActionListener(this);
        buttonV = new RoundJButton("V");
//        buttonV.addActionListener(this);
        buttonW = new RoundJButton("W");
//        buttonW.addActionListener(this);
        buttonX = new RoundJButton("X");
//        buttonX.addActionListener(this);
        buttonY = new RoundJButton("Y");
//        buttonY.addActionListener(this);
        buttonZ = new RoundJButton("Z");
//        buttonZ.addActionListener(this);
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

//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
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