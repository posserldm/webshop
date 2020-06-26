<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <style type="text/css">
        body{
            background-image: url(http://chuantu.xyz/t6/739/1593006509x1031866013.jpg);
            background-size: 100%;
        }
        .top{
            width: 350px;height: 66px;
            background-color: #000; opacity: 0.5;
            margin-left: 500px;
            margin-top: 180px;
        }
        .bottom{
            width: 350px;height: 180px;
            background-color: #FFFFFF; opacity: 0.5;
            margin-left: 500px;
        }
        p{
            color: white;
            font-size: 23px;
            text-align: center;
            position: relative;
            top: 20px;
        }
        .user{
            width: 350px;height: 30px;
            position: relative;
            top: 30px;
            text-align: center;
        }
        .password{
            width: 350px;height: 30px;
            position: relative;
            top: 40px;
            text-align: center;
        }
        .one{
            position: relative;
            top: 50px;
            text-align: center;
        }
        form {
            margin: 0 auto;
        }
    </style>
</head>

<body>
<div class="top">
    <p>登录</p>
</div>

<div class="bottom">
    <form action="login" method="post">
        <div class="user">
            用户&ensp;&ensp;<input type="text" name="username" /></div>
        <div class="password">
            密码&ensp;&ensp;<input type="password" name="password" /></div>
        <div class="one">
            <input type="submit" name="login" id="button" value="登陆" />
            <input type="button"name="register" id="button3" value="注册" style="margin-left: 10px;"/>
        </div>
    </form>

</div>

</body>
</html>