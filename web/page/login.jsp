<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Spring MVC 传参方式</title>
</head>
<body>
<form action="/param" role="form">
    用户名：<input type="text" name="username" ><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="提  交">
</form>
</body>
</html>