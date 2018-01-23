package example.codeclan.com.stuffforsale;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 23/01/2018.
 */

public class ItemsForSaleTest {

    @Test
    public void getListTest() {
        ItemsForSale itemsForSale = new ItemsForSale();
        assertEquals(3, itemsForSale.getList().size());
    }
}
