package com.kakao.mall.model;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kakao.mall.model.entity.ProductVo;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<ProductVo> getProductList() throws SQLException {
		return sqlSession.selectList("productInfo.selectAll");
	}
	@Override
	public ProductVo selectOne(String code) throws SQLException {
		return sqlSession.selectOne("productInfo.selectOne", code);
	}
}
