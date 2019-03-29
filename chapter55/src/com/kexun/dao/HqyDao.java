package com.kexun.dao;

import java.util.List;

import com.kexun.entity.Hqy;

public interface HqyDao {
	//mybatis是接口编程,它的配置文件(HqyMapper.xml)是与接口绑定的
public List<Hqy> selectAll();

public void add(Hqy hqy);



}
