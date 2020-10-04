/** Brief description of Lab03
 * @author mdrk0011
 * @version to be emailed
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng212lab03shell;
/** Brief Ceng212lab03 class description
 * 
 */
public class Ceng212lab03shell {

    /** Brief description of main method in Lab03
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        MyInteger n1 = new MyInteger(5); 
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));
        String s = "3539";
        System.out.println(MyInteger.parseInt(s));
        MyInteger n2 = new MyInteger(24); 
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
    /**
     * @param a1 horizontal coordinate of starting point
     * @param b1 vertical coordinate of starting point
     * @param a2 horizontal coordinate of end point
     * @param b2 vertical coordinate of end point
     * @return maximum number of moves
     * 
     */
    public static int NumKingMoves(int a1, int b1, int a2, int b2){
        // TODO code application logic here
         int resultHorizontal = 0;
         int resultVertical = 0;
        if(a1 > a2){
            resultHorizontal = a1 - a2;
        }
        else {
            resultHorizontal = a2 - a1;
        }
        if(b1 > b2){
            resultVertical = b1 - b2;
        }
        else {
            resultVertical = b2 - b1;
        }
        if (resultHorizontal > resultVertical){
            return resultHorizontal;
        }
        else{
            return resultVertical;
        }
    } //end ChessGameDistance
} //end class Ceng212lab03

/** Brief MyInteger class description
 * 
 *
 */

class MyInteger {
  private final int value;

  public MyInteger(int value) {
    this.value = value;
  }

  public int getValue() {
      return value;
  }

  public boolean isPrime() {
    return isPrime(value);
  }

  public static boolean isPrime(int num) {	
       for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
       return true;
    }
  

  public static boolean isPrime(MyInteger o) {
      return o.isPrime();
  }

  public boolean isEven() {
      return isEven(value);
  }
  
  public boolean isOdd() {
    
      return isOdd(value);
  }
  
  public static boolean isEven(int n) {
      return (n % 2 == 0);
  }
  
  public static boolean isOdd(int n) {
      return (n % 2 != 0);
  }

  public static boolean isEven(MyInteger n) {
      return n.isEven();

  }

  public boolean equals(int anotherNum) {
      return value == anotherNum;
  }

  public boolean equals(MyInteger o) {
      return equals(o.getValue());
  }

  public static int parseInt(char[] numbers) {
    // numbers consists of digit characters.
    // For example, if numbers is {'1', '2', '5'}, the return value
    //  should be 125. Please note that
    // numbers[0] is '1'
    // numbers[1] is '2'
    // numbers[2] is '5'

       return parseInt(new String(numbers));
  }

  // You may mention this when you covered Ch8
  public static int parseInt(String s) {
    // s consists of digit characters.
    // For example, if s is "125", the return value
    //  should be 125.
      return Integer.parseInt(s);

  }

} // end class MyInteger

