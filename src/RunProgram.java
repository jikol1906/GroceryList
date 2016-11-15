import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by borisgrunwald on 23/08/2016.
 */
public class RunProgram {

    public static void main(String[] args) {

        GroceryListInterface list = new GroceryList2();



    }

    public static void addItemFromFile(GroceryListInterface list, String filepath) {

        try {
            Scanner input = new Scanner(new File(filepath));

            while(input.hasNext()) {
                list.addItem(new GroceryItemOrder(input.next()));
            }

        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        }

    }
}
