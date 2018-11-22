/*
* The Map class file for the cityOfAaron project
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

public class Map implements Serializable {
    
    private int rowCount;
    private int colCount; 
    private Location[][] locations;
    
    public Map(int _rows, int _cols){
        
        rowCount = _rows;
        colCount = _cols;
        
        //create the array of location objects
        locations = new Location[_rows][_cols];
    }
    
   // The getLocation method
   // Purpose: returns the location object at the given row and column
   // Parameters: a row and column
   // Returns: a Location object
    public Location getLocations(int row, int col){
        return locations[row][col];
    }
    
        // The setLocation method
    // Purpose: stores a location object at the  row and column
    // Parameters: a row and column, and a reference to a location object
    // Returns: void
    public void setLocation(int row, int col, Location _location)
    {
        locations[row][col] = _location;
    } 

    
    public int getRowCount() {
        return rowCount;
    }
    
    public int getColCount() {
        return colCount;
    }
    
    
}
