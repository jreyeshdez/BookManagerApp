package com.jreyes.apps.bmgr.db.dao;

import com.jreyes.apps.bmgr.db.businessobjects.BooktblBO;
import com.jreyes.apps.bmgr.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

public class BookManagerDaoImpl implements BookManagerDao {

    @Override
    public List getAllBookFromCollection() {
        List bookList = null;
        Session hbmSession = null;
        try{
            hbmSession = HibernateUtils.getSession();
            Criteria criteria = hbmSession.createCriteria(BooktblBO.class);
            bookList = criteria.list();
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            HibernateUtils.closeSession(hbmSession);
        }
        return bookList;
    }

    @Override
    public boolean addBook(BooktblBO book) {
        Session hbmSession = null;
        boolean STATUS_FLAG = true;
        try{
            hbmSession = HibernateUtils.getSession();
            hbmSession.beginTransaction();
            //add the book to the hibernate session to save
            hbmSession.save(book);
            hbmSession.getTransaction().commit();
        } catch (Exception ex){
            ex.printStackTrace();
            STATUS_FLAG = false;
        } finally {
            HibernateUtils.closeSession(hbmSession);
        }
        return STATUS_FLAG;
    }

    @Override
    public boolean delBook(int bookId) {
        Session hbmSession = null;
        boolean STATUS_FLAG = true;
        try{
            hbmSession = HibernateUtils.getSession();
            hbmSession.beginTransaction();
            //will retrive the book corresponds to that id
            BooktblBO booktblBO = (BooktblBO)hbmSession.load(BooktblBO.class, bookId);
            hbmSession.delete(booktblBO);
            hbmSession.getTransaction().commit();
        } catch (Exception ex){
            ex.printStackTrace();
            STATUS_FLAG = false;
        } finally {
            HibernateUtils.closeSession(hbmSession);
        }
        return STATUS_FLAG;
    }
}
