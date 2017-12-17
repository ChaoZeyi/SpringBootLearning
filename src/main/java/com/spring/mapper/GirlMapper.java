package com.spring.mapper;

import com.spring.entity.Girl;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author cherry
 * @date 2017/12/17 12:01
 */
@Mapper
@Component
public interface GirlMapper {

    @Select("select * from girl")
    List<Girl> selectAll();

    @Insert("insert into girl(name, age) values (#{name}, #{age})")
    int addGirl(@Param("name") String name, @Param("age") Integer age);

    @Select("select * from girl where id = #{id}")
    Girl selectById(@Param("id") Integer id);

    @Update("update girl set age = #{age} where id = #{id}")
    int updateGirlById(@Param("id") Integer id, @Param("age") Integer age);

    @Delete("delete from girl where id = #{id}")
    int deleteGirlById(@Param("id") Integer id);
}
