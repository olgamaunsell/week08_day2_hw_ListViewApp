package example.codeclan.com.stuffforsale;


import java.util.ArrayList;

/**
 * Created by admin on 23/01/2018.
 */

public class ItemsForSale {

    private ArrayList<ItemForSale> list;

    public ItemsForSale() {
        list = new ArrayList<ItemForSale>();
        list.add(new ItemForSale(1, "Printer", 45.20,"Stock Bridge"));
        list.add(new ItemForSale(2, "TV", 95.00,"Elm Row"));
        list.add(new ItemForSale(3, "Teddy Bear", 3.00,"Morningside"));
        list.add(new ItemForSale(4, "Little Black Dress", 15.00,"Morningside"));
        list.add(new ItemForSale(5, "Car", 1500.50,"Newington"));
        list.add(new ItemForSale(6, "Wardrobe", 65.00,"Hillside"));
        list.add(new ItemForSale(7, "Chest of Drawers", 38.00,"Hillside"));
    }

    public ArrayList<ItemForSale> getList() {
        return new ArrayList<>(list);
    }
}
