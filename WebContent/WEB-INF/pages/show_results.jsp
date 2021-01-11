<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="color:blue;text-align:center">All ${operation } INFO</h1>
<<c:choose>
	<c:when test="${listInfo ne null && !empty listInfo }">
		<table align="center" bgcolor="blue">
		<c:forEach var="country" items="${listInfo }">
			<tr>
				<td style="color">${country }</td>
			</tr>
		</c:forEach>
		</table>
		<b>countries count::${countriesCount }</b>
	</c:when>
	<c:otherwise>
		<h1>Countries Not Found</h1>
	</c:otherwise>
</c:choose>
<br>
<br>
<a href="welcome">HOME</a>
