package org.example;

import jakarta.persistence.*;

@Embeddable
public class ProductData {
    @GeneratedValue(strategy= GenerationType.AUTO)
    public String productId;
    public String productName;
    public String productCategory;
    public int productAmount;
    public String productUnit;

    public ProductData() {}

    public ProductData(String productId,
                       String productName,
                       String productCategory,
                       int productAmount,
                       String productUnit) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productAmount = productAmount;
        this.productUnit = productUnit;
    }
}
