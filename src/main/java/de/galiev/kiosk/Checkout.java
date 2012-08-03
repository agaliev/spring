package de.galiev.kiosk;

public class Checkout {
	protected Cart shoppingcart;
	
	public Checkout(Cart shoppingcart) {
		super();
		this.shoppingcart = shoppingcart;
	}

	public Cart getShoppingcart() {
		return shoppingcart;
	}

	public void setShoppingcart(Cart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}
	
	public void pay(){
		
	}
}
