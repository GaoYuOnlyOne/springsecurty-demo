package com.gy.demo.common.base;


import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName BaseMapper     不能使用compoentScan扫描
 * @Description
 * @Author gaoyu
 * @Date 2020/11/23 11:05
 * @Version 1.0
 **/
public interface BaseMapper<T> extends Mapper<T>{
}
