package com.java.Flipkart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flipkart")
public class Flipkart {
    @Id
    String productid;
    int price;
    String manufacturelocation;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturelocation() {
        return manufacturelocation;
    }

    public void setManufacturelocation(String manufacturelocation) {
        this.manufacturelocation = manufacturelocation;
    }
}
