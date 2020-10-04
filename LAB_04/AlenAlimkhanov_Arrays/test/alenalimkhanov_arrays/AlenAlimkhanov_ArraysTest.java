/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alenalimkhanov_arrays;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author n01291955
 */
public class AlenAlimkhanov_ArraysTest {
    
    public AlenAlimkhanov_ArraysTest() {
    }

    /**
     * Test of main method, of class AlenAlimkhanov_Arrays.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AlenAlimkhanov_Arrays.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mean method, of class AlenAlimkhanov_Arrays.
     */
    @Test
    public void testMean() {
        System.out.println("mean");
        double[] x = null;
        double expResult = 0.0;
        double result = AlenAlimkhanov_Arrays.mean(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seriesSum method, of class AlenAlimkhanov_Arrays.
     */
    @Test
    public void testSeriesSum() {
        System.out.println("seriesSum");
        double expResult = 0.0;
        double result = AlenAlimkhanov_Arrays.seriesSum();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUppercaseCount method, of class AlenAlimkhanov_Arrays.
     */
    @Test
    public void testGetUppercaseCount() {
        System.out.println("getUppercaseCount");
        String s = "";
        int expResult = 0;
        int result = AlenAlimkhanov_Arrays.getUppercaseCount(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
