package com.kakao.mall.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kakao.mall.model.ProductDao;
import com.kakao.mall.model.entity.ProductVo;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;

	public List<ProductVo> getProductList() throws SQLException {
		return dao.getProductList();
	}

	public ProductVo selectOne(String code) throws SQLException {
		return dao.selectOne(code);
	}
}
