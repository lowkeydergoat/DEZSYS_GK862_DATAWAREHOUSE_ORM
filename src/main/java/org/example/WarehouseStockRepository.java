package org.example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface WarehouseStockRepository
        extends CrudRepository<WarehouseStock, Integer> {
    WarehouseStock findByWarehouseId(Integer warehouseID);

}