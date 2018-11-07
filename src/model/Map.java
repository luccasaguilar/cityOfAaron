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
    
    public Map(){
    }
    
    public Location[][] getLocations(int rowCount, int colCount){
        return locations;
    }
    
    
    public int getRowCount() {
        return rowCount;
    }
    
    public void setRowCount(int _rowCount) {
        rowCount = _rowCount;
    }
    
    public int getColCount() {
        return colCount;
    }
    
    public void setColCount(int _colCount) {
        colCount = _colCount;
    }
}
