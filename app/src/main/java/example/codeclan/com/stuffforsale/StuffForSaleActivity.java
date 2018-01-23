package example.codeclan.com.stuffforsale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StuffForSaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stuff_for_sale_activity);


        ArrayList<ItemForSale> itemsForSale = new ItemsForSale().getList();

        ItemsForSaleAdapter itemsForSaleAdapter = new ItemsForSaleAdapter(this, itemsForSale);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(itemsForSaleAdapter);
    }
}


