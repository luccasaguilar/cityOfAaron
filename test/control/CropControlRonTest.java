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
 * @author ronsilva
 */
public class CropControlRonTest {
    
    public CropControlRonTest() {
    }

    /**
     * Test of calcLandCost method, of class CropControl.
     */
    @Test
    public void testFeedPeople1() {
        System.out.println("feedPeople1");
        int wheatForFood = 10;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = 390;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        assertEquals(expResult, result); 
    }
    
     /**
     * Test of calcLandCost method, of class CropControl.
     */
    @Test
    public void testFeedPeople2() {
        System.out.println("feedPeople2");
        int wheatForFood = -30;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = -1;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of calcLandCost method, of class CropControl.
     */
    @Test
    public void testFeedPeople3() {
        System.out.println("feedPeople3");
        int wheatForFood = 430;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = -1;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of calcLandCost method, of class CropControl.
     */
    @Test
    public void testFeedPeople4() {
        System.out.println("feedPeople4");
        int wheatForFood = 100;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = 300;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        assertEquals(expResult, result);
    } 
}
