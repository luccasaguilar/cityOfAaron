/*
* The main() class file for the cityOfAaron project
* CIT-260
* Spring 2018
* Team members: Luccas Aguilar, Ronan Macedo, Ronald Silva
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ronsilva
 */
public class Location implements Serializable {
    
    private String description;
    private String symbol;
    
    public Location() {
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String _description){
       this.description = _description;
    }

    public String getSymbol(){
        return symbol;
    }
    
    public void setSymbol(String _symbol){
        this.symbol = _symbol;
    }
}
        