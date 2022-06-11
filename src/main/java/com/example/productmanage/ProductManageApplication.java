package com.example.productmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.productmanage.mapper")
public class ProductManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManageApplication.class, args);
	}

}
