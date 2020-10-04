/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Alen Alimkhanov (n01291955)
 */
import java.util.Scanner;
import javax.swing.*;
public class Location {
    public int row;
    public int column;
    public double maxValue;
    
    public Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    
    public static Location locateLargest(double[][] a){
        int[]location = new int[2];       
        double maxElement = 0;
        for(int row = 0; row < a.length; row++){
            for(int column = 0; column < a.length; column++){
                if(a[row][column] > maxElement){
                    maxElement = a[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        
        Location finalResult = new Location(location[0], location[1], maxElement);
        return finalResult; 
    }
    
    public static void main(String[]args){ 
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns in the array:");
        int r = myObj.nextInt();
        int c = myObj.nextInt();
        double[][] a = new double[r][c];
        double max = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[r][c] = myObj.nextDouble();
            }
        }
        
    }

}
