package com.gy.demo.mapper;

import com.gy.demo.model.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:26
 * @Version 1.0
 **/
@Mapper
public interface UserRoleMapper{
    @Select("select * from sys_user_role where user_id = #{userId}")
    List<SysUserRole> selectListByUserId(Long userId);
}
