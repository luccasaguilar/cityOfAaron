    /*
* The ListItem class file for the cityOfAaron project
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

public class ListItem implements Serializable{
    
    private String name;
    private Integer number;
    
    public ListItem() {}
    
    public String getName(){
        return name;
    }
    
    public void setName(String _name){
        name = _name;
    }

    public Integer getNumber(){
        return number;
    }
    
    public void setNumber(Integer _number){
        number = _number;
    }
    
}
