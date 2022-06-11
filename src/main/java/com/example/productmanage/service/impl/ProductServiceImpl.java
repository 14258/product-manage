package com.example.productmanage.service.impl;

import com.example.productmanage.domain.Product;
import com.example.productmanage.mapper.ProductMapper;
import com.example.productmanage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getListProduct() {

        List<Product> productList = productMapper.getList();
        return productList;
    }

    @Override
    public int save(Product pro) {

        int link = productMapper.save(pro);
        return link;
    }

    @Override
    public int delete(int id) {
        return productMapper.delete(id);
    }

    @Override
    public int update(Product product) {
        return productMapper.update(product);
    }

    @Override
    public Product findByName(String name) {
        return productMapper.findByName(name);
    }


}
