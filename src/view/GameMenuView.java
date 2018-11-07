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
    
    String gameMenu;
    int max;
    Scanner keyboard = new Scanner(System.in );
    Game theGame;
    
     public void displayMenuView()
 {
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
            case 5: // return to main menu
                return;
 
        } 
    
    }

}
