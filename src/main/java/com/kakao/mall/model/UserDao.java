package com.kakao.mall.model;

import java.sql.SQLException;

import com.kakao.mall.model.entity.UserVo;

public interface UserDao {
	
	//ȸ������
	public int insertOne(UserVo bean) throws SQLException;
	//�α���
	public String login(UserVo bean) throws SQLException;
}
