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

public class MainMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    
     private String theMenu;
     private int max;
    
    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================  
    public MainMenuView()
{

     theMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n";
        
        max = 5;
}

   

    public void displayMenuView()
    {    
    int menuOption;
    do
    {
        // Display the menu
        System.out.println(theMenu);

        // Prompt the user and get the user’s input
        menuOption = getMenuOption();

        // Perform the desired action
        doAction(menuOption);

    } while (menuOption != max);

    }
    
     // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
    }
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
    {
         // if the option is 1, call startNewGame( )
        // if the option is 2, call startExistingGame( )
        // if the option is 3, call displayHelpMenu( )
        // if the option is 4, call displaySaveGame( )
        // if the option is 5, display a goodbye message
    
        
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
        GameControl.createNewGame();
        // Display a welcome message
        System.out.println("Welcome " + name + " have fun!!!");
        // Display the Game menu

    }
    
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
        
    


}
