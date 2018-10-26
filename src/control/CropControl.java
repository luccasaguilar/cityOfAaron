// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Luccas Aguilar, Ronald Silva, Ronan Macedo
// Date last modified: October 2018
//-------------------------------------------------------------
package control;

import java.util.Random;
import model.*;

public class CropControl
{
// constants
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;

// random number generator
private static Random random = new Random();

// calcLandCost() method
// Purpose: Calculate a random land cost between 17 and 26 bushels/acre
// Parameters: none
// Returns: the land cost
public static int calcLandCost()
{
    int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;  
    return landPrice;            
}
   
// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and
//    a reference to a CropData object
// Returns: the number of acres owned after the sale
// Pre-conditions: acres to sell must be positive
// and <= acresOwned
 public static int sellLand(int landPrice, int acresToSell, CropData cropData)
 { 
    //if acresToSell < 0, return -1
    if(acresToSell < 0)
        return -1;

    //if acresToSell > acresOwned, return -1
    int owned = cropData.getAcresOwned();
    if(acresToSell > owned)
        return -1;
    
    //acresOwned = acresOwned - acresToSell
    owned -= acresToSell;
    cropData.setAcresOwned(owned);

    //wheatInStore = wheatInStore + acresToSell * landPrice
    int wheat = cropData.getWheatInStore();
    wheat+= (acresToSell * landPrice);
    cropData.setWheatInStore(wheat);

    //return acresOwned
    return owned;
 }
 
// The buyLand method
// Purpose: To buy land
// Parameters: the price of land, the number of acres to buy.
//    and a reference to a CropData object
// Returns: the number of acres after the purchase
// Pre-conditions: acres to buy must be positive
// and wheat In Store >= total land price (acresToBuy x landPrice)
public static int buyLand(int landPrice, int acresToBuy, CropData cropData)
 { 
    //if acresToBuy < 0, return -1
    if(acresToBuy < 0)
        return -1;

    //If wheatInStore < (acresToBuy x landPrice), return -1
    int wheatInStore = cropData.getWheatInStore();
    if(wheatInStore < (landPrice * acresToBuy))
        return -1;
    
    //acresOwned = acresOwned + acresToBuy
    int owned = cropData.getAcresOwned();
    owned += acresToBuy;
    cropData.setAcresOwned(owned);

    //wheatInStore = wheatInStore - (acresToBuy x landPrice)
    wheatInStore -= (acresToBuy * landPrice);
    cropData.setWheatInStore(wheatInStore);

    //return acresOwned
    return owned;
 }
}
