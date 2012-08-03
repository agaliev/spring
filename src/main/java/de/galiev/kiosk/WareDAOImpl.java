package de.galiev.kiosk;

import java.io.Serializable;
import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class WareDAOImpl implements WareDAO, Serializable {

	protected HibernateUtil hibernateutil;

	public HibernateUtil getHibernateutil() {
		return hibernateutil;
	}

	@Autowired
	public void setHibernateutil(HibernateUtil hibernateutil) {
		this.hibernateutil = hibernateutil;
	}

	protected List<Ware> articles;

	public WareDAOImpl() {
	}

	public List<Ware> getAssortment(String section) {
		Session session = hibernateutil.getSession();
		//Query query = session.createQuery("select s.id from Section s where s.name=:section");
		//query.setParameter("section", section);		
		//long n = (Long)query.list().get(0);
		Query query = session.createQuery("select w from Ware w where w.section.name=:section");
		query.setParameter("section", section);
		articles = (List<Ware>) query.list();
		return articles;
	} 

	public void setAssortment(List<Ware> assortment) {
		this.articles = assortment;
	}

	public List<Ware> findWare(String name) {
		Session session = hibernateutil.getSession();
		Query query = session
				.createQuery("select w from Ware w where w.name=:name");
		query.setParameter("name", name);
		return query.list();
	}

	public List<String> getSections() {
		Session session = hibernateutil.getSession();
		Query query = session.createQuery("select s from Section s");
		return query.list();
	}
}
