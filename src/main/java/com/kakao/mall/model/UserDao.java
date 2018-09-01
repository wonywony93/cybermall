package com.kakao.mall.model;

import java.sql.SQLException;
import java.util.List;

import com.kakao.mall.model.entity.ShoppingVo;
import com.kakao.mall.model.entity.UserVo;

public interface UserDao {
	
	//ȸ������
	public int insertOne(UserVo bean) throws SQLException;
	//�α���
	public String login(UserVo bean) throws SQLException;
	public int buy(ShoppingVo bean) throws SQLException;
	public List<ShoppingVo> cart(String id) throws SQLException;
}
