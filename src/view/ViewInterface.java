// The ViewInterface – This interface contains the method signatures that are common to all of the menu view classes
// Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
// Date last modified: November 2018
//-------------------------------------------------------------
package view;

/**
 *
 * @author: Luccas Aguilar, Ronan Macedo, Ronald Silva
 */
public interface ViewInterface {
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);

}
