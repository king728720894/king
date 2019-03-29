package com.kexun.tools;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CreateSqlSession {
public static SqlSession getSession() {
	//类似于数据库连接对象
	SqlSessionFactory sf=null;//数据库连接对象
	SqlSession session=null;
	try {
		//使用java的字符输入流
		Reader rd=Resources.getResourceAsReader("mybatis.xml");
		//生成数据库连接对象
		sf=new SqlSessionFactoryBuilder().build(rd);
		session=sf.openSession();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return session;
}
public static void closeSession(SqlSession session) {
	if(session!=null) {
		session.close();
	}
}

}
