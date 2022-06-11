package com.example.productmanage.mapper;

import com.example.productmanage.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    int save(@Param("user") User userNew);

    User findByNameAndPwd(@Param("user") User userNew);


}
