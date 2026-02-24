package org.example;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
@Entity
public class WarehouseStock {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer warehouseId;
    public String warehouseName;
    public String timestamp;
    public String warehouseCountry;
    public String warehouseCity;
    public String address;

    @ElementCollection
    public List<Einkauf> purchaseRecords;


    @ElementCollection
    public List<ProductData> productData;

    public WarehouseStock() {}

    public WarehouseStock(
                          String warehouseName,
                          String timestamp,
                          String warehouseCountry,
                          String warehouseCity,
                          String address,
                          List<ProductData> productData) {

        this.warehouseName = warehouseName;
        this.timestamp = timestamp;
        this.warehouseCountry = warehouseCountry;
        this.warehouseCity = warehouseCity;
        this.address = address;
        this.productData = productData;
    }
}
