package com.ict.mybatis2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Ex01_DBService {
	
	//	마이바티스 pdf 파일 2 page
	static private SqlSessionFactory factory;
	static String resource = "com/ict/mybatis2/ex01_config.xml";
	static {
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
		}
	}
	
	//	접근 가능한 메서드를 만들자
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
