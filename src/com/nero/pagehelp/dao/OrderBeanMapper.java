package com.nero.pagehelp.dao;

import com.nero.pagehelp.bean.OrderBean;

public interface OrderBeanMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderBean record);

    int insertSelective(OrderBean record);

    OrderBean selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderBean record);

    int updateByPrimaryKey(OrderBean record);
}