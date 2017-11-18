package com.example.higom.edpdm.ventadeproductos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        texto = (TextView) findViewById(R.id.textViewProductoDetalle);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null) {
            String detalle = extras.getString("OBJETO");
            texto.setText(detalle);
        } else {
            texto.setText("nada");
        }
    }
}
