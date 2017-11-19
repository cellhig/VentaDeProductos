package com.example.higom.edpdm.ventadeproductos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    TextView texto;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        texto = (TextView) findViewById(R.id.textViewProductoDetalle);
        imageView = (ImageView) findViewById(R.id.imageViewProducto);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null) {
            String detalle = extras.getString("DESCRIPTION");
            int image = extras.getInt("ICON");
            texto.setText(detalle);
            imageView.setImageResource(image);
        } else {
            texto.setText("nada");
        }
    }
}
