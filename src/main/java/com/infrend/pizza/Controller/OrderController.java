package com.infrend.pizza.Controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infrend.pizza.DAO.MenuRepository;
import com.infrend.pizza.DAO.OrderRepository;
import com.infrend.pizza.Model.Menu;
import com.infrend.pizza.Model.Order;

@Controller
public class OrderController {
	
	@Autowired
	MenuRepository menuRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@RequestMapping("/")
	public String Index() {
		
		return "index.jsp";
	}
	
	public List<Menu> getMenu() {
		List<Menu> menu = menuRepository.findAll();
		
		return menu;
		
	}
	
	@RequestMapping(value="/showMenu",method=RequestMethod.GET)
	public String getAllMenu(Model model) {
		model.addAttribute("menu",getMenu());
		return "menu.jsp";
	}
	
	@RequestMapping(value="/selectedMenu", method=RequestMethod.GET )
	public ModelAndView getMenu(@RequestParam int id){
		ModelAndView mv = new ModelAndView("selectedMenu.jsp");
		Menu menu = menuRepository.findById(id).orElse(new Menu());
		mv.addObject(menu);
		
		return mv;
	}
	
	@RequestMapping("/addOrder")
	public String addItem(Order order){
		
		orderRepository.save(order);
		
		return "index.jsp";
	}
	
}
