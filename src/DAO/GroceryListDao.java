package DAO;

import BuisnessLogic.GroceryItemOrder;
import BuisnessLogic.GroceryListInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ${Boris} Grunwald} on 17/11/2016.
 */
public class GroceryListDao {

    public static void addItemFromFile(GroceryListInterface list) {

        try {
            Scanner input = new Scanner(new File("/Users/borisgrunwald/Google Drev/java/Grocery List/src/DAO/items.txt"));

            while(input.hasNext()) {
                list.addItem(new GroceryItemOrder(input.next()));
            }

        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        }

    }
}
