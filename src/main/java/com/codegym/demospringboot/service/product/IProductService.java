package com.codegym.demospringboot.service.product;

import com.codegym.demospringboot.model.Product;
import com.codegym.demospringboot.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService extends IGeneralService<Product> {
    Page<Product> findProductByNameContaining(String name, Pageable pageable);
    Page<Product> findAll(Pageable pageable);
    Iterable<Product> findProductPriceBetween(Double min, Double max);
    Page<Product> getProductWithName(Long id, Pageable pageable);
}