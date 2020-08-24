package com.example.testshopv30;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class ShoppingCart_Fragment extends Fragment {

    private GridView Cart_gridview;
    private String[] text = {"rice", "noodle", "soup"};
    private int[] imageId = {R.drawable.rice, R.drawable.noodle, R.drawable.soup};
    private int [] price = {30,30,30};
    private int[] count_product = {1,1,1};

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CartGrid adapter = new CartGrid(getContext(),text,imageId,price,count_product);
        Cart_gridview = (GridView) getView().findViewById(R.id.CartGridView);
        Cart_gridview.setAdapter(adapter);
        Cart_gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //[+position] +的功用是?
                Toast.makeText(getContext(), "你選取了" + text[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shopping_cart_, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
