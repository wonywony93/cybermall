package com.kakao.mall.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kakao.mall.model.UserDao;
import com.kakao.mall.model.entity.UserVo;

@Service
public class UserService {

	@Autowired
	UserDao dao;
	
	public int insertOne(UserVo bean) throws SQLException {
		     return dao.insertOne(bean);
	 }
	public String login(UserVo bean) throws SQLException{
		return dao.login(bean);
	}
}
