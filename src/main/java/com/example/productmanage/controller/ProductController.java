package com.example.productmanage.controller;

import com.example.productmanage.domain.Product;
import com.example.productmanage.service.ProductService;
import com.example.productmanage.utils.JsonData;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pri/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("list_product")
    JsonData getListProduct(){

        List<Product> productList = productService.getListProduct();
        return JsonData.buildSuccess(productList);

    }

    @GetMapping("find_by_name")
    JsonData findByName(@RequestParam("name") String name){
        Product product = productService.findByName(name);
        return JsonData.buildSuccess(product);

    }

    @PostMapping("save")
    JsonData save(@RequestBody Product product){

        int link = productService.save(product);
        if(link==1){
            return JsonData.buildSuccess("添加成功");
        }
        return JsonData.buildError("添加失败");
    }


    @GetMapping("delete")
    JsonData delete(@RequestParam("id") int id){
        int link = productService.delete(id);
        if(link==1){
            return JsonData.buildSuccess("删除成功");
        }
        return JsonData.buildError("删除失败");
    }

    @PostMapping("update")
    JsonData update(@RequestBody Product product){

        int link = productService.update(product);
        if(link==1){
            return JsonData.buildSuccess("修改成功");
        }
        return JsonData.buildError("修改失败");
    }



}
