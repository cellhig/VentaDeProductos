package com.example.higom.edpdm.ventadeproductos;

/**
 * Created by higom on 14/11/2017.
 */

public class Products {

    public Products() {
        super();
    }

    public Products(int icon, String tittle) {
        super();
        this.icon = icon;
        this.tittle = tittle;
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

    int icon;
    String tittle;


}
