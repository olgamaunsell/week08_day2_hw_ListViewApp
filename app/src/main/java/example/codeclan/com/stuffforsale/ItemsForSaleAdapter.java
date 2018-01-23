package example.codeclan.com.stuffforsale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import example.codeclan.com.stuffforsale.ItemForSale;

/**
 * Created by admin on 23/01/2018.
 */

class ItemsForSaleAdapter extends ArrayAdapter<ItemForSale> {

    public ItemsForSaleAdapter(Context context, ArrayList<ItemForSale> items){
        super(context, 0, items);

    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.sale_item, parent, false);
        }

        ItemForSale currentItem = getItem(position);


        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentItem.getRanking());

        TextView name =listItemView.findViewById(R.id.name);
        name.setText(currentItem.getName().toString());

        TextView location =listItemView.findViewById(R.id.location);
        location.setText(currentItem.getLocation().toString());

        TextView price =listItemView.findViewById(R.id.price);
        String priceString = String.format("%.2f", currentItem.getPrice());
        price.setText(priceString);

        return listItemView;

    }

}
