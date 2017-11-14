package com.example.higom.edpdm.ventadeproductos;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

/**
 * Created by higom on 13/11/2017.
 */

public class ImagesAdapter extends ArrayAdapter<Images> {

    Context context;
    int resource;
    Images data[] = null;

    public ImagesAdapter(@NonNull Context context, int resource, Images[] data) {
        super(context, resource, data);

        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    public View getView(int position, View convertview, ViewGroup parent){
        View row = convertview;
        ImagesHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(resource, parent, false);

            holder = new ImagesHolder();
            holder.image = (ImageView) row.findViewById(R.id.imageItemRandom);
            row.setTag(holder);

        } else {
            holder = (ImagesHolder)row.getTag();
        }

        Images images = data[position];
        holder.image.setImageResource(images.icon);



        return row;
    }

    static class ImagesHolder{
        ImageView image;
    }
}
