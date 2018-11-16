/*
* The MainMenuView class - part of the view layer file for the cityOfAaron project
* Object of this class manages the main menu
* Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
*Date last modified: 01 NOV 2018
*/
package view;

/**
 *
 * @author ronsilva
 */

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.CropControl;
import control.GameControl;

public class MainMenuView extends MenuView {
    
    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================  
    public MainMenuView()
     {

     super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n",
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
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4: // save game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
 
        } 
    }
         
        // The startNewGame method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================     
    public void startNewGame()
    {
        // Display the Banner Page.
        System.out.println("\nWelcome to the city of Aaron.");
        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();

        // Call the createNewGame() method in the GameControl class
        GameControl.createNewGame(name);
        // Display a welcome message
        System.out.println("Welcome " + name + " have fun!!!");
        // Display the Game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();

    } // end of the startNewGame()method
    
    // The startSavedGame method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================     
    public void startSavedGame()
    {
            System.out.println("\nStart saved game option selected.");
    }
    
      // The displayHelpMenuView method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================     
    public void displayHelpMenuView()
    {
            System.out.println("\nDisplay help menu view option selected.");
            HelpMenuView hmv = new HelpMenuView();
            hmv.displayHelpMenuView();
    }
    
    // The displaySaveGameView method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================  
    public void displaySaveGameView()
    {
            System.out.println("\nDisplay save game view option selected.");
    }

}
        

