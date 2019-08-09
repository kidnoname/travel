<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--&lt;%&ndash;    <h1>trang home</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <h1>${model}</h1>>&ndash;%&gt;--%>
<%--&lt;%&ndash;<c:forEach items="${names}" var="item">&ndash;%&gt;--%>
<%--&lt;%&ndash;<h1>{item.id}</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;</c:forEach>&ndash;%&gt;--%>
<%--<a href="/web/1">--%>
<%--di den trang web--%>
<%--//item: list tra ra tu sever, var: tuong ung kieu dl va ten bien--%>
<%--<c:forEach items="${models}" var="model">--%>
<%--    <a href="/web/${model.id}">--%>
<%--        ${model.name}--%>
<%--    </a>--%>
<%--</c:forEach>--%>
<%--</a>--%>
<form action="/admin/home" method="get">
    <input type="text" placeholder="ten dang nhap" name="userName">
    <button type="submit">an vao de thuc hien action</button>
</form>
</html>
