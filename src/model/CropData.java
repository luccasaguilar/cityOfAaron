/*
* The CropData class file for the cityOfAaron project
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

public class CropData implements Serializable{
    
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int harvestAfterOffering;
    private int offering;
    private int offeringBushels;
    private int wheatForFood;
    private int acresPlanted;
    
    public CropData() {}
    
    public int getYear() {
        return year;
    }
    public void setYear(int _year){
        year = _year;
    }
    
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int _population) {
        population = _population;
    }
    
    public int getAcresOwned() {
        return acresOwned;
    }
    public void setAcresOwned(int _acresOwned) {
        acresOwned = _acresOwned;
    }
    
    public int getCropYield() {
        return cropYield;
    }
    public void setCropYield(int _cropYield) {
        cropYield = _cropYield;
    }
    
    public int getWheatInStore() {
        return wheatInStore;
    }
    public void setWheatInStore(int _wheatInStore) {
        wheatInStore = _wheatInStore;
    }
    
    public int getNumberWhoDied() {
        return numberWhoDied;
    }
    public void setNumberWhoDied(int _numberWhoDied) {
        numberWhoDied = _numberWhoDied;
    }
    
    public int getNewPeople() {
        return newPeople;
    }
    public void setNewPeople(int _newPeople) {
        newPeople = _newPeople;
    }
    
    public int getHarvest() {
        return harvest;
    }
    public void setHarvest(int _harvest) {
        harvest = _harvest;
    }
    
    public int getWheatForFood() {
        return wheatForFood;
    }
    public void setWheatForFood(int _wheatForFood) {
        wheatForFood = _wheatForFood;
    }
    
    public int getAcresPlanted() {
        return acresPlanted;
    }
    public void setAcresPlanted(int _acresPlanted) {
        acresPlanted = _acresPlanted;
    }

    public int getHarvestAfterOffering() {
        return harvestAfterOffering;
    }
    public void setHarvestAfterOffering(int _harvestAfterOffering) {
        harvestAfterOffering = _harvestAfterOffering;
    }
    
    public int getOffering() {
        return offering;
    }
    public void setOffering(int _offering) {
        offering = _offering;
    }
    
    public int getOfferingBushels() {
        return offeringBushels;
    }
    public void setOfferingBushels(int _offeringBushels) {
        offeringBushels = _offeringBushels;
    }
}
