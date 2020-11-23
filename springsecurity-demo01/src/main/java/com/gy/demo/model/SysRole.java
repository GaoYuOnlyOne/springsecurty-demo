package com.gy.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName SysRole
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:35
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_role")
public class SysRole {
    @Id
    private Long id;
    private String name;
}
