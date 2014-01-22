package com.jreyes.apps.bmgr.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.logging.Logger;

public class HibernateUtils {

    private static SessionFactory hbmSessionFactory;
    private static ServiceRegistry serviceRegistry;
    private static Logger LOGGER = Logger.getLogger(HibernateUtils.class.getName());

    static{
        try{
            Configuration cfg = new Configuration();
            cfg.configure(BookMgrConstant._HIBERNATE_CONFIG_LOCATION);
            serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
            hbmSessionFactory = cfg.buildSessionFactory(serviceRegistry);
            LOGGER.info("Test connection with the database created successfuly.");
        }catch (RuntimeException ex){
            System.out.println("An unexpected error while reading config file: "+ex.getMessage());
        }
    }

    public static Session getSession(){
        return hbmSessionFactory.openSession();
    }

    public static void closeSession(Session session){
        if(session!=null){
            session.close();
        }
    }

}
