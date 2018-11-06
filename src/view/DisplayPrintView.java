/*
* The DisplayPrintView class - part of the view layer file for the cityOfAaron project
* Object of this class manages the main menu
* Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
*Date last modified: 05 NOV 2018
*/
package view;

import control.GameControl;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author Luccas
 */
public class DisplayPrintView {
    Scanner keyboard = new Scanner(System.in);
    
    private String theMenu;
    private int max;
         
    // The DisplayPrintView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================  
    public DisplayPrintView(){
        theMenu = "\n" +
                      "**************************************\n" +
                      "* CITY OF AARON: DISPLAY/PRINT MENU  *\n" +
                      "**************************************\n" +
                      " 1 - List or view the animals in the storehouse\n" +
                      " 2 - List or view the tools in the storehouse\n" +
                      " 3 - List or view the provisions in the storehouse\n" +
                      " 4 - List or view the developers of this game\n" +
                      " 5 - Return to the Game menu\n";

        max = 5;
    } 

    public void DisplayPrintView(){    
        int menuOption;
        do {
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
    public int getMenuOption(){
        // declare a variable to hold user’s input
        int userInput = 0;
        final int MAX = 5;
        Scanner keyboard = new Scanner(System.in );

        // begin loop
        do{
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > MAX)
                System.out.println("Error: you must select 1, 2, 3, 4, or 5");
           // loop back to the top of the loop if input was not valid
        // end loop
        } while (userInput < 1 || userInput > MAX);
        return userInput;
    }
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
    {
         switch(option)
        {
            case 1: // List or view the animals in the storehouse
                displayAnimals();
                break;
            case 2: // List or view the tools in the storehouse
                displayTools();
                break;
            case 3: // List or view the provisions in the storehouse
                displayProvisions();
                break;
            case 4: // List or view the developers of this game
                displayDevelopers();
                break;
            case 5: // Return to the Game menu (need to be adjusted when the game menu is ready)
                MainMenuView mmv = new MainMenuView();
                mmv.displayMenuView();
 
        } 
    }
         
    // The displayAnimals method
    // Purpose: List or view the animals in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayAnimals(){
        // List or view the animals in the storehouse
        System.out.println("\nList or view the animals in the storehouse option selected.");
    }
    
    // The displayTools method
    // Purpose: List or view the tools in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayTools(){
        // List or view the tools in the storehouse
        System.out.println("\nList or view the tools in the storehouse option selected.");
    }

    // The displayProvisions method
    // Purpose: List or view the provisions in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayProvisions(){
        // List or view the provisions in the storehouse
        System.out.println("\nList or view the provisions in the storehouse option selected.");
    }

    // The displayProvisions method
    // Purpose: List or view the provisions in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayDevelopers(){
        // List or view the developers of this game
        System.out.println("\nLuccas Aguilar, Ronan Macedo and Ronand Silva");
    }

}
