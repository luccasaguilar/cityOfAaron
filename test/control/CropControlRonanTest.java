/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ronan Macedo
 */
public class CropControlRonanTest {
    
    public CropControlRonanTest() {
    }
    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering() {
        System.out.println("setOffering");
        int percentage = 50;
        CropData cropData = new CropData();
        cropData.setOffering(percentage);
        int expResult = 50;
        int result = CropControl.setOffering(percentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetOffering2() {
        System.out.println("setOffering2");
        int percentage = -150;
        CropData cropData = new CropData();
        cropData.setOffering(percentage);
        int expResult = -1;
        int result = CropControl.setOffering(percentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetOffering3() {
        System.out.println("setOffering3");
        int percentage = -150;
        CropData cropData = new CropData();
        cropData.setOffering(percentage);
        int expResult = -1;
        int result = CropControl.setOffering(percentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetOffering4() {
        System.out.println("setOffering4");
        int percentage = 100;
        CropData cropData = new CropData();
        cropData.setOffering(percentage);
        int expResult = 100;
        int result = CropControl.setOffering(percentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetOffering5() {
        System.out.println("setOffering5");
        int percentage = 0;
        CropData cropData = new CropData();
        cropData.setOffering(percentage);
        int expResult = 0;
        int result = CropControl.setOffering(percentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
