package TheIteratorPattern.IteratorImpl;

import TheIteratorPattern.domain.Iterator;

import java.util.ArrayList;

/**
 * Created by ud on 24/3/17.
 */
public class BreakfastIterator implements Iterator {
    ArrayList<String> items;
    int position = 0;

    public BreakfastIterator(ArrayList<String> items) {
        this.items = items;
    }

    public String next() {
        String menuItem = (String) items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
