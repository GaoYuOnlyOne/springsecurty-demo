package com.gy.demo.mapper;

import com.gy.demo.model.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName UserMapper
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:26
 * @Version 1.0
 **/
@Mapper
public interface UserMapper{
    @Select("select * from sys_user where name = #{userName}")
    SysUser selectByName(String userName);
}
