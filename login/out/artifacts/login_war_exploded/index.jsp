<%--
  Created by IntelliJ IDEA.
  User: 39598
  Date: 2018/6/2
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <meta charset="utf-8">
    <!--使用最新的浏览器内核来解析当前的HTML5页面-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--视口：指定网页打开时默认的宽度，初始缩放比是1：1。视口其实就是一个网页的容器-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>登录界面</title>
    <!-- 1. 导入bootstrap的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--2. 导入jquery框架 -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <!-- 3. 导入bootstrap的js插件 -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<!--登录界面-->
<div id="login">
    <form class="form-horizontal" action="/aaa/loginServlet" method="post">
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">UserName</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="username" placeholder="UserName" name="username">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="password" placeholder="Password" name="password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label>
                        <input type="checkbox"> Remember me
                    </label>
                    <%--登录信息反馈--%>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <span id="loginInfo"><%=request.getAttribute("loginInfo")==null?"":request.getAttribute("loginInfo")%></span>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Sign in</button>
            </div>
        </div>
    </form>
</div>

</body>


<style type="text/css">
    #login {
        width: 500px;
        height: 210px;
        border: 1px lightgrey solid;
        margin: auto;
        margin-top: 100px;
        border-radius: 5px;
        padding-top: 20px;
        padding-left: 15px;
        padding-right: 15px;
        padding-bottom: 20px;
    }

    #loginInfo{
        font-size: 14px;
        color: #c12e2a;
    }
</style>
</html>
