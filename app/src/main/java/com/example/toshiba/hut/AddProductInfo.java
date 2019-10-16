package com.example.toshiba.hut;

/**
 * Created by Toshiba on 04-Jul-19.
 */

public class AddProductInfo {
    private String productNme;
    AddProductInfo(){

    }
    public void setProductName(String name){
        this.productNme = name;
    }
    public String getProductName(){
        return  productNme;
    }
}
