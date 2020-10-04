/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alenalimkhanov_;

/**
 *
 * @author Alen Alimkhanov (n01291955)
 */
import java.util.Scanner;
public class AlenAlimkhanov_ {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns of the array: ");
        double [][]a = new double[input.nextInt()][input.nextInt()];
        int []finalResult = new int[2];
        //double maxElement = 0;
        System.out.println("Please enter the array: ");
        for(int row = 0; row < a.length; row++){
            for(int column = 0; column < a.length; column++){
                a[row][column] = input.nextDouble();
            }
        }
        finalResult = locateLargest(a);
        System.out.println("The location of the largest element:\n("+finalResult[0]+","+finalResult[1]+")");
    }

    /*
    input for double with comma sign
    23,5 4,5 35 3
    2 45 10 3,5
    35 44 5,5 9,6
    */
    
    public static int[] locateLargest(double[][] a){
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
        return location; 
    }
    
}
