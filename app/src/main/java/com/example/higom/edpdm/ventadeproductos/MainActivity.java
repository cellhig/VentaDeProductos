package com.example.higom.edpdm.ventadeproductos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btn1, btn2, btn3, btn4, btn5, btn6;

    ListView tecnologia;
    ListView productImages;
    ListView products;

    String productosTecnologia[] = {"Computador","iPhone","Camara Web", "play station 4", "Xbox One"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Images imagesList[] = new Images[]{
                new Images(R.drawable.ic_launcher_background),
                new Images(R.drawable.ic_launcher_background),
                new Images(R.drawable.ic_launcher_background),
                new Images(R.drawable.ic_launcher_background)
        };

        Products productsData[] = new Products[] {
                new Products(R.drawable.ic_launcher_background, "producto1"),
                new Products(R.drawable.ic_launcher_background, "producto2"),
                new Products(R.drawable.ic_launcher_background, "producto3"),
                new Products(R.drawable.ic_launcher_background, "producto4"),
                new Products(R.drawable.ic_launcher_background, "producto5"),
        };

        // adaptador de images para un listView de solo imagenes
        /*ImagesAdapter imagesAdapter = new ImagesAdapter(this, R.layout.listview_item_images_row, imagesList);
        productImages = (ListView) findViewById(R.id.imageItemRandom);
        productImages.setAdapter(imagesAdapter);*/

       tecnologia = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productosTecnologia);

        tecnologia.setAdapter(adapter);

        Intent intent = getIntent();

        btn1 = (ImageButton) findViewById(R.id.imageButton1);
        btn1.setOnClickListener(this);
        btn2 = (ImageButton) findViewById(R.id.imageButton2);
        btn2.setOnClickListener(this);
        btn3 = (ImageButton) findViewById(R.id.imageButton3);
        btn3.setOnClickListener(this);
        btn4 = (ImageButton) findViewById(R.id.imageButton4);
        btn4.setOnClickListener(this);
        btn5 = (ImageButton) findViewById(R.id.imageButton5);
        btn5.setOnClickListener(this);
        btn6 = (ImageButton) findViewById(R.id.imageButton6);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.imageButton1:
                Intent intent1 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent1);
                break;
            case R.id.imageButton2:
                Intent intent2 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent2);
                break;
            case R.id.imageButton3:
                Intent intent3 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent3);
                break;
            case R.id.imageButton4:
                Intent intent4 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent4);
                break;
            case R.id.imageButton5:
                Intent intent5 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent5);
                break;
            case R.id.imageButton6:
                Intent intent6 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent6);
                break;
        }
    }
}
