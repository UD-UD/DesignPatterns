package TheIteratorPattern.MenuImpl;

import TheIteratorPattern.IteratorImpl.BreakfastIterator;
import TheIteratorPattern.domain.Iterator;

import java.util.ArrayList;

/**
 * Created by ud on 24/3/17.
 */
public class BreakFastMenu {
    ArrayList<String> menuItems;

    public BreakFastMenu() {
        menuItems = new ArrayList<String>();

        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String name)
    {
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new BreakfastIterator(menuItems);
    }

    public String toString() {
        return "Pancake House Menu";
    }
}
