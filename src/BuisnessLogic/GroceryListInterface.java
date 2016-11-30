package BuisnessLogic;



/**
 * Created by borisgrunwald on 29/08/2016.
 */
public interface GroceryListInterface {

    void addItem(GroceryItemOrder e);

    void retrieveItemsFromDB();

    double getTotalCost();


}
