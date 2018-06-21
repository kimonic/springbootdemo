<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <style type="text/css">
        .topwidth {
            width: 120px;
            display: inline-block;
            align-content: center;
        }

        a {
            color: black;
            text-decoration: none;
        }

        .topdiv {
            padding-top: 10px;
            padding-bottom: 10px;
            background-color: orange;
            width: 60%
        }

        .sidebyside {
            float: left;
        }

        /*设置图片按父容器宽度自动缩放，并且保持图片原本的长宽比*/
        img {
            width: auto;
            height: auto;
            max-width: 100%;
            max-height: 100%;
        }

        .loginstyle {
            width: 80px;
            display: inline-block;
            margin-top: 10px;
            text-align: right;
        }

    </style>
</head>
<body>
<div align="center">
    <div class="topdiv">
        <label><a href="">首页</a>
        </label>
        <label class="topwidth"><a href="">偶遇佳句</a>
        </label>
        <label class="topwidth"><a href="">名人名句</a>
        </label>
        <label class="topwidth"><a href="">原创句子</a>
        </label>
        <label class="topwidth"><a href="">精选句集</a>
        </label>
        <label class="topwidth"><a href="">美图美句</a>
        </label>
        <label><a href="">寻找知音</a>
        </label>
    </div>
    <div style="width: 60%">
        <div class="sidebyside" style="width: 70%;">
            <div style="margin: 20px">
                <img src="http://img.juzimi.com/juzimi/images/juzimib1_s1.jpg" alt="">

            </div>


        </div>

        <div class="sidebyside" style="width: 30%;height: 1000px;">
            <div style="align-content: center;margin: 10px;border: 1px solid red">
                <form action="" method="post">
                    <label class="loginstyle">邮箱账号: &nbsp; </label><input type="text" name="name" id="name"
                                                                  placeholder="请输入用户名邮箱"><br>
                    <label class="loginstyle">密码: &nbsp; </label><input type="password" name="password" id="password"
                                                                placeholder="请输入密码">
                    <div style="margin-top: 10px;align-content: center;margin-bottom: 10px">
                        <input type="button" name="register" id="register" value="快速注册">
                        &nbsp; &nbsp; &nbsp; &nbsp;
                        <input type="submit" name="login" id="login" value="登陆">
                    </div>

                </form>
            </div>

        </div>
    </div>


    <%--<%--%>
    <%--out.println(session.getAttribute("sessionarg"));--%>
    <%--%>--%>
    <%--<a href="http://localhost:8080/html/hello.html">访问静态heml页面</a><br><br>--%>
    <%--<a href="/html/hello.html">访问静态heml页面,无主机地址</a>--%>
    <%--<form action="/index1" method="post">--%>
    <%--请输入用户名: <input type="text" id="name" name="name"><br>--%>
    <%--请输入密码:<input type="password" id="password" name="password"><br>--%>
    <%--请输入年龄: <input type="text" id="age" name="age"><br>--%>
    <%--<input type="submit" name="submit" value="提交">--%>
    <%--</form>--%>
</div>

</body>
</html>
