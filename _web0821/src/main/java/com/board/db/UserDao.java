package com.board.db;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class UserDao {
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;
	
	public UserDao() {
		
		session = sqlsession_f.openSession(true);
	}
	
	public void insertOne(UserDto map) {
		session.insert("UserMapper.insertOne", map);
	}
	
}
