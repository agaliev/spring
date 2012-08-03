package de.galiev.kiosk;

public class CashPoint implements Terminal{
	public void acceptPayment(float value){
		System.out.println("please pay"+value);
	}
}
