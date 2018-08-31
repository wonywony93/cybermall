package com.kakao.mall;

import java.sql.SQLException;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kakao.mall.model.entity.UserVo;
import com.kakao.mall.service.UserService;

@Controller
public class IndexController {

	@Autowired
	UserService service;
	
	public void setService(UserService service) {
		this.service = service;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "index";
	}
	
	//회원가입
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String singUp() throws SQLException {

		return "signUp";
	}
	
	@RequestMapping(value="/userAdd",method=RequestMethod.POST)
	public String userAdd(UserVo bean,Model model) throws SQLException {
		System.out.println(bean);
		int result=service.insertOne(bean);
		if(result>0) {
			model.addAttribute("result","회원가입 성공");
			return "index";
		}
		else {
			return "signUp";
		}
	}
	//로그인
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public String singIn() throws SQLException {
		return "signIn";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session,UserVo bean,Model model) throws SQLException{
		
		String id=service.login(bean);
		System.out.println(id);
		if(id!=null)
		{
			session.setAttribute("id", id);
			return "redirect:/";
		}
		else {
			model.addAttribute("result", "아이디와 비밀번호를 확인해주세요");
			return "signIn";
		}
	}
	
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String category() {
		return "category";
	}
	
	@RequestMapping(value="/shoppingCart",method=RequestMethod.GET)
	public String shoppingCart() {
		return "cart";
	}
	
}
