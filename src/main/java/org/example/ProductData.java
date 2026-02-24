package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ProductData {
    @Id
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
