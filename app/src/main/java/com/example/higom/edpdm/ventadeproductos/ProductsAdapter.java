package com.example.higom.edpdm.ventadeproductos;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by higom on 14/11/2017.
 */

public class ProductsAdapter extends ArrayAdapter<Products> {
    public ProductsAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
