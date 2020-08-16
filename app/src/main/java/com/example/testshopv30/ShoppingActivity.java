package com.example.testshopv30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class ShoppingActivity extends AppCompatActivity {



    Button Back_btn;

    //test item

    private GridView grid;
    private String[] text = {"google", "facebook", "github"};
    private int[] imageId = {R.drawable.google, R.drawable.facebook, R.drawable.github};
    private int [] price = {30,30,30};
    private int[] count_product = {1,1,1};

    // End Test item


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        Back_btn=(Button)findViewById(R.id.back_btn);


        CartGrid adapter = new CartGrid(ShoppingActivity.this, text, imageId,price,count_product);
        grid = (GridView) findViewById(R.id.CartGridView);
        grid.setAdapter(adapter);

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
}
