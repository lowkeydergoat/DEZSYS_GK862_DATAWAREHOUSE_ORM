package org.example;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.List;
@Entity
public class WarehouseStock {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String warehouseId;
    public String warehouseName;
    public String timestamp;
    public String warehouseCountry;
    public String warehouseCity;
    public String address;

    public List<ProductData> productData;

    public WarehouseStock() {}

    public WarehouseStock(String warehouseId,
                          String warehouseName,
                          String timestamp,
                          String warehouseCountry,
                          String warehouseCity,
                          String address,
                          List<ProductData> productData) {

        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.timestamp = timestamp;
        this.warehouseCountry = warehouseCountry;
        this.warehouseCity = warehouseCity;
        this.address = address;
        this.productData = productData;
    }
}
