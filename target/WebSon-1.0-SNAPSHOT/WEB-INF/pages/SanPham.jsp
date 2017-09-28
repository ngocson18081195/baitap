<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 22/04/2017
  Time: 11:19 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tạo Sản Phẩm</title>
</head>
<body>
    <form:form modelAttribute="sp" method="post" action="SanPham">
        <table>
            <tr>
                <td><c:if test="${not empty sp.masp}">
                    <form:hidden path="masp"/>
                    ${sp.masp}
                </c:if> </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
