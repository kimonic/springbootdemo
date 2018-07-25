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
            width: 1000px
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
            width: 90px;
            display: inline-block;
            margin-top: 10px;
            text-align: right;
        }

        .kuaisuzhuce {
            display: inline-block;
            background: url(http://localhost:8080/images/bu_register.jpg) no-repeat center center;
            width: 80px;
            height: 22px;
            background-size: 100% 100%;
        }

        .login {
            display: inline-block;
            background: url(http://img.juzimi.com/juzimi/images/bu_login.jpg) no-repeat center center;
            width: 80px;
            height: 22px;
            background-size: 100% 100%;
        }

        /*
 *图片中的一条椭圆半透明背景
 *
 * */
        .imgyuan {
            width: 120px;
            height: 20px;
            border-radius: 12px;
            background-color: red;
            padding-left: 13px;
            margin-bottom: 5px;
            position: relative;
            top: 5px;
            background-color: rgba(1, 150, 0, 0.3);
        }

        font {
            border: 1px solid white;
            width: 11px;
            height: 11px;
            border-radius: 50%;
            margin-right: 9px;
            margin-top: 4px;
            display: block;
            float: left;
            background-color: white;
        }
    </style>

    <script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        var index = 0;//每张图片的下标，
        window.onload = function () {
            var start = setInterval(autoPlay, 3000);//开始轮播，每3秒换一张图
            document.getElementById('imgchangediv').onmouseover = function () {//当鼠标光标停在图片上，则停止轮播
                clearInterval(start);
            };
            document.getElementById('imgchangediv').onmouseout = function () {//当鼠标光标离开图片上，则开始轮播
                start = setInterval(autoPlay, 3000);
            };
            var lis = document.getElementById('imgyuan').getElementsByTagName('font');//得到所有圆圈
            //当移动到圆圈，则停滞对应的图片
            // var
            for (var i = 0; i < lis.length; i++) {
                funny(lis, i);
            }
        };

        //设置鼠标移出图片时的动作
        function funny(lis, i) {
            lis[i].onmouseover = function () {
                changeImg(i)
            }
        };

        //一轮过后，还是第二轮
        function autoPlay() {
            if (index > 4) {
                index = 0;
            }
            changeImg(index++);
        }

        //对应圆圈和图片同步
        function changeImg(index) {
            var list = document.getElementById('imgchangediv').getElementsByTagName('img');
            var list1 = document.getElementById('imgyuan').getElementsByTagName('font');
            for (var i = 0; i < list.length; i++) {
                list[i].style.display = 'none';
                list1[i].style.backgroundColor = 'white';
            }
            list[index].style.display = 'block';
            list1[index].style.backgroundColor = 'red';
        }
    </script>

    <script language="JavaScript" src="/jscript/AjaxRequest.js"></script>
    <script language="JavaScript">
        function onError() {
            alert("您的操作有误??????!");
        }

        function getInfo() {
            var name = document.getElementById('name').value;
            var password = document.getElementById('password').value;
            alert(name);
            if (name === "") {
                alert('请输入用户名!')
            } else if (password === "") {
                alert('请输入密码!');
            } else {
                //该构造函数内传递的方法都不能带(),否则会先执行一次传递的方法,使用onError()
                //时会先显示一次错误弹窗
                //当函数名后加上括号时，通常会执行函数体本身。如果函数有返回值时，此时会得到函数的返回值；
                //当函数名后不加括号时，其实质上是一个函数指针，只是用于找到函数体的位置，不会直接执行函数体；
                // 因此，如果时把函数作为参数进行值传递时，通常不需要加括号，只是把它当做一个函数指针；
                // 但是如果要进行函数调用的时候，
                // 由于是想要得到函数的返回值，因此必须要加上括号。
                var loader = new net.AjaxRequest('/login?name=' + name + '&password=' + password,
                    deal_getinfo, onError, "POST");

            }
        }

        //返回响应后的处理方法
        function deal_getinfo() {
            alert(this.req.responseText);
            // document.getElementById("toolTip").innerHTML = this.req.responseText;
            // //没有该句时不会显示内容
            // document.getElementById("toolTip").style.display = "block";
        }
    </script>
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
    <div style="width:1000px">
        <div class="sidebyside" style="width: 70%;" id="imgchangediv">
            <div style="margin: 20px;border: 1px solid #CCCCCC;padding: 5px">
                <img src="http://img.juzimi.com/juzimi/images/juzimib1_s1.jpg" style="display: block;" alt=""/>
                <img src="http://img.juzimi.com/juzimi/images/juzimib2_s1.jpg" style="display: none;" alt=""/>
                <img src="http://img.juzimi.com/juzimi/images/juzimib3_s1.jpg" style="display: none;" alt=""/>
                <img src="http://img.juzimi.com/juzimi/images/juzimib4_s1.jpg" style="display: none;" alt=""/>
                <img src="http://img.juzimi.com/juzimi/images/juzimib5_s1.jpg" style="display: none;" alt=""/>
                <div class="imgyuan" id="imgyuan">
                    <font style=" background-color: red;"></font>
                    <font></font>
                    <font></font>
                    <font></font>
                    <font></font>
                </div>
            </div>
            <div style="text-align: left;margin-left: 20px;">
               <span style="color: white;border-top-left-radius: 5px;border-top-right-radius: 5px;
               background-color: #FDB051;padding: 0px 10px 3px 10px">他们在分享</span>
            </div>
            <div style="border:1px solid #CCCCCC;margin: 0px 20px;height: 200px; ">

            </div>

            <div style="border:1px solid #CCCCCC;margin: 20px;height: 200px; ">

            </div>
            <div style="border:1px solid #CCCCCC;margin: 20px;height: 200px; ">

            </div>
            <div style="border:1px solid #CCCCCC;margin: 20px;height: 200px; ">

            </div>
            <div style="border:1px solid #CCCCCC;margin: 20px;height: 200px; ">

            </div>

        </div>

        <div class="sidebyside" style="width: 30%;height: 1000px;">
            <div style="text-align: center;margin: 10px;border: 1px solid #CCCCCC">
                <form action="/login" method="post">
                    <label class="loginstyle">邮箱账号: &nbsp; </label><input type="text" name="name" id="name"
                                                                          placeholder="请输入用户名邮箱"><br>
                    <label class="loginstyle">密码: &nbsp; </label><input type="password" name="password" id="password"
                                                                        placeholder="请输入密码">
                    <div style="margin-top: 10px;align-content: center;margin-bottom: 10px">
                        <label class="kuaisuzhuce">
                            <%--<input type="button" name="register" id="register" >--%>
                        </label>
                        &nbsp; &nbsp; &nbsp; &nbsp;
                        <label class="login" onclick="getInfo();"></label>
                        <%--<input type="submit" name="login" id="login" value="登陆">--%>
                    </div>
                </form>
            </div>
            <div style="border:1px solid #CCCCCC;margin: 10px;height: 1000px; ">

            </div>
        </div>
    </div>


    <%--<%--%>
    <%--out.println(session.getAttribute("sessionarg"));--%>
    <%--%>--%>
    <%--<a href="http://localhost:8080/html/hello.html">访问静态heml页面</a><br><br>--%>
    <%--<a href="/html/hello.html">访问静态heml页面,无主机地址</a>--%>
    <%--<form action="/index1" method="post">--%>
    \jsp\index.jsp
    <%--请输入用户名: <input type="text" id="name" name="name"><br>--%>
    <%--请输入密码:<input type="password" id="password" name="password"><br>--%>
    <%--请输入年龄: <input type="text" id="age" name="age"><br>--%>
    <%--<input type="submit" name="submit" value="提交">--%>
    <%--</form>--%>
</div>

</body>
</html>
