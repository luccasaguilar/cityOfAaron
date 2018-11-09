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
 * @author Luccas
 */
public class CropControlTest {
    
    public CropControlTest() {
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
        public void testBuyLand1() {
        System.out.println("buyLand1");
        int landPrice = 20;
        int acresToBuy = 10;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = 10;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    
        @Test
        public void testBuyLand2() {
        System.out.println("buyLand2");
        int landPrice = 20;
        int acresToBuy = -5;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    
        @Test
        public void testBuyLand3() {
        System.out.println("buyLand3");
        int landPrice = 20;
        int acresToBuy = 100;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    
        @Test
        public void testBuyLand4() {
        System.out.println("buyLand4");
        int landPrice = 20;
        int acresToBuy = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = 20;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    
        @Test
        public void testBuyLand5() {
        System.out.println("buyLand5");
        int landPrice = 20;
        int acresToBuy = 0;
        CropData cropData = new CropData();
        cropData.setWheatInStore (400);
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
}
