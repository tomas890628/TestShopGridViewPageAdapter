package com.example.testshopv30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity{



    Button Back_btn;
    TextView Test_text;
        //test item

        private GridView grid;
//        private String[] text = {"rice", "noodle", "soup"};
        private int [] price = {30,30,30};
        private int[] count_product = {1,1,1};

        private int[] imageId = {R.drawable.rice, R.drawable.noodle, R.drawable.soup};

//        private String[] text;
//        private int[]  price;
//        private int[] count_product;

        Intent intent = new Intent();
        private String[] text1 = {"google", "facebook", "github"};
        // End Test item


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_shopping);

            Back_btn=(Button)findViewById(R.id.back_btn);

            Bundle bundle = getIntent().getExtras();
//https://stackoverflow.com/questions/16792564/got-null-value-during-passing-data-from-fragments-to-activity      https://litotom.com/ch5-2-intent/              https://cookiesp.pixnet.net/blog/post/84190702
//            Log.d("aaaaaaa",text[0]);
//            Log.d("aaaaaaa",text[1]);
//            Log.d("aaaaaaa",text[2]);
//            Log.d("TEXT",text[0]);                        //0831

            Intent intent= getIntent();

            Bundle getarray = intent.getExtras();

            String[] arrInfo = getarray.getStringArray("Passarray");

            Log.d("getarray1",arrInfo[0]);


//            text=bundle.getStringArray("Food");
//            price=bundle.getIntArray("Price");
//            count_product=bundle.getIntArray("Count");

            CartGrid adapter = new CartGrid(ShoppingActivity.this, arrInfo, imageId,price,count_product);
            grid = (GridView) findViewById(R.id.CarGridView);
            grid.setAdapter(adapter);
//            CustomGrid testcustom=intent.getParcelableExtra("Test");
//
//
            Test_text=(TextView)findViewById(R.id.test);

            Intent in=getIntent();
//            Bundle bundle = getIntent().getExtras();
//            String value = bundle.getString("myData");
//            Log.v("in mainactivity",""+value);
//            Log.d("aaaa"," "+value);

//            Test_text=(TextView)findViewById(R.id.test);
//            Test_text.setText(value);

            Back_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();

                    intent.setClass(ShoppingActivity.this, MainActivity.class);         //從購物車介面跳回主頁面  https://www.jianshu.com/p/ab1cb7ddf91f
                    bundle.putString("Name", "hi");
                    bundle.putInt("Int", 123);

                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });


    }
/// implements https://www.youtube.com/watch?v=6QBtfGcAILY

}
