package com.company;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
	// write your code here
        Main frame = new Main();
        frame.setSize(550, 200); //550, 200
        frame.setTitle("Lab11(Drawing Polygons)");
        frame.setLocationRelativeTo(null); //shows the box in the center of the screen
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public Main() {
        /*
        //Flow layout (polygons are tiny)
        Container container = getContentPane();
        container.setLayout (new FlowLayout(FlowLayout.CENTER));
        container.add(new RegularPolygonPanel(5));
        container.add(new RegularPolygonPanel(6));
        container.add(new RegularPolygonPanel(7));
        container.add(new RegularPolygonPanel(8));
        container.add(new RegularPolygonPanel(9));
        container.add(new RegularPolygonPanel(10));
        */
        //Grid Layout
        setLayout(new GridLayout(1, 5, 5, 5));
        add(new RegularPolygonPanel(5));
        add(new RegularPolygonPanel(6));
        add(new RegularPolygonPanel(7));
        add(new RegularPolygonPanel(8));
        add(new RegularPolygonPanel(9));
        add(new RegularPolygonPanel(10));
    }
}
class RegularPolygonPanel extends JPanel{
    private int sideN;
    private int radius = 0;
    // Constructor (to change number of sides in the polygon)
    public RegularPolygonPanel(int sideN){
        this.sideN = sideN;
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Polygon polygon = new Polygon();
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);
        polygon.addPoint(xCenter + radius, yCenter);
        for (int i = 1; i <= sideN; i++) {
            polygon.addPoint((int) (xCenter + radius * Math.cos(i * 2 * Math.PI / sideN)),
                    (int) (yCenter - radius * Math.sin(i * 2 * Math.PI / sideN)));
        }
        g.drawString("Polygon " + sideN, 20, 30);
        g.drawPolygon(polygon);
    }
}