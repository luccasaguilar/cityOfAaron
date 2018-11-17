/*
* The HelpMenuView class - part of the view layer file for the cityOfAaron project
* Object of this class manages the interaction with the user
* Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
*Date last modified: 06 NOV 2018
*/
package view;

import view.MainMenuView;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author Ronan Macedo
 */
public class HelpMenuView extends MenuView {
    /**
     *@see Help Menu
     */
    public HelpMenuView()
    {
                super("\n" +
                      "**************************************\n" +
                      "******CITY OF AARON: HELP MENU********\n" +
                      "**************************************\n" +
                      "1 - What are the goals of the game?\n" +
                      "2 - Where is the city of Aaron?\n" +
                      "3 - How do I view the map?\n" +
                      "4 - How do I move to another location?\n" +
                      "5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
                      "6 - Back to the Main Menu\n",
        6);
    }
    
    //The doAction method
    //Purpose: performs the selected action
    //Parameters: none
    //Returns: none
    @Override
   public void doAction(int option)
   {
        switch(option){
            case 1: //View the game goals
                viewGoals();
                break;
            case 2: //View the map help
                viewMapHelp();
                break;
            case 3: //View the map help
                viewMapHelp();
                break;
            case 4: //View the move help
                viewMoveHelp();
                break;
            case 5: //View list help
                viewListHelp();
                break;
            case 6://Return to Main Menu
                    }
    }
    
    //the viewGoals method
    //Purpose: View the game goals
    //Parameters: none
    //Returns: none
    public void viewGoals(){
        //View the game goals
        System.out.println("\nGame goals selected");
    }
    
    //The viewMapHelp method
    //Purpose: View the map helping guide 
    //Parameters: none
    //Returns: none
    public void viewMapHelp(){
        //View the map helping guide
        System.out.println("\nMap helping guide selected");
    }
    
    //The viewMoveHelp method
    //Purpose: View the move helping guide
    //Parameters: none
    //Returns: none
    public void viewMoveHelp() {
        //View the move helping guide
        System.out.println("\nMove helping guide selected");
    }
    
    //The viewListHelp method
    //Purpose: View the list help
    //Parameters: none
    //Returns: none
    public void viewListHelp(){
        //View the list help guide
        System.out.println("\nList help guide selected");
    }
    
    //The backMainMenu method
    //Purpose: Back to the main menu
    //Parameters: none
    //Returns: none
    public void backMainMenu() {
        System.out.println("\nDisplay help menu view option selected.");
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
    }
}
