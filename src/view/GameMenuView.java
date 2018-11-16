/*
* The GameMenuView class - part of the view layer file for the cityOfAaron project
* Object of this class manages the interaction with the user
* Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
*Date last modified: 07 NOV 2018
*/
package view;

import java.util.Scanner;
import model.Game;



/**
 *
 * @author ronsilva
 */
public class GameMenuView extends MenuView {
    
    
    // The DisplayMenuView method
    // Purpose: displays the game menu, gets the user's input, and does the 
    //          selected action
    // Parameters: none
    // Returns: none
    // =========================================================  
    public GameMenuView(){
        super ( "\n" +
                      "**************************************\n" +
                      "* CITY OF AARON: DISPLAY/GAME MENU  *\n" +
                      "**************************************\n" +
                      " 1 - List or view the game map\n" +
                      " 2 - List or view the game menu list\n" +
                      " 3 - List or view the move to new location\n" +
                      " 4 - List or view the game manage crops\n" +
                      " 5 - Return to the Main menu\n",

        5);
    } 
    
     // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================    
    @Override public void doAction(int option)
    {
         switch(option)
        {
            case 1: // view the game map
                viewMap();
                break;
            case 2: // view the game menu list
                viewList();
                break;
            case 3: // move to new location in the game
                moveToNewLocation();
                break;
            case 4: // manage the crops
                manageCrops();
                break;
            case 5: // return to main menu
                return;
 
        } 
    
    }
     
    //the viewMap method
    //Purpose: View the game goals
    //Parameters: none
    //Returns: none
    public void viewMap(){
        //View the map
        System.out.println("\nGame Map");
    }
    
    //The viewList method
    //Purpose: View the game menu list 
    //Parameters: none
    //Returns: none
    public void viewList(){
        //View the game menu list
        //System.out.println("\nGame list");
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
    }
    
    //The moveToNewLocation method
    //Purpose: View the move to new location
    //Parameters: none
    //Returns: none
    public void moveToNewLocation() {
        //View the move to new location
        System.out.println("\nMove to new location");
    }
    
    //The manageCrops method
    //Purpose: View manage crops
    //Parameters: none
    //Returns: none
    public void manageCrops(){
        //View the manage crops
        System.out.println("\nManage crops");
       
        CropView crop = new CropView();
        crop.runCropView();
    }

}
