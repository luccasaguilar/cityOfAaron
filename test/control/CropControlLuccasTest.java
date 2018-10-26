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
        cropData.setCropYield(200);
        cropData.setWheatInStore(400);
        int expResult = 50;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }    
}
