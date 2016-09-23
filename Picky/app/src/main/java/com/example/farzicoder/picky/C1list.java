package com.example.farzicoder.picky;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import layout.ProductClickFragment;
import layout.ShopClickFragment;

public class C1list extends AppCompatActivity {

    String [] arrShop = {
            "Shop 1",
            "Shop 2",
            "Shop 3",
            "Shop 4"
    };
    Integer [] arrShopImage = {
            R.drawable.shop1,
            R.drawable.shop2,
            R.drawable.shop3,
            R.drawable.shop4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extra = getIntent().getExtras();
        setContentView(R.layout.activity_c1_shop_list);
        if(extra.getString("id").equals("0")) {
            ProductClickFragment pcf = new ProductClickFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.activity_c1_shop_list, pcf).commit();
        }else if (extra.getString("id").equals("1")){
            ShopClickFragment scf = new ShopClickFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.activity_c1_shop_list, scf).commit();
        }
    }
}
