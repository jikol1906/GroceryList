import BuisnessLogic.GroceryList;
import BuisnessLogic.GroceryList2;
import BuisnessLogic.GroceryListInterface;

/**
 * Created by borisgrunwald on 23/08/2016.
 */
public class RunProgram {

    public static void main(String[] args) {

        GroceryListInterface list = new GroceryList();

        System.out.println(list);

        list.retrieveItemsFromDB();

        System.out.println(list);



    }
}
