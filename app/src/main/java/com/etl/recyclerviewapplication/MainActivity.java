package com.etl.recyclerviewapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.etl.recyclerviewapplication.adapter.ProductAdapter;
import com.etl.recyclerviewapplication.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Product product;
    private ArrayList<Product> products;
    private RecyclerView productRV;
    private ActionBar toolbar;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        configRecyclerView();
        getAllProduct();
    }

    private void configRecyclerView() {
        productRV.setLayoutManager(new GridLayoutManager(this,2));
        productRV.setAdapter(productAdapter);
    }

    private void init() {
        toolbar = getSupportActionBar();
        toolbar.setTitle("Category");
        products = new ArrayList<>();
        productRV = findViewById(R.id.productRV);
        productAdapter = new ProductAdapter(this,products);
    }

    private void getAllProduct() {
        products.add(new Product("Shirt1","Tk.2200",R.drawable.shirt1));
        products.add(new Product("Shirt2","Tk.2200",R.drawable.shirt2));
        products.add(new Product("Shirt3","Tk.2200",R.drawable.shirt3));
        products.add(new Product("Shirt4","Tk.2200",R.drawable.shirt4));
        products.add(new Product("Shirt5","Tk.2200",R.drawable.shirt5));
        products.add(new Product("Shirt6","Tk.2200",R.drawable.shirt6));
        products.add(new Product("Shirt1","Tk.2200",R.drawable.shirt1));
        products.add(new Product("Shirt2","Tk.2200",R.drawable.shirt2));
        products.add(new Product("Shirt3","Tk.2200",R.drawable.shirt3));
        products.add(new Product("Shirt4","Tk.2200",R.drawable.shirt4));
        products.add(new Product("Shirt5","Tk.2200",R.drawable.shirt5));
        products.add(new Product("Shirt6","Tk.2200",R.drawable.shirt6));

        productAdapter.notifyDataSetChanged();
    }
}
