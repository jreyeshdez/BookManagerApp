package com.jreyes.apps.bmgr.web.actions;


import com.jreyes.apps.bmgr.db.businessobjects.BooktblBO;
import com.jreyes.apps.bmgr.web.delegates.BookManagerDelegate;
import com.jreyes.apps.bmgr.web.forms.MusicManagerForm;

import java.util.List;

public class BookManagerAction extends MusicManagerForm {
    private static final long serialVersionUID = 9168149105719285096L;
    private BookManagerDelegate bookMgrDelegate = new BookManagerDelegate();

    public String getAllBookList(){
        List bookList = bookMgrDelegate.getAllBook();
        String returnString = ERROR;
        if(bookList != null){
            setBookList(bookList);
            returnString = SUCCESS;
        }
        return returnString;
    }

    public String addBookToCollection(){
        String returnString = ERROR;
        BooktblBO book = getBook();

        if(bookMgrDelegate.addBookToCollection(book)){
            returnString = SUCCESS;
        }
        return returnString;
    }

    public String delBookFromCollection(){
        String returnString = ERROR;
        int bookId = getBookId();

        if(bookMgrDelegate.delBookFromCollection(bookId)){
            returnString = SUCCESS;
        }
        return returnString;
    }
}
