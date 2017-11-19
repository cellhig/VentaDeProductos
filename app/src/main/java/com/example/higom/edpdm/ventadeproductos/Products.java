package com.example.higom.edpdm.ventadeproductos;

import java.io.Serializable;

/**
 * Created by higom on 14/11/2017.
 */

public class Products implements Serializable {

    int id;
    int icon;
    String tittle;
    String category;
    String description;
    int price;

    public Products() {
        super();
    }

    public Products(int id, int icon, String tittle, String category, String description, int price) {
        this.id = id;
        this.icon = icon;
        this.tittle = tittle;
        this.category = category;
        this.description = description;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
