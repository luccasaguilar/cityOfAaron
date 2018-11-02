/*
* The Game class file for the cityOfAaron project
* CIT-260
* Spring 2018
* Team members: Luccas Aguilar, Ronan Macedo, Ronald Silva
 */
package model;

/**
 *
 * @author Luccas
 */

import java.io.Serializable;

public class Game implements Serializable {
    
    //thePlayer: Player
    //Game()
    //setPlayer(:Player): void
    //getPlayer(:void): Player
    private Player thePlayer;
    private CropData cropData;
   
    
    public Game() {}
    
    public void setPlayer(Player _thePlayer) {
       thePlayer = _thePlayer; 
    }

    public Player getPlayer(){
        return thePlayer;
    }
  
    public void setCropData(CropData _cropData) {
       cropData = _cropData; 
    }
    
    public CropData getCropData(){
        return cropData;
    }


    
}
