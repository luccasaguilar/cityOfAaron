/*
* The Player class file for the cityOfAaron project
* CIT-260
* Spring 2018
* Team members: Luccas Aguilar, Ronan Macedo, Ronald Silva
 */
package model;

/**
 *
 * @author Ronan Macedo
 */
import java.io.Serializable;

public class Player implements Serializable {

    private String name;
    
    public Player() 
    {
    }
    
    public String getName()
    {
        return name;
    }

    
    public void setName(String _name) 
    {
    name = _name;
    }
    
     
}