/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alenalimkhanov_lab10;

/**
 *
 * @author n01291955
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class AlenAlimkhanov_Lab10 extends JFrame implements ActionListener {

    public static void main(String[] args) {

        JFrame shape = new AlenAlimkhanov_Lab10();

        shape.setLocationRelativeTo(null);
        //JOptionPane.showMessageDialog(null, "Your message goes here!","Message", JOptionPane.ERROR_MESSAGE);
        shape.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shape.setSize(400, 400); //Размер Frame
        shape.setVisible(true);
    }

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");

    PolygonsPanel panel = new PolygonsPanel();
    JPanel press;

    public AlenAlimkhanov_Lab10() {
        press = new JPanel();
        JLabel text1;
        JLabel text2;
        setTitle("Lab08 Polygon");
        text1 = new JLabel("Press '+' to add the side");
        text2 = new JLabel("Press '-' to reduce the side");
        text1.setBounds(30, 30, 500, 500);
        text2.setBounds(50, 50, 400, 500);
        press.add(plus);
        press.add(minus);
        plus.addActionListener(this);
        minus.addActionListener(this);        
        add(text1);
        add(text2);
        add(new PolygonsPanel());
        add(press, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            panel.incSideN();
        } else if (e.getSource() == minus) {
            panel.decSideN();
        }
    }

    // Draw a polygon in the panel
    class PolygonsPanel extends JPanel {

        private int sideN = 5;
        private int radius = 0;

        public int getSideN() {
            return this.sideN;
        }

        public void incSideN() {
            this.sideN++;
            repaint();
        }

        public void decSideN() {
            this.sideN--;
            repaint();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Polygon polygon = new Polygon();
            
            int xCenter = getWidth() / 2;
            int yCenter = getHeight() / 2;
            radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

            polygon.addPoint(xCenter + radius, yCenter);

            for (int i = 1; i < sideN; i++) {
                polygon.addPoint((int) (xCenter + radius * Math.cos(i * 2 * Math.PI / sideN)), (int) (yCenter - radius * Math.sin(i * 2 * Math.PI / sideN)));
            }
            g.drawPolygon(polygon);
        }
        /*
        public PolygonsPanel(){
        //Adding buttons
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        add(plus);
        add(minus);
        }
        */
    }
}