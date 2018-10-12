/*
* The main() class file for the cityOfAaron project
* CIT-260
* Spring 2018
* Team members: Luccas Aguilar, Ronan Macedo, Ronald Silva
 */
package model;

/**
 *
 * @author ronsilva
 */
public enum TeamMember 
{
 // The members of the enumeration
    LUCCAS("Luccas" , "Brazil"),
    RONAN("Ronan", "Brazil"),
    RON("Ron","Chile");
    
    //data members
    
private String name;
private String title;


TeamMember(String _name,String _title)
{
    name= _name;
    title= _title;
}
  //The getName()method
  //Purpose:returns the value stored in name
  //Purpose: return the value store in name
//Parameters: none
public String getName()
{
    return name;
    
}
public String getTitle()
{
    return title;
    
}
}
