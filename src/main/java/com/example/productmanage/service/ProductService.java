package com.example.productmanage.service;

import com.example.productmanage.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getListProduct();

    int save(Product pro);

    int delete(int id);

    int update(Product product);

    Product findByName(String name);
}
