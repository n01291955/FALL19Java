/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alenalimkhanov_arrays;

/**
 *
 * @author n01291955
 */
import java.util.Scanner;
public class AlenAlimkhanov_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Part I\nEnter the size of the array that is to be created: ");
        size = input.nextInt();
        System.out.println("Part I\nEnter numbers: ");
        double [] myArray = new double[size];
        for(int i = 0; i < size; i++){
            myArray[i] = input.nextDouble();            
        }
        System.out.println("The mean is: "+mean(myArray));
    }
    //Part I
    public static double mean (double [] x){
        double total = 0;        
        for(int i = 0; i < x.length; i++){
            total += x[i];
        }
        return total / x.length;
    }
    public static double seriesSum(){
        
        return -1;
    }
    public static int getUppercaseCount(String s){
        
        return -1;
    } 
}
