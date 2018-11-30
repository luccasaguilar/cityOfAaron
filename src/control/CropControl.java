// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Luccas Aguilar, Ronald Silva, Ronan Macedo
// Date last modified: October 2018
//-------------------------------------------------------------
package control;

import java.util.Random;
import model.*;
import exceptions.*;


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
public static int buyLand(int landPrice, int acresToBuy, CropData cropData) throws CropException
 { 
    //if acresToBuy < 0, return -1
    if(acresToBuy < 0)
        throw new CropException("A negative value was input");

    //If wheatInStore < (acresToBuy x landPrice), return -1
    int wheatInStore = cropData.getWheatInStore();
    if(wheatInStore < (landPrice * acresToBuy))
        throw new CropException("There is insufficient wheat to buy this much land");
    
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

// The plantCrops method
// Purpose: To allocate seed for next years crops
// Parameters: the number of acres to plant
// and a reference to a CropData object
// Returns: the number of acres planted
// Pre-conditions: acres to plant must be positive,
// acres of City >= acres to plant,
//population x 10 >= acres to plant,
//wheat In Store >= acres to plant/2
//Author: Luccas Aguilar

public static int plantCrops(int acresToPlant, CropData cropData)
 { 
    //If acresToPlant < 0, return -1
    if(acresToPlant < 0)
        return -1;

    //If acresCity < acresToPlant, return -1
    int acresCity = cropData.getAcresOwned();
    if(acresCity < acresToPlant)
        return -1;
    
    //If acresToPlant > population x 10, return -1
    int population = cropData.getPopulation();
    if(acresToPlant > (population * 10))
        return -1;

    //If wheatInStore < acresPlanted/2, return -1
    int wheatInStore = cropData.getWheatInStore();
    if(wheatInStore < (acresToPlant /2))
        return -1;
    
    //costToPlant = acresToPlant/2
    int costToPlant = acresToPlant/2;

    //wheatInStore = wheatInStore – costToPlant
    wheatInStore -= costToPlant;
    cropData.setWheatInStore(wheatInStore);
    
    //acresPlanted = acresToPlant
    int acresPlanted = acresToPlant;
    cropData.setAcresPlanted(acresPlanted);
        
    //return acresPlanted
    return acresPlanted;
 }

//The feedPeople method
//purpose: feed people
//parameters: the number of wheat to set aside, the number of wheat left in storage.
//reference to CropData object
//Returns: wheat set aside to feed people and wheat left in storage.
//pre-conditions: must be a positive number.
//and wheat is storage >total of wheat set aside to feet people.

public static int feedPeople(int wheatForFood, CropData cropData)
 { 
    //if wheatForFood < 0, return -1 
    if (wheatForFood < 0)
        return -1;

    //If wheatInStorage < wheatForFood return -1 
    int wheatInStore = cropData.getWheatInStore();
    if(wheatInStore < wheatForFood)
        return -1;
    
    //wheatInStorage = wheatInStorage – wheatForFood
    wheatInStore -= wheatForFood;
    cropData.setWheatForFood(wheatForFood);
    cropData.setWheatInStore(wheatInStore);

    //return wheatForFood and wheatInStorage
    return wheatForFood;
 }

//purpose: set the offering percentage value
//paramenters: percentage value and setOffering from CropData
//return: percentage value
//pre-conditions: must be a positive number and less than 100
public static int setOffering(int percentage, CropData cropData)
    { 
    //if percentage > 100, return -1
    if(percentage > 100)
        return -1;
    
    //if percentage < 100, return -1           s
    if(percentage < 0)
        return -1;
    
    //setOffering 
    cropData.setOffering(percentage);
    
    //return the percentage
        return percentage;           
    }
}
