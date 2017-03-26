package TheIteratorPattern;

import TheIteratorPattern.MenuImpl.BreakFastMenu;
import TheIteratorPattern.MenuImpl.DinnerMenu;
import TheIteratorPattern.domain.Iterator;

import java.util.ArrayList;

/**
 * Created by ud on 24/3/17.
 */
public class AppMain {
    public static void main(String args[]) {
        BreakFastMenu pancakeHouseMenu = new BreakFastMenu();
        DinnerMenu dinerMenu = new DinnerMenu();

        // with no iterators
        System.out.println("\nMENU\n----\nBREAKFAST");
        ArrayList<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            String menuItem = (String)breakfastItems.get(i);
            System.out.println(menuItem);
        }

        System.out.println("\nLUNCH");
        String[] lunchItems = dinerMenu.getMenuItems();

        for (int i = 0; i < lunchItems.length; i++) {
            String menuItem = lunchItems[i];
            System.out.println(menuItem);
        }

        // with iterators
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String menuItem = (String)iterator.next();
            System.out.println(menuItem);

        }
    }
}
