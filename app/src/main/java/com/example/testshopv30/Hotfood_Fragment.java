package com.example.testshopv30;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hotfood_Fragment extends Fragment {

        private GridView hotfood_gridview;
        private String[] hotfood_name = new String[]{"rice", "noodle", "soup", "bread"};
        private int[] hotimageID={R.drawable.rice,R.drawable.noodle,R.drawable.soup,R.drawable.bread};

        ArrayList<String> AddtoCart_array = new ArrayList();
        FloatingActionButton addtoCart;

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        Bundle PASSARRAY = new Bundle();
//test
        private String[] passhot = {"rice", "noodleeee"};

        ArrayList<String> passtext = new ArrayList();
        ArrayList<Integer> passprice=new ArrayList();
        ArrayList<Integer>passcount=new ArrayList();


        ArrayList<Integer>passimgid=new ArrayList();
        private int[] imageId = {R.drawable.rice, R.drawable.noodle, R.drawable.soup};
        private int [] price = {30,30,30};
        private int[] count_product = {1,1,1};
//end test
//     option   SharedPreferences

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CustomGrid adapter = new CustomGrid(getContext(),hotfood_name,hotimageID);
        hotfood_gridview = (GridView) getView().findViewById(R.id.Hotfood_GridView);
        hotfood_gridview.setAdapter(adapter);

        hotfood_gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {      //傳送資料到購物車
                //[+position] +的功用是?
                Toast.makeText(getContext(), "你選取了" + hotfood_name[+position], Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent();
                intent.putExtra("Test",hotfood_name[+position]);

//                AddtoCart_array.add(hotfood_name.toString());
                Log.d("press",hotfood_name[+position]);
                passtext.add(hotfood_name[+position]);      //在ArrayList中加入選取的資料
                passprice.add(40);                          //在ArrayList中加入價格
                passcount.add(1);                           //在ArrayList中加入數量
//                passimgid.add(R.id.g);
//                Bundle bundle = new Bundle();
//                bundle.putStringArrayList("Add",AddtoCart_array);
                //https://www.thetopsites.net/article/58110161.shtml

//                Hotadd.edit().putString("HotName",hotfood_name[+position]);
//                Hotadd.edit().putInt("HotName",30);
//                Hotadd.edit().putInt("ProNum",1);
//                AddtoCart_array.add(hotfood_name[+position]);


                bundle.putStringArray("Food", passhot);
                bundle.putIntArray("Price",price);
                bundle.putIntArray("Count",count_product);



            }
        });

        addtoCart=(FloatingActionButton)getView().findViewById(R.id.addtocart);


        addtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putStringArrayList("Add",AddtoCart_array);

//                Bundle bundle = new Bundle();
//                bundle.putString("myData", "x");

                //https://www.tutorialspoint.com/How-to-add-items-to-an-array-in-java-dynamically

//                passtext.add("rice");
//                passtext.add("soup");

                Intent in=new Intent(getActivity(),ShoppingActivity.class);
                PASSARRAY.putStringArray("Passarray",passhot);
                Log.d("emtpysize","1");
                if (passtext.size()<=0)
                {
                    passtext.add("0");
                    passtext.add("0");
                    PASSARRAY.putStringArrayList("passarraylistproduct",passtext);
                    PASSARRAY.putIntegerArrayList("putarraylistprice",passprice);
                    PASSARRAY.putIntegerArrayList("putarraylistcount",passcount);
                }
                else
                {
                    PASSARRAY.putStringArrayList("passarraylistproduct",passtext);
                    PASSARRAY.putIntegerArrayList("putarraylistprice",passprice);
                    PASSARRAY.putIntegerArrayList("putarraylistcount",passcount);
                }
                in.putExtras(bundle);
                in.putExtras(PASSARRAY);
                startActivity(in);


                //跳轉購物車畫面
//                Toast.makeText(getContext(), "購物車" , Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent();
//                Bundle bundle = new Bundle();

//                intent.setClass(getActivity(), ShoppingActivity.class);

//                intent.putExtra("Test",);
//
////
//                AddtoCart_array.add("first");
//                AddtoCart_array.add("second");
//                AddtoCart_array.add("Third");
//                intent.setClass(getActivity(), ShoppingActivity.class);
//                intent.putExtra("AddToCart",AddtoCart_array);
//                startActivity(intent);
//
//                //傳入購物車的商品項目
//                bundle.putString("Name", "hi");
//                bundle.putInt("Int", 123);
//
//                intent.putExtras(bundle);
//                startActivity(intent);
///////
//                ArrayList bundlelist = new ArrayList();
//
//                bundlelist.add(AddtoCart_array);
//
//                bundle.putParcelableArrayList("list",bundlelist);
//
//                intent.putExtras(bundle);
//
//                startActivity(intent);



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