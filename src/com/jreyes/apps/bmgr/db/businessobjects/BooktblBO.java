package com.jreyes.apps.bmgr.db.businessobjects;

import java.io.Serializable;

public class BooktblBO implements Serializable {

    private static final long serialVersionUID = -1445059679188116334L;
    private int bookId;
    private String bookTitle;
    private String bookGenre;
    private String bookAuthors;
    private int noOfPages;

    public BooktblBO(){
    }

    public BooktblBO(int bookId, String bookTitle, String bookGenre, String bookAuthors, int noOfPages) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookGenre = bookGenre;
        this.bookAuthors = bookAuthors;
        this.noOfPages = noOfPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(String bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
