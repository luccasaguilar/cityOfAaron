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
public class CropControlLuccasTest {
    
    public CropControlLuccasTest() {
    }
     /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops1() {
        System.out.println("plantCrops1");
        int acresToPlant = 50;
        CropData cropData = new CropData();
        cropData.setPopulation(100);
        cropData.setAcresOwned(200);
        cropData.setWheatInStore(400);
        int expResult = 50;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }    
     /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops2() {
        System.out.println("plantCrops2");
        int acresToPlant = -50;
        CropData cropData = new CropData();
        cropData.setPopulation(100);
        cropData.setAcresOwned(200);
        cropData.setWheatInStore(400);
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }    

     /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops3() {
        System.out.println("plantCrops3");
        int acresToPlant = 100;
        CropData cropData = new CropData();
        cropData.setPopulation(100);
        cropData.setAcresOwned(80);
        cropData.setWheatInStore(400);
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }    
    
     /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops4() {
        System.out.println("plantCrops4");
        int acresToPlant = 100;
        CropData cropData = new CropData();
        cropData.setPopulation(5);
        cropData.setAcresOwned(200);
        cropData.setWheatInStore(400);
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }    

     /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops5() {
        System.out.println("plantCrops5");
        int acresToPlant = 100;
        CropData cropData = new CropData();
        cropData.setPopulation(100);
        cropData.setAcresOwned(200);
        cropData.setWheatInStore(40);
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }    

     /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops6() {
        System.out.println("plantCrops6");
        int acresToPlant = 50;
        CropData cropData = new CropData();
        cropData.setPopulation(100);
        cropData.setAcresOwned(50);
        cropData.setWheatInStore(400);
        int expResult = 50;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }    
    
     /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops7() {
        System.out.println("plantCrops7");
        int acresToPlant = 0;
        CropData cropData = new CropData();
        cropData.setPopulation(100);
        cropData.setAcresOwned(200);
        cropData.setWheatInStore(400);
        int expResult = 0;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }    

}
