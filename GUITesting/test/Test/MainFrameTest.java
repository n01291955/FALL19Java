/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.awt.*;
import javax.swing.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sherif Saad
 * @author mdrk0011
 */
public class MainFrameTest {

    /**
     * Test of main method, of class MainFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //This method tests the JTextField Component in MainFrame.java class
    @Test
    public void testInputJTextField(){
        //Define appropriate variables to implement your test scenario
        MainFrame frame;
        JTextField inputTest;
        String expResult;
        
        // start simulating your testing scenario
        frame = new MainFrame();
        frame.setVisible(true);
        
        // use the inputTest as a reference to your JTextField component
        inputTest = (JTextField)getChildNamed(frame, "input");
        
        //check that you actually obtain an access to your target component
        assertNotNull("Can't access the JTextField component", inputTest);
        
        //add some text to the JTextField.
        inputTest.setText("Testing");
        sleep(2000);
        
        //perform action to trigger the action listener of your component.
        inputTest.postActionEvent();
        sleep(2000);
        
        //define and test your expected result.
        expResult = "Testing?";
        assertEquals(expResult,inputTest.getText());      
       
    }

    @Test
    public void testshowJButton(){
        //Define appropriate variables to implement your test scenario
        MainFrame frame;
        JTextField inputTest;
        JTextArea message =null;
        JButton ok = null;
        final JButton showTest;
        String expResult;
        
        // start simulating your testing scenario
        frame = new MainFrame();
        frame.setVisible(true);
        
        // use the showTest as a reference to your JButton component
        showTest = (JButton)getChildNamed(frame, "show");
        
        // use the inputTest as a reference to your JTextField component
        inputTest = (JTextField)getChildNamed(frame, "input");
        
        //check that you actually obtain an access to your target component
        assertNotNull("Can't access the JButton component", showTest);
        assertNotNull("Can't access the JTextField component", inputTest);
        
         //add some text to the JTextField.
        inputTest.setText("GUI Test with JUnit");
        sleep(2000);
        
        //perform action to trigger the action listener of your component.
        inputTest.postActionEvent();
        sleep(2000);
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               showTest.doClick();
            }
         });
         
        // The dialog box will show up shortly
        for (int i = 0; ok == null || message == null; ++i) {
           sleep(1000);
           ok = (JButton)getChildIndexed(frame, "JButton", 0);
           message = (JTextArea)getChildIndexed(frame, "JTextArea", 0);
           assertTrue(i < 10);
        }
       
        //define and test your expected result.
        expResult = "GUI Test with JUnit?... it works!"; 
        assertEquals(UIManager.getString("OptionPane.okButtonText"), ok.getText());
        assertEquals(expResult, message.getText());
        ok.doClick();

    }
   
   
    private void sleep(long millis){
        try{
            Thread.sleep(millis);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static int counter;

    private static Component getChildNamed(Component parent, String name) {
	
        if (name.equals(parent.getName())) { return parent; }

        if (parent instanceof Container) {
	
            Component[] children = (parent instanceof JMenu) ?
                ((JMenu)parent).getMenuComponents() : 
                ((Container)parent).getComponents();
            
            for (int i = 0; i < children.length; ++i) {
                Component child = getChildNamed(children[i], name);		
                if (child != null) { return child; }		
            }	
        }

        return null;
    }

    private static Component getChildIndexed(Component parent, String name, int index) {
        counter = 0;
        // Step in only owned windows and ignore its components in JFrame
        if (parent instanceof Window) {
            Component[] children = ((Window)parent).getOwnedWindows();
            
		for (int i = 0; i < children.length; ++i) {
                    // take only active windows
                    if (children[i] instanceof Window &&
                            !((Window)children[i]).isActive()) { continue; }
                    Component child = getChildIndexedInternal(
                            children[i], name, index);
                    if (child != null) { return child; }
                }
        }
        return null;
    }

    private static Component getChildIndexedInternal(Component parent, String name, int index) {
        
        if (parent.getClass().toString().endsWith(name)) {
            if (counter == index) { return parent; }
            ++counter;
        }
        
        if (parent instanceof Container) {
            Component[] children = (parent instanceof JMenu) ?
                ((JMenu)parent).getMenuComponents() :
                ((Container)parent).getComponents();
            
			for (int i = 0; i < children.length; ++i) {
                            Component child = getChildIndexedInternal(
                                    children[i], name, index);
                            if (child != null) { return child; }
                        }
        }
        return null;
	
    }
    
}