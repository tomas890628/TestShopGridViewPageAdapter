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
public class Hotfood_Fragment extends Fragment {

        private GridView hotfood_gridview;
        private String[] hotfood_name = new String[]{"rice", "noodle", "soup", "bread"};
        private int[] hotimageID={R.drawable.google,R.drawable.google,R.drawable.google,R.drawable.google};

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CustomGrid adapter = new CustomGrid(getContext(),hotfood_name,hotimageID);
        hotfood_gridview = (GridView) getView().findViewById(R.id.Hotfood_GridView);
        hotfood_gridview.setAdapter(adapter);
        hotfood_gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //[+position] +的功用是?
                Toast.makeText(getContext(), "你選取了" + hotfood_name[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotfood_, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }




//    private GridView hotfood_gridview;
//    private String[] hotfood_name = new String[]{"rice", "noodle", "soup", "bread"};
//    private int[] imageID={R.drawable.google,R.drawable.google,R.drawable.google,R.drawable.google};
//
////    public Hotfood_Fragment() {
////        // Required empty public constructor
////    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//
//        CustomGrid adapter = new CustomGrid(getContext(),hotfood_name,imageID);
//        hotfood_gridview = (GridView) getView().findViewById(R.id.Hotfood_GridView);
//        hotfood_gridview.setAdapter(adapter);
//
//        hotfood_gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //[+position] +的功用是?
//                Toast.makeText(getContext(), "你選取了" + hotfood_name[+position], Toast.LENGTH_SHORT).show();
//        }
//
//    }
//
//
//    //    private GridView hotfood_gridview;
////    private String[] hotfood_name = new String[]{"rice", "noodle", "soup", "bread"};
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_hotfood_, container, false);
//
//
//    }
//
//
//
//        }
//    }
}