package com.company;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
	// write your code here
        Main frame = new Main();
        frame.setTitle("Random Cards");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    //Main Constructor (конструктор)
    public Main(){
        setLayout(new GridLayout(1, 3, 5, 5)); //Setting positions for the cards (Места и пробелы)
        ImageIcon []image = new ImageIcon[54];
        for(int i = 0; i < 54; i++){
            image[i] = new ImageIcon("C:/Users/ww/Desktop/Lab10/card/" + i + ".png");
        }
        int r1 = (int) ((Math.random() * 54) + 1);
        int r2 = (int) ((Math.random() * 54) + 1);
        int r3 = (int) ((Math.random() * 54) + 1);
        while(r1 == r2 && r1 == r3 && r2 == r3 && r2 == r1 && r3 == r1 && r3 == r2) {
            if (r1 == r2 || r1 == r3) {
                r1 = (int) ((Math.random() * 54) + 1);
            }
            if (r2 == r1 || r2 == r3) {
                r2 = (int) ((Math.random() * 54) + 1);
            }
            if (r3 == r1 || r3 == r2) {
                r3 = (int) ((Math.random() * 54) + 1);
            }
        }
        JLabel jLabel1 = new JLabel(image[r1]);
        JLabel jLabel2 = new JLabel(image[r2]);
        JLabel jLabel3 = new JLabel(image[r3]);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
    }
    /*
    Answering to questions
        * 1. Can your program create the UI? ---> Yes
        * 2. Can your program display one image correctly? ---> Yes
        * 3. Can your program display three images correctly? ---> Yes
        * 4. Can your program display card images randomly? ---> Yes
    */
}
