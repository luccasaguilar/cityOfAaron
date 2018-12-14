// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Luccas Aguilar, Ronald Silva, Ronan Macedo
// Date last modified: October 2018
//-------------------------------------------------------------
package control;

import java.util.Random;
import model.*;
import exceptions.*;
import cityofaaron.CityOfAaron;
import java.util.ArrayList;



public class CropControl
{
// constants
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;

// random number generator
private static Random random = new Random();
private static Game game = new Game();


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
 public static int sellLand(int landPrice, int acresToSell, CropData cropData) throws CropException
 { 
    //if acresToSell < 0, show "A negative value was input"
    if(acresToSell < 0)
        throw new CropException("A negative value was input");

    //if acresToSell > acresOwned, show "There is insufficient acres to sell this much land"
    int owned = cropData.getAcresOwned();
    if(acresToSell > owned)
        throw new CropException("There is insufficient acres to sell this much land");
    
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
// and a reference to a CropData object
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
// updated at 11/30/2018 to include exception

public static int plantCrops(int acresToPlant, CropData cropData) throws CropException
 { 
    //If acresToPlant < 0, return -1
    if(acresToPlant < 0)
        throw new CropException("A negative value was input");

    //If acresCity < acresToPlant, return -1
    int acresCity = cropData.getAcresOwned();
    if(acresCity < acresToPlant)
        throw new CropException("There is insufficient land to plant this much land");
    
    //If acresToPlant > population x 10, return -1
    int population = cropData.getPopulation();
    if(acresToPlant > (population * 10))
        throw new CropException("There is insufficient population to plant this much land");

    //If wheatInStore < acresPlanted/2, return -1
    int wheatInStore = cropData.getWheatInStore();
    if(wheatInStore < (acresToPlant /2))
        throw new CropException("There is insufficient wheat in store to plant this much land");
    
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

public static int feedPeople(int wheatForFood, CropData cropData) throws CropException

 { 
    //if wheatForFood < 0, Return A negative value was input
    if (wheatForFood < 0)
        throw new CropException("A negative value was input");

    //If wheatInStorage < wheatForFood return There is insufficient wheat to feed the People 
    int wheatInStore = cropData.getWheatInStore();
    if(wheatInStore < wheatForFood)
        throw new CropException("There is insufficient wheat in Store");

    
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


// The surplus method
// Purpose: Surplus wheat to buy more tools
// Parameters: the number of tools to purchase
// and a reference to a CropData object
// Returns: the number of tools to buy using surplus
//Author: Ron Silva
// updated at 12/11/2018 to include exception

public static int surplusWheat (int toolsToBuy, CropData cropData) throws CropException
 { 
      
        
    //If tools to buy < 0, return Please use a valid number
    int _toolsToBuy = cropData.getToolsToBuy();
    if (toolsToBuy < 0){
        throw new CropException("Please use a valid number ");}

    //If wheatInStore < toolsToBuy * 4), return There is insufficient wheat to buy tools, you can use surplus
    int wheatInStore = cropData.getWheatInStore();
    if (wheatInStore < toolsToBuy * 4){
        throw new CropException("There is insufficient wheat to buy tools, you can use surplus");
    }
    wheatInStore -= toolsToBuy * 4;
    cropData.setWheatInStore(wheatInStore);
   
    //return acresPlanted
    return toolsToBuy;
 }
}