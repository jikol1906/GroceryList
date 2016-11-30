package BuisnessLogic;

import BuisnessLogic.GroceryItemOrder;
import DAO.GroceryListDao;

/**
 * Created by borisgrunwald on 23/08/2016.
 */
public class GroceryList implements GroceryListInterface {

    private GroceryItemOrder[] items = new GroceryItemOrder[10];
    private int index = 0;

    public GroceryList() {
    }

    public void addItem(GroceryItemOrder item) {

        if (index != 10) {
            items[index] = item;
            index++;
        } else {
            System.out.println("List can maximum contain 10 Items");
        }

    }

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

    @Override
    //Show items
    public String toString() {

        String allItems = "";

        for(GroceryItemOrder s : items) {

            if(s != null) {
                allItems += s + "\n\n";
            }

        }

        return "Items: " + "\n\n" +
                allItems;
    }
}
