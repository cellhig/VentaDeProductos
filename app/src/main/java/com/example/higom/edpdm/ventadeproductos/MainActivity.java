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

        //adaptador de productos con su titulo
        /*ProductsAdapter adapter = new ProductsAdapter(this, R.layout.listview_item_products_row, productsData);
        products = (ListView) findViewById(R.id.listView);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_products_row, null);
        products.addHeaderView(header);
        products.setAdapter(adapter);*/

        //adaptador sencillo de datos estaticos
       /*tecnologia = (ListView) findViewById(R.id.listView);
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productosTecnologia);
       tecnologia.setAdapter(adapter);*/

        Intent intent = getIntent();

        btn1 = (ImageButton) findViewById(R.id.imageButtonElectrodomesticos);
        btn1.setOnClickListener(this);
        btn2 = (ImageButton) findViewById(R.id.imageButtonRopa);
        btn2.setOnClickListener(this);
        btn3 = (ImageButton) findViewById(R.id.imageButtonLibros);
        btn3.setOnClickListener(this);
        btn4 = (ImageButton) findViewById(R.id.imageButtonComputacion);
        btn4.setOnClickListener(this);
        btn5 = (ImageButton) findViewById(R.id.imageButtonBelleza);
        btn5.setOnClickListener(this);
        btn6 = (ImageButton) findViewById(R.id.imageButtonMusica);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.imageButtonElectrodomesticos:
                /*Intent intent1 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent1);*/

                Products ElectrodomesticosArray[] = new Products[] {
                        new Products(R.drawable.led_55_uhd_smarttv, "LED 55\" UHD Smart TV | KD55X727E"),
                        new Products(R.drawable.consola_play_station4_slim, "Consola Playstation 4 Slim 1tb Con 1 Control Ps4 1000gb"),
                        new Products(R.drawable.nevecon_whirlpool_side_by_side_680_lts, "Nevecon Whirlpool Side By Side 680 Lts - Wrs49aktww"),
                        new Products(R.drawable.videoproyector_powerlite_x29, "Videoproyector Powerlite X29"),
                        new Products(R.drawable.lavadora_secadora_carga_frontal15_kg, "Lavadora Secadora Carga Frontal 15 kg | WD1577RD"),
                };

                ProductsAdapter electrodomesticosAdapter = new ProductsAdapter(this, R.layout.listview_item_products_row, ElectrodomesticosArray);
                products = (ListView) findViewById(R.id.listView);
                /*View header = (View) getLayoutInflater().inflate(R.layout.list_header_products_row, null);
                products.addHeaderView(header);*/
                products.setAdapter(electrodomesticosAdapter);


                break;
            case R.id.imageButtonRopa:
                /*Intent intent2 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent2);*/

                Products ropaArray[] = new Products[] {
                        new Products(R.drawable.legging_tiana, "Legging Tiana"),
                        new Products(R.drawable.chaqueta, "Chaqueta"),
                        new Products(R.drawable.traje_de_bano, "Traje de baño"),
                        new Products(R.drawable.vestido, "Vestido"),
                        new Products(R.drawable.blazer_americana_boreal1, "Blazer Americana Boreal1"),
                };

                ProductsAdapter ropaAdapter = new ProductsAdapter(this, R.layout.listview_item_products_row, ropaArray);
                products = (ListView) findViewById(R.id.listView);
                /*View header = (View) getLayoutInflater().inflate(R.layout.list_header_products_row, null);
                products.addHeaderView(header);*/
                products.setAdapter(ropaAdapter);

                break;
            case R.id.imageButtonLibros:
                /*Intent intent3 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent3);*/




                break;
            case R.id.imageButtonComputacion:
                Intent intent4 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent4);
                break;
            case R.id.imageButtonBelleza:
                Intent intent5 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent5);
                break;
            case R.id.imageButtonMusica:
                /*Intent intent6 = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent6);*/

                Products musicaArray[] = new Products[] {
                        new Products(R.drawable.viola_145_hxzq_03_solid_inland, "Viola 14.5 HXZQ03 Solid Inland"),
                        new Products(R.drawable.bateria_element_2216_blanco, "Batería Element 22-16 Blanco"),
                        new Products(R.drawable.guitarra_valencia_negra_vc154bk, "Guitarra Valencia Negra VC154BK"),
                        new Products(R.drawable.baquetas_trilok_gurtu_astr, "Baquetas Trilok Gurtu ASTR"),
                        new Products(R.drawable.audifonos_quiet_comfort35, "Audífonos QuietComfort 35"),
                };

                ProductsAdapter musicaAdapter = new ProductsAdapter(this, R.layout.listview_item_products_row, musicaArray);
                products = (ListView) findViewById(R.id.listView);
                /*View header = (View) getLayoutInflater().inflate(R.layout.list_header_products_row, null);
                products.addHeaderView(header);*/
                products.setAdapter(musicaAdapter);

                break;
        }
    }
}
