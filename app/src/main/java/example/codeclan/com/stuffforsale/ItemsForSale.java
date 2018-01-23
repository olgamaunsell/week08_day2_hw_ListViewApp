package example.codeclan.com.stuffforsale;


import java.util.ArrayList;

/**
 * Created by admin on 23/01/2018.
 */

public class ItemsForSale {

    private ArrayList<ItemForSale> list;

    public ItemsForSale() {
        list = new ArrayList<ItemForSale>();
        list.add(new ItemForSale(1, "Printer", 45.00,"Stock Bridge"));
        list.add(new ItemForSale(2, "TV", 95.00,"Elm Row"));
        list.add(new ItemForSale(3, "Teddy Bear", 3.00,"Morningside"));
    }

    public ArrayList<ItemForSale> getList() {
        return new ArrayList<>(list);
    }
}
