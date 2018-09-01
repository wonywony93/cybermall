package com.kakao.mall;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kakao.mall.model.entity.ProductVo;
import com.kakao.mall.model.entity.ShoppingVo;
import com.kakao.mall.model.entity.UserVo;
import com.kakao.mall.service.ProductService;
import com.kakao.mall.service.UserService;

@Controller
public class IndexController {

	@Autowired
	UserService service;
	@Autowired
	ProductService pService;
	
	public void setService(UserService service) {
		this.service = service;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "index";
	}
	
	//ȸ������
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String singUp() throws SQLException {

		return "signUp";
	}
	
	@RequestMapping(value="/userAdd",method=RequestMethod.POST)
	public String userAdd(UserVo bean,Model model) throws SQLException {
		System.out.println(bean);
		int result=service.insertOne(bean);
		if(result>0) {
			model.addAttribute("result","ȸ������ ����");
			return "index";
		}
		else {
			return "signUp";
		}
	}
	//�α���
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
			model.addAttribute("result", "���̵�� ��й�ȣ�� Ȯ�����ּ���");
			return "signIn";
		}
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {		
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String category(Model model) throws SQLException {
		List<ProductVo> list=pService.getProductList();
		model.addAttribute("categoryList",list);
		return "category";
	}

	@ResponseBody
	@RequestMapping(value = "/detail", method = RequestMethod.POST,produces="application/json;")
	public ProductVo productDetail(String code) throws SQLException {
		System.out.println(code);
		ProductVo bean=pService.selectOne(code);
		System.out.println(bean);
		if(bean!=null) {
		return bean;
		}
		else
			return null;
	}	
	
	//�����ϱ� 
	@RequestMapping(value="/buy",method=RequestMethod.POST)
	public String buy(int amount,String code,int price,HttpSession session) throws SQLException {
		System.out.println("code:"+code);
		System.out.println("amount:"+amount);
		String id=session.getAttribute("id").toString();
		int totalMoney=price*amount;
		ShoppingVo bean=new ShoppingVo();
		bean.setCode(code);
		bean.setId(id);
		bean.setAmount(amount);
		bean.setTotalMoney(totalMoney);
		
		System.out.println(id);
		int result=service.buy(bean);
		if(result>0)
			{
			System.out.println("����");
			return "redirect:/category";
			}
		else {
			System.out.println("����");
			return "redirect:/category";
		}
	}	
	
	//�����̷º���
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String cart(Model model,HttpSession session) throws SQLException {
		String id=session.getAttribute("id").toString();
		List<ShoppingVo> list=service.cart(id);
		model.addAttribute("clist",list);
		return "cart";
	}
	
	
}
