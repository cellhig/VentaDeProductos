package com.example.higom.edpdm.ventadeproductos;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by higom on 14/11/2017.
 */

public class ProductsAdapter extends ArrayAdapter<Products> {

    Context context;
    int resource;
    Products data[] = null;

    public ProductsAdapter(@NonNull Context context, int resource, Products[] data) {
        super(context, resource, data);

        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    public View getView(int position, View convertview, ViewGroup parent){
        View row = convertview;
        ProductsHolder holder = new ProductsHolder();

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(resource, parent, false);

            holder.imageView = (ImageView) row.findViewById(R.id.imageViewProductoItem);
            holder.textView = (TextView) row.findViewById(R.id.textViewProductoItem);
            row.setTag(holder);

        } else {
            holder = (ProductsHolder) row.getTag();
        }

        Products products = data[position];
        holder.textView.setText(products.tittle);
        holder.imageView.setImageResource(products.icon);

        return row;
    }

    static class ProductsHolder{

        ImageView imageView;
        TextView textView;
    }
}
