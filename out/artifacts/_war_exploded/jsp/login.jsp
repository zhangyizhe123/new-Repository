<%--
  Created by IntelliJ IDEA.
  User: 86138
  Date: 2022/4/30
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css.css" >
</head>
<body>
<div class="mask"></div>
<form method="post" action="http://localhost:8080/web/login">
 <div class="page">
     <p class="title" align="center">嫌疑人查询</p>
     <div class="login">
         <p>姓名：<input type="text" align="center" name="username" class="username" placeholder="请输入嫌疑人姓名"></p>
         <p>密码：<input type="password" align="center" name="password" class="password" placeholder="请输入管理员密码"></p>
         <p><input type="submit" value="查询" class="button"></p>
     </div>
 </div>
</form>
<%--<aside>
    <p class="top">嫌疑人名单</p>
    <p>李杨</p>
    <p>乐舒阳</p>
    <p>李文哲</p>
    <p>冯磊</p>
    <p>李科宇</p>
    <p>朱炜明</p>
    <p>郑智</p>
</aside>--%>

</body>
</html>
