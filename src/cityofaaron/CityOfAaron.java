/*
* The main() class file for the cityOfAaron project
* CIT-260
* Spring 2018
* Team members: Luccas Aguilar, Ronan Macedo, Ronald Silva
 */
package cityofaaron;

import model.*;
import view.*;

/**
 *
 * @author Luccas
 */
public class CityOfAaron 
{
    // variable for keeping a reference to the Game object
    private static Game theGame = null;
    /**
     * @param args the command line arguments
     */
    // main function - entry point for the program
    // runs the main menu

    public static void main(String[] args) {
   
        //MainMenuView mmv = new MainMenuView();
        //mmv.displayMenuView();       
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();       

        
    }
    
    public static void setGame(Game _game) {
       theGame = _game; 
    }
    
    public static Game getGame(){
        return theGame;
    }
    

}
