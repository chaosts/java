<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���, �ݺ���</title>
</head>
<body>

	<h2>��� , �ݺ���</h2>

	<c:forEach var="i" begin="1" end="10" step="1">

		<c:out value="${i }" /> &nbsp;&nbsp;

</c:forEach>
	<br>
	<hr>

	<c:forEach var="i" begin="1" end="9" step="1">

    3 * ${i } = ${3 * i }<br>

	</c:forEach>

	<p />

	forEach ��� (header:���尴ü(k,v)):
	<br>

	<c:forEach var="h" items="${headerValues }">
		<!-- ������� ���� -->

    �Ӽ� : <c:out value="${h.key }" />&nbsp;&nbsp;
    
     �� :  <c:forEach var="k" items="${h.value }">

			<c:out value="${k}"></c:out>

		</c:forEach>

		<hr>

	</c:forEach>

	<br>
	<br>

	<%
		HashMap map = new HashMap();

		map.put("name", "ȫ�浿");

		map.put("today", new Date());
	%>


  <c:set var="arr" value="<%= new int[]{1,2,3,4,5} %>"/>

  <c:set var="m" value="<%=map %>"/>

  �迭 ���<br>

 <c:forEach var="i" items="${arr }" begin="0" end="5" step="1">
 
 ${i } &nbsp;&nbsp;
 
 </c:forEach>
  
 <br>
 
 map ���<br> 

 <c:forEach var="i" items="${m }">
 
     ${i.key }:${i.value }<br>
 
 </c:forEach>

</body>
</html>