package com.kexun.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.kexun.dao.HqyDao;
import com.kexun.entity.Hqy;
import com.kexun.tools.CreateSqlSession;

public class HqyService {

public static List<Hqy> getList() {
	SqlSession session=CreateSqlSession.getSession();
	//接口指向了HqyMapper.xml配置文件生成的一个对象
	HqyDao hd=session.getMapper(HqyDao.class);
	List<Hqy> list=hd.selectAll();
	session.commit();
	session.close();
	return list;
	
	
}
public static void main(String[] args) {

}
}
