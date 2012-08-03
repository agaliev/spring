package de.galiev.kiosk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*@Scope("session")
@Controller
@RequestMapping("/welcome")
public class ShopFront {
	protected WareDAO wareDAO;
	protected Cart cart;
	protected String sct;
	
	public WareDAO getWareDAO() {
		return wareDAO;
	}

	@Autowired
	public void setWareDAO(WareDAO wareDAO) {
		this.wareDAO = wareDAO;
	}

	public ShopFront(){
		//wareDAO = new WareDAOImpl(); 
		cart = new Cart();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getWelcome(Model model){
		model.addAttribute("sections", wareDAO.getSections());
		return "welcome";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitChoice(@RequestParam("htmlFormName") String select, Model model){
		List<Ware> wares = wareDAO.findWare(select);
		if(!wares.isEmpty()){
			//cart.addItem(wares.get(0));
		}
		model.addAttribute("articles", wareDAO.getAssortment(sct));
		return sct;
	}
	
	@RequestMapping(value="/checkout", method=RequestMethod.POST)
	public String proceedToPay(Model model){
		CashPoint cashpoint = new CashPoint();
		model.addAttribute("cashpoint", cashpoint);
		model.addAttribute("shoppingcart", cart);
		return "checkout";
	}
	
	@RequestMapping(value="/shop/{section}")
	public String getWares(@PathVariable String section, Model model){
		sct=section;
		model.addAttribute("articles", wareDAO.getAssortment(sct));
		return "vitrine";
	}
}*/
