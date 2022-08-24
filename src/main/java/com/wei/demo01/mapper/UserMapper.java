package com.wei.demo01.mapper;

import com.wei.demo01.entity.UserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    //查询，可以实现登录功能
    @Select("SELECT * FROM user WHERE name = #{name} AND password = #{password}")
    UserBean getInfo(@Param("name") String name, @Param("password") String password);

    //多个参数要加@Param修饰
    //增加，可以实现注册功能
    @Insert("insert into user(name,password)values(#{name},#{password})")
    void saveInfo(@Param("name") String name, @Param("password") String password);
}