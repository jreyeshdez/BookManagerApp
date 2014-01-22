package com.jreyes.apps.bmgr.web.delegates;


import com.jreyes.apps.bmgr.db.businessobjects.BooktblBO;
import com.jreyes.apps.bmgr.db.dao.BookManagerDao;
import com.jreyes.apps.bmgr.db.dao.BookManagerDaoImpl;

import java.util.List;

public class BookManagerDelegate {
    BookManagerDao bmgrDao = (BookManagerDao)new BookManagerDaoImpl();

    public List getAllBook(){
        return bmgrDao.getAllBookFromCollection();
    }

    public boolean addBookToCollection(BooktblBO book){
        return bmgrDao.addBook(book);
    }

    public boolean delBookFromCollection(int bookId){
        return bmgrDao.delBook(bookId);
    }
}
