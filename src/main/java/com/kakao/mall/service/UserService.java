package com.kakao.mall.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kakao.mall.model.UserDao;
import com.kakao.mall.model.entity.ProductVo;
import com.kakao.mall.model.entity.ShoppingVo;
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
	public int buy(ShoppingVo bean) throws SQLException {
		return dao.buy(bean);
	}
	public List<ShoppingVo> cart(String id) throws SQLException{
		return dao.cart(id);
	}
}
