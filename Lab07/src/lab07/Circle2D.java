/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Alen Alimkhanov (n01291955)
 */
public class Circle2D {
    double x, y; //Data fields that specify the center of the circle 
    double radius;
    //No-arg constructor that creates default circle
    Circle2D(){
        radius = 1.0;
        x = 0;
        y = 0;
    }
    //Constructor with the specified values
    Circle2D(double x, double y, double radius){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    //Get Method
    double get(){
        return radius;
    }
    //A method that returns the area of the circle
    public double getArea(){
        return 3.14159265 * radius * radius;
    }
    //A method that returns the perimeter of the circle
    public double getPerimeter(){
        return 2 * 3.14159265 * radius;
    }
    //A method that returns TRUE if the specified point is inside this circle
    public boolean contains(double x, double y){
       double d = Math.sqrt(Math.pow(x - this.x, 2.0) + Math.pow(y - this.y, 2.0));
       if(d <= radius){
           return true;
       }
       else {
           return false;
       }
    }
    //A method that returns TRUE if the specified circle is inside this circle
    public boolean contains(Circle2D circle){
        double d = Math.sqrt(Math.pow(x - circle.x, 2.0) + Math.pow(y - circle.y, 2.0));
        if(d <= (radius * radius) - (circle.radius * circle.radius)){
            return true;
        }
        else {
            return false;
        }
    }
    //A method that returns TRUE if the specified circle overlaps with this circle
    public boolean overlaps(Circle2D circle){
        double d = Math.sqrt(Math.pow(x - circle.x, 2.0) + Math.pow(y - circle.y, 2.0));
        if(d <= radius + circle.radius){
            return true;
        } 
        else {
            return false;
        }
    }
}
