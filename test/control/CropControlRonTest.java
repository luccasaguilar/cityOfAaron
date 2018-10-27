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
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropControl.calcLandCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 0;
        int acresToSell = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int landPrice = 0;
        int acresToBuy = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops");
        int acresToPlant = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatForFood = 0;
        int wheatInStore = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.feedPeople(wheatForFood, wheatInStore, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople1() {
        System.out.println("feedPeople1");
        int wheatForFood = 10;
        int wheatInStore = 400;
        CropData cropData = new CropData();
        int expResult = 390;
        int result = CropControl.feedPeople(wheatForFood, wheatInStore, cropData);
        assertEquals(expResult, result);
     
    }
}
