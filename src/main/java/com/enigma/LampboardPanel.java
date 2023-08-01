package com.enigma;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LampboardPanel extends JPanel {
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

    public LampboardPanel() {
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
        lampboardPanel2.setPreferredSize(new Dimension(574, 60));
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

        this.setBackground(new Color(31, 31, 33));
        this.setPreferredSize(new Dimension(750, 300));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
        this.add(lampboardPanel1);
        this.add(lampboardPanel2);
        this.add(lampboardPanel3);
    }

    public void turnOnLamp(char output) {
        Color onColor = new Color(240, 94, 22);
        Thread thread = new Thread(() -> {
            try {
                if (output == 'A') {
                    lampA.setBackground(onColor);
                    Thread.sleep(1000);
                    lampA.setBackground(Color.BLACK);
                }
                else if (output == 'B') {
                    lampB.setBackground(onColor);
                    Thread.sleep(1000);
                    lampB.setBackground(Color.BLACK);
                }
                else if (output == 'C') {
                    lampC.setBackground(onColor);
                    Thread.sleep(1000);
                    lampC.setBackground(Color.BLACK);
                }
                else if (output == 'D') {
                    lampD.setBackground(onColor);
                    Thread.sleep(1000);
                    lampD.setBackground(Color.BLACK);
                }
                else if (output == 'E') {
                    lampE.setBackground(onColor);
                    Thread.sleep(1000);
                    lampE.setBackground(Color.BLACK);
                }
                else if (output == 'F') {
                    lampF.setBackground(onColor);
                    Thread.sleep(1000);
                    lampF.setBackground(Color.BLACK);
                }
                else if (output == 'G') {
                    lampG.setBackground(onColor);
                    Thread.sleep(1000);
                    lampG.setBackground(Color.BLACK);
                }
                else if (output == 'H') {
                    lampH.setBackground(onColor);
                    Thread.sleep(1000);
                    lampH.setBackground(Color.BLACK);
                }
                else if (output == 'I') {
                    lampI.setBackground(onColor);
                    Thread.sleep(1000);
                    lampI.setBackground(Color.BLACK);
                }
                else if (output == 'J') {
                    lampJ.setBackground(onColor);
                    Thread.sleep(1000);
                    lampJ.setBackground(Color.BLACK);
                }
                else if (output == 'K') {
                    lampK.setBackground(onColor);
                    Thread.sleep(1000);
                    lampK.setBackground(Color.BLACK);
                }
                else if (output == 'L') {
                    lampL.setBackground(onColor);
                    Thread.sleep(1000);
                    lampL.setBackground(Color.BLACK);
                }
                else if (output == 'M') {
                    lampM.setBackground(onColor);
                    Thread.sleep(1000);
                    lampM.setBackground(Color.BLACK);
                }
                else if (output == 'N') {
                    lampN.setBackground(onColor);
                    Thread.sleep(1000);
                    lampN.setBackground(Color.BLACK);
                }
                else if (output == 'O') {
                    lampO.setBackground(onColor);
                    Thread.sleep(1000);
                    lampO.setBackground(Color.BLACK);
                }
                else if (output == 'P') {
                    lampP.setBackground(onColor);
                    Thread.sleep(1000);
                    lampP.setBackground(Color.BLACK);
                }
                else if (output == 'Q') {
                    lampQ.setBackground(onColor);
                    Thread.sleep(1000);
                    lampQ.setBackground(Color.BLACK);
                }
                else if (output == 'R') {
                    lampR.setBackground(onColor);
                    Thread.sleep(1000);
                    lampR.setBackground(Color.BLACK);
                }
                else if (output == 'S') {
                    lampS.setBackground(onColor);
                    Thread.sleep(1000);
                    lampS.setBackground(Color.BLACK);
                }
                else if (output == 'T') {
                    lampT.setBackground(onColor);
                    Thread.sleep(1000);
                    lampT.setBackground(Color.BLACK);
                }
                else if (output == 'U') {
                    lampU.setBackground(onColor);
                    Thread.sleep(1000);
                    lampU.setBackground(Color.BLACK);
                }
                else if (output == 'V') {
                    lampV.setBackground(onColor);
                    Thread.sleep(1000);
                    lampV.setBackground(Color.BLACK);
                }
                else if (output == 'W') {
                    lampW.setBackground(onColor);
                    Thread.sleep(1000);
                    lampW.setBackground(Color.BLACK);
                }
                else if (output == 'X') {
                    lampX.setBackground(onColor);
                    Thread.sleep(1000);
                    lampX.setBackground(Color.BLACK);
                }
                else if (output == 'Y') {
                    lampY.setBackground(onColor);
                    Thread.sleep(1000);
                    lampY.setBackground(Color.BLACK);
                }
                else if (output == 'Z') {
                    lampZ.setBackground(onColor);
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