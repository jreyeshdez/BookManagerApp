package com.jreyes.apps.bmgr.web.forms;


import com.jreyes.apps.bmgr.db.businessobjects.BooktblBO;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class MusicManagerForm extends ActionSupport {

    private static final long serialVersionUID = 706337856877546963L;

    private List bookList = null;
    private BooktblBO book = null;
    private int bookId;

    public List getBookList() {
        return bookList;
    }

    public void setBookList(List bookList) {
        this.bookList = bookList;
    }

    public BooktblBO getBook() {
        return book;
    }

    public void setBook(BooktblBO book) {
        this.book = book;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
