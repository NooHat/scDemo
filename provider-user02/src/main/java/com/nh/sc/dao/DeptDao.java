package com.nh.sc.dao;


import com.nh.sc.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 95
 * @Title: DeptDao
 * @ProjectName scDemo
 * @Description: TODO
 * @date 2019/3/3011:13
 */
@Mapper
public interface DeptDao
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
