/*
* The ListItem class file for the cityOfAaron project
* CIT-260
* Spring 2018
* Team members: Luccas Aguilar, Ronan Macedo, Ronald Silva
*/
package model;

/**
 *
 * @author Luccas Aguilar
 */

import java.io.Serializable;

public class ListItem implements Serializable{
    
    private String name;
    private int number;
    
 
    public ListItem(String _name, int _number) {
		//super();
		name = _name;
		number = _number;
	}
    
    public String getName(){
        return name;
    }
    
    public void setName(String _name){
        name = _name;
    }

    public int getNumber(){
        return number;
    }
    
    public void setNumber(int _number){
        number = _number;
    }
}
