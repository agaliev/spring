package de.galiev.kiosk;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;


@Component
public class HibernateUtil implements Serializable{
 
    private SessionFactory sessionFactory;
    private ServiceRegistry serviceRegistry;

    public HibernateUtil(){
        Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
 
    public void shutdown() {
    	// Close caches and connection pools
    	sessionFactory.close();
    }
    
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	public void setServiceRegistry(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}

	public Session getSession(){    
    	return sessionFactory.openSession();
    }    
 
}