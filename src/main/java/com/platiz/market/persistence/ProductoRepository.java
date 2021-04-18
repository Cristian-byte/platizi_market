package com.platiz.market.persistence;

import com.platiz.market.persistence.crud.ProductoCrudRepository;
import com.platiz.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
