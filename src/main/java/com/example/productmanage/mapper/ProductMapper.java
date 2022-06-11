package com.example.productmanage.mapper;

import com.example.productmanage.domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    List<Product> getList();

    int save(@Param("product") Product pro);

    int delete(@Param("id")int id);

    int update(@Param("product") Product product);

    Product findByName(@Param("name")String name);
}
