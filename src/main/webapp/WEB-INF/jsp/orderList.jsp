<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <style type="text/css">
        .div1{
            width: 100%;height: 30px;
            background-color: black; opacity: 0.8;
        }
        .div2{
            width: 70%;height: 930px;
            background-color: white;
            margin-left: 15%;
        }
        .div2-1{
            width: 100%;height: 40px;
            background-color: white;
            position: relative;
            top: 10px;
        }
        .pro{
            width: 45%;height: 40px;
            border-right: 1px solid #000000;
        }
        .price{
            width: 10%;height: 40px;
            border-right: 1px solid #000000;
        }
        .quty{
            width: 10%;height: 40px;
            border-right: 1px solid #000000;
        }
        .condition{
            width: 10%;height: 40px;
            border-right: 1px solid #000000;
        }
        .pay{
            width: 10%;height: 40px;
            border-right: 1px solid #000000;
        }
        .operate{
            width: 15%;height: 40px;
        }
        .time{
            text-align: -moz-left;
            font-size: 12px;
        }
        .orderID{
            font-size: 12px;
        }
        a{
            text-decoration: none;
        }
        ul{
            list-style: none;
        }
        .one {
            border-color: darkgray;opacity: 0.5;

            border-bottom: 1px solid #000000;
            border-top: 1px solid #000000;
        }
        .td1{
            border-right: 1px solid #000000;
        }
        .td2{
            border-right: 1px solid #000000;
        }
        .td3{
            border-right: 1px solid #000000;
        }
        .td4{
            border-right: 1px solid #000000;
        }
        .td5{
            border-right: 1px solid #000000;
        }
        td {
            color: gray;
            line-height: 1em;
        }

    </style>
</head>
<body>
<div class="div1">
    <img src="images/3.jpg" style="width: 20px; height: 20px; margin-left: 75%;" align="center">
    <span style="color: #FFFFFF;">&nbsp;${ sessionScope.user.username }</span>&ensp;&ensp;&ensp;
</div>

<div class="div2">
    <h2 style="position: relative; top: 15px;">我的订单</h2><hr >

    <div class="div2-1">
        <table border="0" style="margin-top: 10px; width: 100%; background-color: antiquewhite; opacity: 0.5;">
            <tr>
                <th class="pro">商品</th>
                <th class="price">单价/元</th>
                <th class="quty">数量</th>
                <th class="condition">状态</th>
                <th class="pay">实付款/元</th>
                <th class="operate">订单状态及操作</th>
            </tr>
        </table>
    </div>
    <c:forEach var="order" items="${sessionScope.orders}">
    <div class="div2.2" style="margin-top: 20px;">
        <span class="time">
            <fmt:formatDate value="${order.times}" pattern="yyyy年MM月dd日 HH:mm:ss" />
        </span>
        <span class="orderID">订单号： <a href="#">${ order.orderId } </a></span>
    </div>

    <div class="div2.3">
        <ul>
            <li>
                <table border="0" style="width: 100%;"  class="one">
                    <tr>
                        <td style="width: 41%;" class="td1">
                            <img src="${ order.image }" style="height: 90px; width: 70px;" />
                            <span style="position: relative;bottom: 40px;">${order.goodsName}</span></td>
                        <td style="width: 10%;" class="td2">
                            <span style="position: relative;left: 30px;">${order.goodPrice}</span></td>
                        <td style="width: 10%;" class="td3">
                            <span style="position: relative;left: 30px;">${order.goodsNumber}</span></td>
                        <td style="width: 10%;" class="td4">
                            <span style="position: relative;left: 30px;">
                                <c:choose>
                                    <c:when test="${order.state == 1}">已付款</c:when>
                                    <c:when test="${order.state == 2}">已发货</c:when>
                                    <c:when test="${order.state == 3}">已签收</c:when>
                                    <c:when test="${order.state == 4}">已完成</c:when>
                                </c:choose>
                            </span></td>
                        <td style="width: 10%;" class="td5">
                            <span style="position: relative;left: 20px;">${order.cost}</span></td>
                        <td style="width: 15%; color: blue; text-align: center;">
                            <span>
                                <a href="<c:url value="/deleteOrder"><c:param name="orderId" value="${order.orderId}" /></c:url>">删除</a>
                            </span>
                        </td>
                    </tr>
                </table>
            </li>
        </ul>
    </div>
    </c:forEach>
</div>
</body>
</html>
