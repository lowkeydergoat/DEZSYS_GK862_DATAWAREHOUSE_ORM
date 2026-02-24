package org.example;

import org.springframework.data.repository.CrudRepository;

public interface WarehouseStockRepository
        extends CrudRepository<WarehouseStock, Integer> {

}