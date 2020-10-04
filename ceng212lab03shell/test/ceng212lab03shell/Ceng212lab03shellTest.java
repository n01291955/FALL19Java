/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng212lab03shell;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mdrk0011
 */
public class Ceng212lab03shellTest {
    
    /**
     * Test of main method, of class Ceng212lab03.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ceng212lab03shell.main(args);
    }
    @Test
    public void testMyInteger2() {
        MyInteger n1 = new MyInteger(5); 
        assertEquals(false, n1.isEven());
    }
    @Test
    public void testMyInteger3() {
        MyInteger n1 = new MyInteger(5); 
        assertEquals(true,  n1.isPrime());
    }
    @Test
    public void testMyInteger4() {
        assertEquals(false, MyInteger.isPrime(15));
    }
    @Test
    public void testMyInteger5() {
        char[] chars = {'3', '5', '3', '9'};
        assertEquals( 3539, MyInteger.parseInt(chars));
    }
    @Test
    public void testMyInteger6() {
        String s = "3539"; 
        assertEquals(3539, MyInteger.parseInt(s));
    }
    @Test
    public void testMyInteger7() {
        MyInteger n2 = new MyInteger(24); 
        assertEquals(false, n2.isOdd());
    }
    @Test
    public void testMyInteger8() {
        assertEquals(true,  MyInteger.isOdd(45));
    }
    @Test
    public void testMyInteger9() {
        MyInteger n1 = new MyInteger(5);
        MyInteger n2 = new MyInteger(24);
        assertEquals(false, n1.equals(n2));
    }
    @Test
    public void testMyInteger0() {
        MyInteger n1 = new MyInteger(5); 
        assertEquals(true, n1.equals(5));
    }
    @Test
    public void testAlen() {
    assertEquals(4,Ceng212lab03shell.NumKingMoves(6,7,8,3));
    } 
}
