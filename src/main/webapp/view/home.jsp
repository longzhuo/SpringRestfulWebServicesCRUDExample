<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
<head>
	<title>SpringMVC学习首页</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
 
<P>  当前服务器时间 ${date}. </P>

<c:forEach items="${lists}" var="user" varStatus="vs">  
	<tr>
		<td>  
        	<s:property value="#vs.index+1"/>  
        </td>  
	</tr>
       
</c:forEach> 


<div id="global">
<h1>Book List</h1>
<table>
<tr>
    <th>Category</th>
    <th>Title</th>
    <th>ISBN</th>
    <th>Author</th>
</tr>
<c:forEach items="${books}" var="book">
    <tr>
        <td>${book.title}</td>
        <td>${book.isbn}</td>
        <td>${book.author}</td>
    </tr>
</c:forEach>
</table>


<h1>新闻 List</h1>
<table>
<tr>
    <th>link</th>
    <th>title</th>
    <th>detail</th>
    <th>laiyuan</th>
    <th>date</th>

</tr>
<c:forEach items="${news}" var="new">
    <tr>
        <td>${new.link }</td>
        <td>${new.title }</td>
        <td>${new.detail }</td>
        <td>${new.laiyuan }</td>
        <td>${new.date }</td>
       
    </tr>
</c:forEach>
</table>
</body>
</html>