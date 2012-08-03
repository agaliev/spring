package de.galiev.kiosk;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Cart {
	protected List<Ware> items;
	protected Long id;
	protected float total;
	protected WareDAO wareDAO;
	
	public Cart(){
		items = new ArrayList<Ware>();
	}
	
	public List<Ware> getItems() {
		return items;
	}

	public void setItems(List<Ware> items) {
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public WareDAO getWareDAO() {
		return wareDAO;
	}

	@Autowired
	public void setWareDAO(WareDAO wareDAO) {
		this.wareDAO = wareDAO;
	}

	public void addItem(String position){
		List<Ware> lst = wareDAO.findWare(position);
		Ware wr = lst.get(0);
		items.add(wr);
		total = total + wr.getPrice();
	}
}
