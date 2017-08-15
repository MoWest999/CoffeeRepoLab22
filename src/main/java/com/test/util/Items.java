package com.test.util;

/**
 * Created by Grand Circus Student on 8/14/2017.
 */
public class Items {

        private String items;
        private String description;
        private int quantity;
        private double price;

        public Items (){
            items = "";
            description = "";
            quantity = 0;
            price = 0.0;
            }

        public Items(String cid, String dname, int q, double pr) {
            items = cid;
            description = dname;
            quantity = q;
            price = pr;
        }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        items = items;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
            return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    }


