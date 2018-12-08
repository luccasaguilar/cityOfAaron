/*
* The Printwriter class
* Objective of this class is to save list to file
* Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
* Date last modified: 07 DEC 2018
 */
package view;

/**
 *
 * @author luccas aguilar
 */
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.ListItem;

public class Printwriter
{
    // The printAnimals method
    // Purpose: save the list of animals to a file
    // Parameters: Array List (animals), filepath
    // Returns: none
    // Author: Luccas Aguilar
    // ===================================     

    public static void printAnimals(ArrayList<ListItem> _animal, String _filepath)
    {
         
        try(PrintWriter out = new PrintWriter(_filepath))
        {
            out.println(String.format("%-16s%-24s\n", "Animal", "Quantity"));
            for(ListItem animal : _animal) 
                { 
                   // List or view the animals in the storehouse
                   out.println(String.format("%-16s%-24s\n", animal.getName(), animal.getNumber()));
                }
            System.out.println("\n The list was saved successfully.");
        }
        catch(IOException e)
        {
            System.out.println("File Error.");
        }
    }
}

