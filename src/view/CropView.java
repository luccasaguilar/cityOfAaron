/*
* The CropView class - part of the view layer file for the cityOfAaron project
* Object of this class manages the interaction with the user
* Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
*Date last modified: 06 NOV 2018
*/
package view;

import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author Luccas
 */
public class CropView {
    
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);   
     
    // Get references to the Game object and the CropData object
    static private Game game = CityOfAaron.getGame();
    static private CropData cropData = game.getCropData();
    
    // The buyLandView method
    // Purpose: interface with the user input for buying land
    // Parameters: none
    // Returns: none
    // author Luccas
    public static void buyLandView(){
        
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n",price);
        System.out.print("\nHow many acres of land do you wish to buy? "); 

        //  Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();

        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.buyLand(price, toBuy, cropData);
        
        // output how much land we now own
        System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
    }
    
    public static void sellLandView() {
        //Get the cost of sell land for this round
        int price = CropControl.calcLandCost();
        
        //Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre. %n", price);
        System.out.format("\nHow many acres of land do you want to sell?");
        
        //Get the user's input and save it
        int toSell;
        toSell = keyboard.nextInt();
        
        //Call the sellLand() mehtod in the control layer to sell the land
        CropControl.sellLand(price, toSell, cropData);
        
        //Output how many wheat we now own
        System.out.format("You now own %d acres of land", cropData.getWheatInStore());
    }
    
    // The feedPeopleView method
    // Purpose: interface with the user input the number of wheat to set aside
    // Parameters: none
    // Returns: none  
    // author Ron Silva
    public static void feedPeopleView(){
        
        // Prompt the user to enter the the number of wheat to set aside
        System.out.print("\nHow many wheats do you want to set aside? "); 

        //  Get the user’s input and save it.
        int wheatForFood;
        wheatForFood  = keyboard.nextInt();

        // Call the feedPeople( ) method in the control layer to feed people
        CropControl.feedPeople(wheatForFood, cropData);
        
        // output the number of wheat to set aside
        System.out.format("You set aside. ", cropData.getWheatForFood());
    }
    
    // The plantCropsView method
    // Purpose: interface with the user input for planting land
    // Parameters: none
    // Returns: none  
    // author Luccas
    public static void plantCropsView(){
        
        // Prompt the user to enter the number of acres to plant
        System.out.print("\nHow many acres of land do you want to plant? "); 

        //  Get the user’s input and save it.
        int acresToPlant;
        acresToPlant = keyboard.nextInt();

        // Call the plantCrops( ) method in the control layer to plant crops
        CropControl.plantCrops(acresToPlant, cropData);
        
        // output how much land is planted
        System.out.format("You now have %d acres planted. ", cropData.getAcresPlanted());

        // output the amount of wheat left in storage
        System.out.format("\nYou now have %d wheat in store. ", cropData.getWheatInStore());
    }
    
        // The runCropView method()
    // Purpose: runs the methods to manage the crops game
    // Parameters: none
    // Returns: none
    public static void runCropView(){
        
        // call the buyLandView( ) method - 1
        buyLandView( );
        
        // call the SellLandView( ) method - 2
        
        // call the feedPeopleView( ) method - 3
        feedPeopleView();
        
        // call the plantCropsView( ) method - 4
        plantCropsView();

    }

}
