<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/11/30
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spider Manager</title>
    <link rel="stylesheet" href="/plugin/layui/css/layui.css">
    <script type="application/javascript" src="/plugin/layui/layui.js"></script>
    <script type="application/javascript" src="/js/spiderManagerEntrance.js"></script>

</head>
<body>

<script type="text/html" id="spider-option">

</script>


<div style="width: 1000px;height:450px;margin:100px auto">
    <div class=" layui-tab layui-tab-card"  lay-filter="main">
        <ul class="layui-tab-title">
            <li class="layui-this">网站设置</li>
            <li>用户管理</li>
            <li>权限分配</li>
            <li>商品管理</li>
            <li>订单管理</li>
        </ul>
        <div class="layui-tab-content" style="height: 370px;">
            <div class="layui-tab-item layui-show">
                <table class="table-content0" lay-filter="table-content0"></table>
            </div>
            <div class="layui-tab-item">
                <table class="table-content1" lay-filter="table-content1"></table>
            </div>
            <div class="layui-tab-item">
                <table class="table-content2" lay-filter="table-content2"></table>
            </div>
            <div class="layui-tab-item">
                <table class="table-content3" lay-filter="table-content3"></table>
            </div>
            <div class="layui-tab-item">
                <table class="table-content4" lay-filter="table-content4"></table>
            </div>
        </div>
    </div>
</div>

</body>
</html>
