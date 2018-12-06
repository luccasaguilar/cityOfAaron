// Source code for the GameControl class
// The GameControl class is a member of the controllayer
// Methods in the  GameControl class manage Game objects
// Author: Luccas Aguilar, Ronan Macedo, Ronald Silva
// Date Last modified: 01 Nov 2018
// ==============================================================

package control;

import model.*;
import cityofaaron.CityOfAaron;
import java.util.ArrayList;
import model.ListItem;


/**
 *
 * @author ronsilva
 */
public class GameControl {
    
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    
    // Create a new Game object.
    private static Game game = new Game();
    
    public static void createNewGame(String _name)
    {
        // create the player object and set the name
        Player player = new Player();
        player.setName(_name);
        
        // save reference to the player object in the game
        game.setPlayer(player);
        
        // create crop data object
        createCropDataObject();
        
        //create map object
        createMap();
        
        //create tool list
        createToolList();
        
        //create animal list
        createAnimalList();
        
        //create provision list
        createProvisionList();
        
        // when all is done, save a reference to the Game object
        CityOfAaron.setGame(game);
        
    }
        // create and initialize a CropData object
        public static void createCropDataObject()
    {
        // save a reference to it in the Game object
        CropData cropData = new CropData();
        
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000); 
        
        game.setCropData(cropData);         
        
    }
    // The createMap method
    // Purpose: creates the location objects and the map
    // Parameters: none
    // Returns: none
    public static void createMap()   
    {
        // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);

        // create a string that will go in the Location objects
        // that contain the valley
        String valley = "\nYou are on the Valley. The valley is the path to get the city." +
                              "\nThe valley marks the northern " +
                              "\nboundary of the city - it is wilderness to the North.";

        // create a new Location object
        Location loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(valley);
        loc.setSymbol("V");  

        // set this location object in each cell of the array in row 1      
        for(int i = 0; i < MAX_COL; i++)
         {
                theMap.setLocation(1, i, loc);
       }
        
         // create a string that will go in the Location objects
        // that contain the wilderness
        String wilderness= "\nYou are on the wilderness. The wilderness is dangerous place." +
                              "\nThe wilderness marks the north and there is nothing after the wilderness ";
                              
        // create a new Location object
        Location loc1 = new Location();

        // use setters in the Location class to set the description and symbol
        loc1.setDescription(wilderness);
        loc1.setSymbol("W");  

        // set this location object in each cell of the array in row 0      
        for(int i = 0; i < MAX_COL; i++)
         {
                theMap.setLocation(0, i, loc1);
       }
        
           
         // create a string that will go in the Location objects
        // that contain the river
        String river= "\nYou are on the River. The river is the source" +
                      "\nof life for our city. The river marks the southern boundary of the city ";

                              
        // create a new Location object
        Location loc2 = new Location();

        // use setters in the Location class to set the description and symbol
        loc2.setDescription(river);
        loc2.setSymbol("R");  

        // set this location object in each cell of the array in row 4      
        for(int i = 0; i < MAX_COL-1; i++)
         {
                theMap.setLocation(4, i, loc2);
       }
        
           // create a string that will go in the Location objects
        // that contain the mountain
        String mountain= "\nYou are on the mountains. The mountains is the protection" +
                      "\nfor our city. The mountains marks the eastern boundary of the city ";

                              
        // create a new Location object
        Location loc3 = new Location();

        // use setters in the Location class to set the description and symbol
        loc3.setDescription(mountain);
        loc3.setSymbol("M");  

        // set this location object in each cell of the array in column 4      
        for(int i = 2; i < MAX_ROW; i++)
         {
                theMap.setLocation(i, 4, loc3);
       } 
        
        // create a string that will go in the Location objects
        // that contain the farm
        String farm="\nYou are on the fertile banks of the River." +
                    "\nIn the springthis low farmland floods and is covered with rich" +
                    "\nnew soil. Wheat is planted as far as you can see.";

                              
        // create a new Location object
        Location loc4 = new Location();

        // use setters in the Location class to set the description and symbol
        loc4.setDescription(farm);
        loc4.setSymbol("F"); 
        theMap.setLocation(2, 0, loc4);
        theMap.setLocation(3, 0, loc4);
        
        // create a string that will go in the Location objects
        // that contain the forest
        String forest="\nYou are in the forest, beware for the wolves." +
                    "\nYou don't want to be alone in the forest";

                              
        // create a new Location object
        Location loc5 = new Location();

        // use setters in the Location class to set the description and symbol
        loc5.setDescription(forest);
        loc5.setSymbol("T"); 
        theMap.setLocation(2, 3, loc5);
        theMap.setLocation(3, 3, loc5);
        
         // create a string that will go in the Location objects
        // that contain the city
        String city="\nYou are in the city of Aaron." +
                    "\nWelcome to our city";

                              
        // create a new Location object
        Location loc6 = new Location();

        // use setters in the Location class to set the description and symbol
        loc6.setDescription(city);
        loc6.setSymbol("C"); 
        theMap.setLocation(2, 1, loc6);
        theMap.setLocation(2, 2, loc6);
        theMap.setLocation(3, 1, loc6);
        theMap.setLocation(3, 2, loc6);

        game.setMap(theMap);

    }
    
    // The createToolsList method
    // Purpose: creates the tools list objects
    // Parameters: none
    // Returns: none
    public static void createToolList()
    {
        
        ArrayList<ListItem> tools = new ArrayList<>();
        
        tools.add(new ListItem("hammer", 40));
        tools.add(new ListItem("axe", 30));
        tools.add(new ListItem("shovel", 50));
        tools.add(new ListItem("pitchfork", 45));
        tools.add(new ListItem("sickle", 15));
        tools.add(new ListItem("mattock", 20));
       
        game.setTools(tools);  
    }
    
    // The createAnimalsList method
    // Purpose: creates the animal list objects
    // Parameters: none
    // Returns: none
    public static void createAnimalList()
    {
        
        ArrayList<ListItem> animals = new ArrayList<>();
        
        animals.add(new ListItem("Pig", 100));
        animals.add(new ListItem("Goat", 200));
        animals.add(new ListItem("Horse", 500));
        animals.add(new ListItem("Cow", 2000));
        animals.add(new ListItem("Chicken", 800));
          
        game.setAnimals(animals);  
    }
    
    // The createProvisionList method
    // Purpose: creates the provision list of objects
    // Parameters: none
    // Returns: none
    public static void createProvisionList()
    {
        
        ArrayList<ListItem> provisions = new ArrayList<>();
        
        provisions.add(new ListItem("Timber", 50));
        provisions.add(new ListItem("Ore", 30));
        provisions.add(new ListItem("Oil", 80));
        provisions.add(new ListItem("Drinking Water", 90));
        provisions.add(new ListItem("Honey", 50));
        provisions.add(new ListItem("Salt", 50));
        
        game.setProvisions(provisions);
    }
    
    //the getSavedGame method 
    //Purpose: load a saved game from disk
    //Parameters: the file path
    //Returns: none
    //Side Effect: the game references in the driver is updated
    public static void getSavedGame(String filePath) 
    {
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath))
        {
            ObjectInputStream input = new ObjectInputStream(fips);
            Game = (Game) input.readObject();
            CityOfAaron.setGame(game);
        } 
        catch(Exception e)
        {
            System.out.println("\n There was an error reading the saved game file");
        }
    }
}