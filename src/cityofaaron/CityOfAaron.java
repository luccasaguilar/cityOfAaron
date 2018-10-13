/*
* The main() class file for the cityOfAaron project
* CIT-260
* Spring 2018
* Team members: Luccas Aguilar, Ronan Macedo, Ronald Silva
 */
package cityofaaron;

import model.*;

/**
 *
 * @author Luccas
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Player player = new Player();
     player.setName("Ron");
     
     Game game = new Game();
     game.setPlayer(player);
     
     System.out.println(game.getPlayer().getName());
     
     System.out.println(TeamMember.RON.getName()+ " : "+ TeamMember.RON.getTitle());
     
     /*
     *Test for Location class
     *@author Ronsilva
     */
     Location location = new Location();
     location.setDescription("Great");
     location.setSymbol("Mountains");
     System.out.println(location.getDescription() + "Symbol:" + location.getSymbol());
     
     /*
     *Test for LisiItem class
     *@author Luccas
     */
     
     ListItem item = new ListItem();
     item.setName("sword");
     item.setNumber(1);
     System.out.println(item.getName() + " - Qtd.:" + item.getNumber());
     
    
    }
}
