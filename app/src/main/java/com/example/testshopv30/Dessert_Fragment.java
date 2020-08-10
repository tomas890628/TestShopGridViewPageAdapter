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


/**
 * A simple {@link Fragment} subclass.
 */
public class Dessert_Fragment extends Fragment {

    private GridView dessert_gridview;
    private String[] dessert_name = new String[]{"Cake", "Ice cream", "Pudding", "Fruit"};
    private int[] dessertimageID={R.drawable.google,R.drawable.google,R.drawable.google,R.drawable.google};

//    public Dessert_Fragment() {
//        // Required empty public constructor
//    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CustomGrid adapter = new CustomGrid(getContext(),dessert_name,dessertimageID);
        dessert_gridview = (GridView) getView().findViewById(R.id.Dessert_GridView);
        dessert_gridview.setAdapter(adapter);
        dessert_gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //[+position] +的功用是?
                Toast.makeText(getContext(), "你選取了" + dessert_name[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dessert_, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}
