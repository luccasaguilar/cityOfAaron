/*
* The Game class file for the cityOfAaron project
* CIT-260
* Spring 2018
* Team members: Luccas Aguilar, Ronan Macedo, Ronald Silva
* Date last modified: 07 DEC 2018
 */
package model;

/**
 *
 * @author Luccas
 */

import java.io.Serializable;
import java.util.ArrayList;
import exceptions.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Game implements Serializable {
    
    //thePlayer: Player
    //Game()
    //setPlayer(:Player): void
    //getPlayer(:void): Player
    private Player thePlayer;
    private CropData cropData;
    private Map map;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> provisions;
    
  
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

    public void setAnimals(ArrayList<ListItem> _animals) {
		animals = new ArrayList<ListItem>(_animals);
	}

    public ArrayList<ListItem> getAnimals() {
		return animals;
	}

    public void setProvisions(ArrayList<ListItem> _provisions) {
		provisions = new ArrayList<ListItem>(_provisions);
	}

    public ArrayList<ListItem> getProvisions() {
		return provisions;
	}
}
