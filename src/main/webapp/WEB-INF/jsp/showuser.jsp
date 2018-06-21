<%@ page import="controller.mybatics.UserService" %>
<%@ page import="java.util.List" %>
<%@ page import="controller.mybatics.User" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
</head>
<body>
<%
    List<User> list= (List<User>) request.getAttribute("add");
    for (int i = 0; i < list.size(); i++) {
        out.println(list.get(i).getName());
    }
%>

</body>
</html>