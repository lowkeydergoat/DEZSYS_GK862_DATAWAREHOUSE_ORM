package org.example;

import org.springframework.data.repository.CrudRepository;

public interface ProductDataRepository
        extends CrudRepository<ProductData, String> {

}