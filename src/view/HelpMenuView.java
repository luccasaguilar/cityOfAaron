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
public class HelpMenuView {
    Scanner keyboard = new Scanner(System.in);
    
    private String helpMenu;
    private int max;
    
    //The HelpMenuView method
    //Purpose: Display the help menu, gets the user's input, and does the 
    //         selected action
    //Parameters: none
    //Returns: none

    /**
     *
     */
    public HelpMenuView(){
        helpMenu = "\n" +
                      "**************************************\n" +
                      "******CITY OF AARON: HELP MENU********\n" +
                      "**************************************\n" +
                      "1 - What are the goals of the game?\n" +
                      "2 - Where is the city of Aaron?\n" +
                      "3 - How do I view the map?\n" +
                      "4 - How do I move to another location?\n" +
                      "5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
                      "6 - Back to the Main Menu\n";
        max = 6;
    }
    
    /**
     *
     */
    public void displayHelpMenuView(){
        int menuOption;
        do {
            //Display the help menu
            System.out.println(helpMenu);
            
            //Prompt the user and the get the user's input
            menuOption = getMenuOption();
            
            //Perform the desired action
            doAction(menuOption);
   
        } while (menuOption != max); 
    }
    
    //The getMenuOption method
    //Purpose: gets the user's input
    //Parameters: none
    //Returns: the selected option - integer
    public int getMenuOption(){
        //declare a variable to hold user's input
        int userInput = 0;
        final int MAX = 6;
        Scanner keyboard = new Scanner(System.in);
        
        //begin loop
        do{
            //get user input
            userInput = keyboard.nextInt();
            //if it is not a valid value, output an error message
            if (userInput < 1 || userInput > MAX){
                System.out.println("Error: you must select 1, 2, 3, 4, 5, or 6");
            //loop back to the top of the loop
            }
        //end loop
        } while(userInput < 1 || userInput > MAX);
        return userInput;
    }
    
    //The doAction method
    //Purpose: performs the selected action
    //Parameters: none
    //Returns: none
    public void doAction(int option){
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
}
