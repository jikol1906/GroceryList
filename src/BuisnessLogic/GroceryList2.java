package BuisnessLogic;

import BuisnessLogic.GroceryItemOrder;
import DAO.GroceryListDao;

import java.util.ArrayList;

/**
 * Created by borisgrunwald on 29/08/2016.
 */
public class GroceryList2 implements GroceryListInterface {

    private ArrayList<GroceryItemOrder> items = new ArrayList<>();

    public GroceryList2() {

    }

    public void addItem(GroceryItemOrder e) {
        items.add(e);
    }

    @Override
    public void retrieveItemsFromDB() {
        GroceryListDao.addItemFromFile(this);
    }

    public double getTotalCost() {

        double totalPrice = 0.0;

        for(GroceryItemOrder e : items) {
            totalPrice += e.getCost();
        }

        return totalPrice;
    }

    public void setItems(ArrayList<GroceryItemOrder> items) {
        this.items = items;
    }



    public String toString() {

        String allItems = "";

        for(GroceryItemOrder s : items) {
            allItems += s + "\n\n";
        }

        return allItems;

    }
}
