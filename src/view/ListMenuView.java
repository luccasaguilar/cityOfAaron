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
import model.ListItem;
import java.util.ArrayList;
import model.Game;

/**
 *
 * @author Luccas
 */
public class ListMenuView extends MenuView {
    
     // Create a new Game object.
    private static Game game = new Game();

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
                //GameMenuView gmv = new GameMenuView();
                //gmv.displayMenu();
         } 
    }
         
    // The listAnimals method
    // Purpose: List or view the animals in the storehouse
    // Parameters: none
    // Returns: none
    // Author: Luccas
    // Last Update 12/07/2018
    public void listAnimals(){
        
        //Show options to show, save or return
        System.out.format("\n" +
                      "***************************************\n" +
                      "* CITY OF AARON: DISPLAY/PRINT ANIMALS*\n" +
                      "***************************************\n" +
                      " 1 - View the list of animals in the storehouse\n" +
                      " 2 - Save to a file the List of animals in the storehouse\n" +
                      " 3 - Return to the Display/Print menu\n");

        System.out.print("\nPlease choose one option: ");  
        int action = keyboard.nextInt();
        
        // List or view the animals in the storehouse
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> animals = theGame.getAnimals();
        
        //action 1 - view the list
        if (action == 1) {
            System.out.format("%-16s%-24s\n", "Animal", "Quantity");
            for(ListItem animal : animals) 
                { 
                   // List or view the tools in the storehouse
                   System.out.format("%-16s%-24s\n", animal.getName(), animal.getNumber());
                }
                        
        } 
        //action 2 - save the list
        else if (action == 2) {
            //ask user to input the filepath
            System.out.println("\nSave List - please enter the filepath to save the list:");
            String filepath = keyboard.next();
            
            //call method printwriter to save the file
            Printwriter.printAnimals(animals, filepath);
            
            
        } 
        //action 3 - return to previous menu
        else if (action == 3) {
            return;
            //ListMenuView lmv = new ListMenuView();
            //lmv.displayMenu();
        } 
        //invalid option
        else {
            System.out.print("\nPlease choose a valid option (1-3)");
            listAnimals();
        }
    }
   
        
    // The listTools method
    // Purpose: List or view the tools in the storehouse
    // Parameters: none
    // Returns: none
    // Author: Luccas     
    public void listTools(){
        
        //Show options to show, save or return
        System.out.format("\n" +
                      "***************************************\n" +
                      "* CITY OF AARON: DISPLAY/PRINT TOOLS*\n" +
                      "***************************************\n" +
                      " 1 - View the list of tools in the storehouse\n" +
                      " 2 - Save to a file the List of tools in the storehouse\n" +
                      " 3 - Return to the Display/Print menu\n");

        System.out.print("\nPlease choose one option: ");  
        int action = keyboard.nextInt();
         
        // List or view the tools in the storehouse
        Game game = CityOfAaron.getGame();
        ArrayList<ListItem> tools = game.getTools();
        
         //action 1 - view the list
        if (action == 1) {
            System.out.format("%-16s%-24s\n", "Tool", "Quantity");
            for(ListItem tool : tools) 
                { 
                   // List or view the tools in the storehouse
                   System.out.format("%-16s%-24s\n", tool.getName(), tool.getNumber());
                }
            listTools();   
            } 
        
    
         //action 2 - save the list
        else if (action == 2) {
            //ask user to input the filepath
            System.out.println("\nSave List - please enter the filepath to save the list:");
            String filepath = keyboard.next();
            
            //call method printwriter to save the file
            Printwriter.printTools(tools, filepath);
            
            //show again the tools menu
            listTools();
            
        } 
        //action 3 - return to previous menu
        else if (action == 3) {
            ListMenuView lmv = new ListMenuView();
            lmv.displayMenu();
        } 
        //invalid option
        else {
            System.out.print("\nPlease choose a valid option (1-3)");
            listTools();
        }
    }

    // The listProvisions method
    // Purpose: List or view the provisions in the storehouse
    // Parameters: none
    // Returns: none
    // Author: Luccas      
    public void listProvisions(){
        
        //Show options to show, save or return
        System.out.format("\n" +
                      "***************************************\n" +
                      "* CITY OF AARON: DISPLAY/PRINT TOOLS*\n" +
                      "***************************************\n" +
                      " 1 - View the list of provisions in the storehouse\n" +
                      " 2 - Save to a file the List of provisions in the storehouse\n" +
                      " 3 - Return to the Display/Print menu\n");

        System.out.print("\nPlease choose one option: ");  
        int action = keyboard.nextInt();
         
        // List or view the provisions in the storehouse
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> provisions = theGame.getProvisions();
        
         //action 1 - view the list
        if (action == 1) {
            System.out.format("%-16s%-24s\n", "Provisions", "Quantity");
            for(ListItem provision : provisions) 
                { 
                   // List or view the provisions in the storehouse
                   System.out.format("%-16s%-24s\n", provision.getName(), provision.getNumber());
                }
            listProvisions();   
            } 
        
    
         //action 2 - save the list
        else if (action == 2) {
            //ask user to input the filepath
            System.out.println("\nSave List - please enter the filepath to save the list:");
            String filepath = keyboard.next();
            
            //call method printwriter to save the file
            Printwriter.printProvisions(provisions, filepath);
            
            //show again the provisions menu
            listProvisions();
            
        } 
        //action 3 - return to previous menu
        else if (action == 3) {
            ListMenuView lmv = new ListMenuView();
            lmv.displayMenu();
        } 
        //invalid option
        else {
            System.out.print("\nPlease choose a valid option (1-3)");
            listTools();
        }
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
