package org.example;

import jakarta.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class Einkauf {

    public String productId;

    public String purchaseDate;

    public Einkauf(String productId) {
        this.productId = productId;
        this.purchaseDate = "2026-02-24";
    }

    public Einkauf() {
        this.purchaseDate = "2026-02-24";
    }
}