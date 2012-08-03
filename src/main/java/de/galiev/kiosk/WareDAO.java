package de.galiev.kiosk;

import java.util.List;

import org.springframework.stereotype.Component;

public interface WareDAO {

	public abstract List<Ware> findWare(String name);
	public abstract List<Ware> getAssortment(String section);
	public abstract List<String> getSections();

}