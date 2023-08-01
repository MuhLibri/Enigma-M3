package com.enigma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlugboardPanel extends JPanel implements ActionListener {
    Enigma enigma;
    List<PlugButton> addList;
    List<Color> colorList;
    Color currentColor;
    PlugButton buttonA;
    PlugButton buttonB;
    PlugButton buttonC;
    PlugButton buttonD;
    PlugButton buttonE;
    PlugButton buttonF;
    PlugButton buttonG;
    PlugButton buttonH;
    PlugButton buttonI;
    PlugButton buttonJ;
    PlugButton buttonK;
    PlugButton buttonL;
    PlugButton buttonM;
    PlugButton buttonN;
    PlugButton buttonO;
    PlugButton buttonP;
    PlugButton buttonQ;
    PlugButton buttonR;
    PlugButton buttonS;
    PlugButton buttonT;
    PlugButton buttonU;
    PlugButton buttonV;
    PlugButton buttonW;
    PlugButton buttonX;
    PlugButton buttonY;
    PlugButton buttonZ;


    public PlugboardPanel(Enigma enigma) {
        this.enigma = enigma;
        this.addList = new ArrayList<>();
        this.colorList = new ArrayList<>(Arrays.asList(Color.RED, Color.BLUE, Color.MAGENTA, Color.GREEN, Color.ORANGE, Color.CYAN, new Color(95, 50, 20), Color.PINK, new Color(128, 0, 128), new Color(154, 205, 50), new Color(75, 0, 130), new Color(160, 82, 45), new Color(0, 100, 0)));
        this.currentColor = colorList.get(0);

        // Plugs
        buttonA = new PlugButton("A");
        buttonA.addActionListener(this);
        buttonB = new PlugButton("B");
        buttonB.addActionListener(this);
        buttonC = new PlugButton("C");
        buttonC.addActionListener(this);
        buttonD = new PlugButton("D");
        buttonD.addActionListener(this);
        buttonE = new PlugButton("E");
        buttonE.addActionListener(this);
        buttonF = new PlugButton("F");
        buttonF.addActionListener(this);
        buttonG = new PlugButton("G");
        buttonG.addActionListener(this);
        buttonH = new PlugButton("H");
        buttonH.addActionListener(this);
        buttonI = new PlugButton("I");
        buttonI.addActionListener(this);
        buttonJ = new PlugButton("J");
        buttonJ.addActionListener(this);
        buttonK = new PlugButton("K");
        buttonK.addActionListener(this);
        buttonL = new PlugButton("L");
        buttonL.addActionListener(this);
        buttonM = new PlugButton("M");
        buttonM.addActionListener(this);
        buttonN = new PlugButton("N");
        buttonN.addActionListener(this);
        buttonO = new PlugButton("O");
        buttonO.addActionListener(this);
        buttonP = new PlugButton("P");
        buttonP.addActionListener(this);
        buttonQ = new PlugButton("Q");
        buttonQ.addActionListener(this);
        buttonR = new PlugButton("R");
        buttonR.addActionListener(this);
        buttonS = new PlugButton("S");
        buttonS.addActionListener(this);
        buttonT = new PlugButton("T");
        buttonT.addActionListener(this);
        buttonU = new PlugButton("U");
        buttonU.addActionListener(this);
        buttonV = new PlugButton("V");
        buttonV.addActionListener(this);
        buttonW = new PlugButton("W");
        buttonW.addActionListener(this);
        buttonX = new PlugButton("X");
        buttonX.addActionListener(this);
        buttonY = new PlugButton("Y");
        buttonY.addActionListener(this);
        buttonZ = new PlugButton("Z");
        buttonZ.addActionListener(this);

        // Panel
        // 1st Row
        JPanel plugboardPanel1 = new JPanel();
        plugboardPanel1.setOpaque(false);
        plugboardPanel1.setPreferredSize(new Dimension(650, 60));
        plugboardPanel1.setLayout(new GridLayout(1, 9, 10, 10));
        plugboardPanel1.add(buttonQ);
        plugboardPanel1.add(buttonW);
        plugboardPanel1.add(buttonE);
        plugboardPanel1.add(buttonR);
        plugboardPanel1.add(buttonT);
        plugboardPanel1.add(buttonZ);
        plugboardPanel1.add(buttonU);
        plugboardPanel1.add(buttonI);
        plugboardPanel1.add(buttonO);
        // 2nd Row
        JPanel plugboardPanel2 = new JPanel();
        plugboardPanel2.setOpaque(false);
        plugboardPanel2.setPreferredSize(new Dimension(574, 60));
        plugboardPanel2.setLayout(new GridLayout(1, 8, 10, 10));
        plugboardPanel2.add(buttonA);
        plugboardPanel2.add(buttonS);
        plugboardPanel2.add(buttonD);
        plugboardPanel2.add(buttonF);
        plugboardPanel2.add(buttonG);
        plugboardPanel2.add(buttonH);
        plugboardPanel2.add(buttonJ);
        plugboardPanel2.add(buttonK);
        // 3rd Row
        JPanel plugboarddPanel3 = new JPanel();
        plugboarddPanel3.setOpaque(false);
        plugboarddPanel3.setPreferredSize(new Dimension(650, 60));
        plugboarddPanel3.setLayout(new GridLayout(1, 9, 10, 10));
        plugboarddPanel3.add(buttonP);
        plugboarddPanel3.add(buttonY);
        plugboarddPanel3.add(buttonX);
        plugboarddPanel3.add(buttonC);
        plugboarddPanel3.add(buttonV);
        plugboarddPanel3.add(buttonB);
        plugboarddPanel3.add(buttonN);
        plugboarddPanel3.add(buttonM);
        plugboarddPanel3.add(buttonL);


        this.setBackground(new Color(31, 31, 33));
        this.setPreferredSize(new Dimension(800, 350));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
        this.add(plugboardPanel1);
        this.add(plugboardPanel2);
        this.add(plugboarddPanel3);

        setUpPlug();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonA) {
            switchPlug(buttonA);
        }
        else if (e.getSource() == buttonB) {
            switchPlug((buttonB));
        }
        else if (e.getSource() == buttonC) {
            switchPlug((buttonC));
        }
        else if (e.getSource() == buttonD) {
            switchPlug((buttonD));
        }
        else if (e.getSource() == buttonE) {
            switchPlug((buttonE));
        }
        else if (e.getSource() == buttonF) {
            switchPlug((buttonF));
        }
        else if (e.getSource() == buttonG) {
            switchPlug((buttonG));
        }
        else if (e.getSource() == buttonH) {
            switchPlug((buttonH));
        }
        else if (e.getSource() == buttonI) {
            switchPlug((buttonI));
        }
        else if (e.getSource() == buttonJ) {
            switchPlug((buttonJ));
        }
        else if (e.getSource() == buttonK) {
            switchPlug((buttonK));
        }
        else if (e.getSource() == buttonL) {
            switchPlug((buttonL));
        }
        else if (e.getSource() == buttonM) {
            switchPlug((buttonM));
        }
        else if (e.getSource() == buttonN) {
            switchPlug((buttonN));
        }
        else if (e.getSource() == buttonO) {
            switchPlug((buttonO));
        }
        else if (e.getSource() == buttonP) {
            switchPlug((buttonP));
        }
        else if (e.getSource() == buttonQ) {
            switchPlug((buttonQ));
        }
        else if (e.getSource() == buttonR) {
            switchPlug((buttonR));
        }
        else if (e.getSource() == buttonS) {
            switchPlug((buttonS));
        }
        else if (e.getSource() == buttonT) {
            switchPlug((buttonT));
        }
        else if (e.getSource() == buttonU) {
            switchPlug((buttonU));
        }
        else if (e.getSource() == buttonV) {
            switchPlug((buttonV));
        }
        else if (e.getSource() == buttonW) {
            switchPlug((buttonW));
        }
        else if (e.getSource() == buttonX) {
            switchPlug((buttonX));
        }
        else if (e.getSource() == buttonY) {
            switchPlug((buttonY));
        }
        else if (e.getSource() == buttonZ) {
            switchPlug((buttonZ));
        }
    }

    private void setUpPlug() {
        for (int i = 0; i < enigma.getPlugboard().getSwitchTuples().size(); i++) {
            plug(enigma.getPlugboard().getSwitchTuples().get(i).chr1);
            plug(enigma.getPlugboard().getSwitchTuples().get(i).chr2);
        }
    }

    private void plug(char chr) {
        System.out.println(chr);
        if (chr == 'A') {
            recoverPlug(buttonA);
        }
        else if (chr == 'B') {
            recoverPlug(buttonB);
        }
        else if (chr == 'C') {
            recoverPlug(buttonC);
        }

        else if (chr == 'D') {
            recoverPlug(buttonD);
        }

        else if (chr == 'E') {
            recoverPlug(buttonE);
        }

        else if (chr == 'F') {
            recoverPlug(buttonF);
        }

        else if (chr == 'G') {
            recoverPlug(buttonG);
        }

        else if (chr == 'H') {
            recoverPlug(buttonH);
        }

        else if (chr == 'I') {
            recoverPlug(buttonI);
        }

        else if (chr == 'J') {
            recoverPlug(buttonJ);
        }

        else if (chr == 'K') {
            recoverPlug(buttonK);
        }

        else if (chr == 'L') {
            recoverPlug(buttonL);
        }

        else if (chr == 'M') {
            recoverPlug(buttonM);
        }

        else if (chr == 'N') {
            recoverPlug(buttonN);
        }

        else if (chr == 'O') {
            recoverPlug(buttonO);
        }

        else if (chr == 'P') {
            recoverPlug(buttonP);
        }

        else if (chr == 'Q') {
            recoverPlug(buttonQ);
        }

        else if (chr == 'R') {
            recoverPlug(buttonR);
        }

        else if (chr == 'S') {
            recoverPlug(buttonS);
        }

        else if (chr == 'T') {
            recoverPlug(buttonT);
        }

        else if (chr == 'U') {
            recoverPlug(buttonU);
        }

        else if (chr == 'V') {
            recoverPlug(buttonV);
        }

        else if (chr == 'W') {
            recoverPlug(buttonW);
        }

        else if (chr == 'X') {
            recoverPlug(buttonX);
        }

        else if (chr == 'Y') {
            recoverPlug(buttonY);
        }

        else if (chr == 'Z') {
            recoverPlug(buttonZ);
        }
    }

    private void recoverPlug(PlugButton plugButton) {
        plugButton.setBackground(currentColor);
        for (int i = 0; i < addList.size(); i++) {
            if (addList.get(i).getBackground() == plugButton.getBackground()) {
                colorList.remove(0);
                currentColor = colorList.get(0);
            }
        }
        addList.add(plugButton);
    }

    private void switchPlug(PlugButton plugButton) {
        char plugButtonChar = plugButton.getButtonName();
        if (addList.contains(plugButton)) {
            colorList.add(plugButton.getBackground());
            plugButton.setBackground(Color.BLACK);
            enigma.getPlugboard().deletePlugboard(plugButtonChar);
        }
        else {
            plugButton.setBackground(currentColor);
            for (int i = 0; i < addList.size(); i++) {
                if (addList.get(i).getBackground() == plugButton.getBackground()) {
                    colorList.remove(0);
                    currentColor = colorList.get(0);
                    enigma.getPlugboard().addPlugboard(addList.get(i).getButtonName(), plugButtonChar);
                }
            }
            addList.add(plugButton);
        }
    }
}


class PlugButton extends JButton {
    private String label;

    public PlugButton(String label) {
        this.label = label;
        setPreferredSize(new Dimension(70, 70));
        setContentAreaFilled(false);
        setBorderPainted(false);
        setBackground(Color.BLACK);
    }

    public char getButtonName() {
        return label.charAt(0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(50, 50);
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(30, 30);
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(60, 60);
    }

    @Override
    public boolean contains(int x, int y) {
        int radius = getSize().width / 2;
        return Math.pow(x - radius, 2) + Math.pow(y - radius, 2) <= Math.pow(radius, 2);
    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);

        // Draw the label above the button
        g.setColor(Color.WHITE);
        g.setFont(new Font("Dialog", 1, 15));
        FontMetrics metrics = g.getFontMetrics();
        int x = (getWidth() - metrics.stringWidth(label)) / 2;
        int y = getHeight() / 2 - metrics.getHeight() / 2;
        g.drawString(label, x, y);
    }
}