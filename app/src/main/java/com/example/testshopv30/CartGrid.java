package com.example.testshopv30;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CartGrid extends BaseAdapter {
    private Context context;
    private final String[] text;
    private final Integer[] imageId;
    private final Integer[] price;
    private final Integer[] count;

    public CartGrid(Context context, String[] text, Integer[] imageId,Integer[]price,Integer[]count) {
        this.context = context;
        this.text = text;
        this.imageId = imageId;
        this.price=price;
        this.count=count;
    }

    @Override
    public int getCount() {
        Log.d("count",Integer.toString(text.length));
        return text.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        // Context 動態放入mainActivity
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            grid = new View(context);
            // 將grid_single 載入(image+name+price+count)
            grid = layoutInflater.inflate(R.layout.cart_item, null);
            TextView textViewName = (TextView) grid.findViewById(R.id.name_text);
            ImageView imageView = (ImageView) grid.findViewById(R.id.product_image);
            TextView textViewPrice=(TextView)grid.findViewById(R.id.price_text);
            TextView textViewCount=(TextView)grid.findViewById(R.id.productnum_text);


            textViewName.setText(text[position]);
            imageView.setImageResource(imageId[position]);
            textViewPrice.setText(Integer.toString(price[position]));
            textViewCount.setText(Integer.toString(count[position]));

        } else {
            grid = (View) convertView;
        }
        return grid;
    }
}
