package com.jreyes.apps.bmgr.db.dao;


import com.jreyes.apps.bmgr.db.businessobjects.BooktblBO;

import java.util.List;

public interface BookManagerDao {

    public List getAllBookFromCollection();
    public boolean addBook(BooktblBO book);
    public boolean delBook(int bookId);
}
