
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Personal Book Manager Application</title>
</head>
<body>
<h2>:: Personal Book Manager ::</h2>
<div style="margin-bottom: 25px;">
    <s:form action="addBook" method="POST">
        <s:textfield label="Book Title" name="book.bookTitle" />
        <s:textfield label="Book Genre" name="book.bookGenre"/>
        <s:textarea label="Book Authors" name="book.bookAuthors"/>
        <s:textfield label="Total No of Pages" name="book.noOfPages"/>

        <s:submit value="Add Book" align="center" />
    </s:form>
</div>
<div>
    <table style="border: 1px dotted black;">
    <tr>
        <th style="background-color: #ABDCFF;">Book Title</th>
        <th style="background-color: #ABDCFF;">Book Genre</th>
        <th style="background-color: #ABDCFF;">Book Authors</th>
        <th style="background-color: #ABDCFF;">Total No of Pages</th>
        <th style="background-color: #ABDCFF;">Delete</th>
    </tr>
    <s:iterator value="bookList" var="book">
        <tr>
            <td><s:property value="bookTitle"/></td>
            <td><s:property value="bookGenre"/></td>
            <td><s:property value="bookAuthors"/></td>
            <td><s:property value="noOfPages"/></td>
            <td><a href="delBook.action?bookId=<s:property value="bookId"/>">delete</a> </td>
        </tr>
    </s:iterator>
    </table>
</div>
</body>
</html>