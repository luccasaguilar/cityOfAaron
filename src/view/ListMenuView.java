/*
* The ListMenuView class - part of the view layer file for the cityOfAaron project
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
public class ListMenuView extends MenuView {

    // The ListMenuView method
    // Purpose: displays the list menu, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // Author: Luccas
    public ListMenuView(){
        super("\n" +
                      "**************************************\n" +
                      "* CITY OF AARON: DISPLAY/PRINT MENU  *\n" +
                      "**************************************\n" +
                      " 1 - List or view the animals in the storehouse\n" +
                      " 2 - List or view the tools in the storehouse\n" +
                      " 3 - List or view the provisions in the storehouse\n" +
                      " 4 - List or view the developers of this game\n" +
                      " 5 - Return to the Game menu\n",5);
    } 

    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // Author: Luccas       
    @Override public void doAction(int option)
    {
         switch(option)
        {
            case 1: // List or view the animals in the storehouse
                listAnimals();
                break;
            case 2: // List or view the tools in the storehouse
                listTools();
                break;
            case 3: // List or view the provisions in the storehouse
                listProvisions();
                break;
            case 4: // List or view the developers of this game
                listTeam();
                break;
            case 5: // Return to the Game menu
                return;
 
        } 
    }
         
    // The listAnimals method
    // Purpose: List or view the animals in the storehouse
    // Parameters: none
    // Returns: none
    // Author: Luccas     
    public void listAnimals(){
        // List or view the animals in the storehouse
        System.out.println("\nList or view the animals in the storehouse option selected.");
    }
    
    // The listTools method
    // Purpose: List or view the tools in the storehouse
    // Parameters: none
    // Returns: none
    //Author: Luccas     
    public void listTools(){
        // List or view the tools in the storehouse
        System.out.println("\nList or view the tools in the storehouse option selected.");
    }

    // The listProvisions method
    // Purpose: List or view the provisions in the storehouse
    // Parameters: none
    // Returns: none
    // Author: Luccas      
    public void listProvisions(){
        // List or view the provisions in the storehouse
        System.out.println("\nList or view the provisions in the storehouse option selected.");
    }

    // The listTeam method
    // Purpose: List or view the provisions in the storehouse
    // Parameters: none
    // Returns: none
    // Author: Luccas     
    public void listTeam(){
        // List or view the developers of this game
        System.out.println("\nLuccas Aguilar, Ronan Macedo and Ronand Silva");
    }

}
