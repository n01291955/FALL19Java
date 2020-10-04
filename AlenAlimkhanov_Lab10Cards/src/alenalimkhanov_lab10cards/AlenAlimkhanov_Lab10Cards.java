/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alenalimkhanov_lab10cards;

/**
 *
 * @author Alen Alimkhanov
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class AlenAlimkhanov_Lab10Cards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame shape = new AlenAlimkhanov_Lab10Cards();

        shape.setLocationRelativeTo(null);
        //JOptionPane.showMessageDialog(null, "Your message goes here!","Message", JOptionPane.ERROR_MESSAGE);
        shape.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shape.setSize(400, 400); //Размер Frame
        shape.setVisible(true);
    }
    
}
