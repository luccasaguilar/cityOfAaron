// Source code for the GameControl class
// The GameControl class is a member of the controllayer
// Methods in the  GameControl class manage Game objects
// Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
// Date Last modified: 01 Nov 2018
// ==============================================================

package control;

import model.*;
import cityofaaron.CityOfAaron;

/**
 *
 * @author ronsilva
 */
public class GameControl {
    
    public static void createNewGame(String _name)

   // Create a new Game object.
   Game game = new Game();

   // Create a new Player object
   //  Store the name of the player in the Player object
   // Store a reference to the Player object in the Game object
   // Create a CropData object
   // Initialize the data values in the CropData object
   // Save a reference to the CropData object in the Game object
   // Save a reference to the Game object in the static variable
   // declared in the CityOfAaron class.
    
    // create the game object
        Game game = new Game();
        
        // create the player object and set the name
        Player player = new Player();
        player.setName(_name);
        
        // save reference to the player object in the game
        game.setPlayer(player);
    // create and initialize a CropData object
    // save a reference to it in the Game object
        CropData cropData = new CropData();
        
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000); 
        
        game.setCropData(cropData); 
        
        // when all is done, save a reference to the Game object
        CityOfAaron.setGame(game);
    }

