package com.example.testshopv30;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Drink_Fragment extends Fragment {

    private GridView drink_gridview;
    private String[] drink_name = new String[]{"BlackTea", "GreenTea", "Juice", "Water"};
    private int[] drinkimageID={R.drawable.google,R.drawable.google,R.drawable.google,R.drawable.google};

    private String[] passarraydrk = {"rice", "noodle", "soupppp"};
    Bundle passdrk = new Bundle();
//    public Drink_Fragment() {
//        // Required empty public constructor
//    }
    FloatingActionButton addtoCartD;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CustomGrid adapter = new CustomGrid(getContext(),drink_name,drinkimageID);
        drink_gridview = (GridView) getView().findViewById(R.id.Drink_GridView);
        drink_gridview.setAdapter(adapter);
        drink_gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //[+position] +的功用是?
                Toast.makeText(getContext(), "你選取了" + drink_name[+position], Toast.LENGTH_SHORT).show();
            }
        });

        addtoCartD=(FloatingActionButton)getView().findViewById(R.id.addtocartD);

        addtoCartD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ShoppingActivity.class);
                passdrk.putStringArray("Passarray", passarraydrk);

                in.putExtras(passdrk);
                startActivity(in);
//drk can't send information

            }

        });

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drink_, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}
