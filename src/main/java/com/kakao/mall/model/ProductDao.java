package com.kakao.mall.model;

import java.sql.SQLException;
import java.util.List;

import com.kakao.mall.model.entity.ProductVo;

public interface ProductDao {

	public List<ProductVo> getProductList() throws SQLException;

	public ProductVo selectOne(String code) throws SQLException;

}
