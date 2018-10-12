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
     
     System.out.println(Game.player.getName());
    }
    
}
