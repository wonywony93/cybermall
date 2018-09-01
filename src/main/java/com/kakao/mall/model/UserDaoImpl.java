package com.kakao.mall.model;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kakao.mall.model.entity.ShoppingVo;
import com.kakao.mall.model.entity.UserVo;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sqlSession;

	@Override
	public int insertOne(UserVo bean) throws SQLException {
		return sqlSession.insert("userInfo.insertOne",bean);
	}
	@Override
	public String login(UserVo bean) throws SQLException {
		return sqlSession.selectOne("userInfo.login",bean);
	}
	@Override
	public int buy(ShoppingVo bean) throws SQLException {
		return sqlSession.insert("userInfo.buy", bean);
	}
	@Override
	public List<ShoppingVo> cart(String id) throws SQLException {
		return sqlSession.selectList("userInfo.cart", id);
	}
}
