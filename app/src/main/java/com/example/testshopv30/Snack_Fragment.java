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
public class Snack_Fragment extends Fragment {

//    public Snack_Fragment() {
//        // Required empty public constructor
//    }
    private GridView snack_gridview;
    private String[] snack_name = new String[]{"chip", "pancake", "burger", "cookies"};
    private int[] snackimageID={R.drawable.google,R.drawable.google,R.drawable.google,R.drawable.google};

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CustomGrid adapter = new CustomGrid(getContext(),snack_name,snackimageID);
        snack_gridview = (GridView) getView().findViewById(R.id.Snack_GridView);
        snack_gridview.setAdapter(adapter);
        snack_gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //[+position] +的功用是?
                Toast.makeText(getContext(), "你選取了" + snack_name[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_snack_, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
