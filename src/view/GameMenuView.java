/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Game;



/**
 *
 * @author ronsilva
 */
public class GameMenuView {
    
   private String gameMenu;
   private int max;
    Scanner keyboard = new Scanner(System.in );
    Game theGame;
    
    // The DisplayMenuView method
    // Purpose: displays the game menu, gets the user's input, and does the 
    //          selected action
    // Parameters: none
    // Returns: none
    // =========================================================  
    public GameMenuView(){
        gameMenu = "\n" +
                      "**************************************\n" +
                      "* CITY OF AARON: DISPLAY/GAME MENU  *\n" +
                      "**************************************\n" +
                      " 1 - List or view the game map\n" +
                      " 2 - List or view the game menu list\n" +
                      " 3 - List or view the move to new location\n" +
                      " 4 - List or view the game manage crops\n" +
                      " 5 - Return to the Game menu\n";

        max = 5;
    } 
    
     public void displayMenuView() {
     int menuOption;    
     do
     {
         // display the menu
        System.out.println(gameMenu);
        
         // get the user's selection
         menuOption = getMenuOption();
        
         // perform the selected action
         doAction(menuOption); 
         
     } while (menuOption != max);
 } // end of displayMenuView method

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
        System.out.println("\nGame list");
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
    }

}
