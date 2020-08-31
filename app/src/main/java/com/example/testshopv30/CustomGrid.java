package com.example.testshopv30;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//public class CustomGrid extends BaseAdapter implements Parcelable {
public class CustomGrid extends BaseAdapter  {
    private Context context;
    private final String[] text;
    private final int[] imageId;

    public CustomGrid(Context context, String[] text, int[] imageId) {
        this.context = context;
        this.text = text;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
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
            // 將grid_single 動態載入(image+text)
            grid = layoutInflater.inflate(R.layout.grid_item, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView) grid.findViewById(R.id.grid_image);
            textView.setText(text[position]);
            imageView.setImageResource(imageId[position]);
        } else {
            grid = (View) convertView;
        }
        return grid;
    }
    /*
    protected CustomGrid(Parcel in) {           //對應76~78
        text = in.createStringArray();
        imageId = in.createIntArray();
    }


    public static final Creator<CustomGrid> CREATOR = new Creator<CustomGrid>() {
        @Override
        public CustomGrid createFromParcel(Parcel in) {
            return new CustomGrid(in);
        }

        @Override
        public CustomGrid[] newArray(int size) {
            return new CustomGrid[size];
        }
    };
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(text);
        parcel.writeIntArray(imageId);
    }
    @Override
    public int describeContents() {
        return 0;
    }
    */
}
