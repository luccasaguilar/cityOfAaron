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
import java.util.ArrayList;

public class Game implements Serializable {
    
    //thePlayer: Player
    //Game()
    //setPlayer(:Player): void
    //getPlayer(:void): Player
    private Player thePlayer;
    private CropData cropData;
    private Map map;
    private ArrayList<ListItem> tools;
    
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

    public void setMap(Map _map) {
       map = _map; 
    }

    public Map getMap(){
        return map;
    }
    
    public void setTools(ArrayList<ListItem> _tools) {
		tools = new ArrayList<ListItem>(_tools);
	}

    public ArrayList<ListItem> getTools() {
		return tools;
	}
}
