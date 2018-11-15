<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL PRACTICE</title>
</head>
<body>
<h2>JSTL TEST</h2>
<!-- 자바 객체는 value에 다 들어 올 수 있다. ex) request, page, session, application -->
<c:set var="ir" value="홍길동" scope="page" />
<c:out value="${ir }"/>
<br><hr> <!--  절 취 선     -->
<c:set var="ir2" scope="session">
한국인
</c:set>
<c:out value="${ir2 }"/>
<br><hr>  <!--  절 취 선      -->
<c:set var="aa" value="${header['User-Agent'] }" scope="page"/>
USER-AGENT 값은 : <c:out value="${aa }"></c:out>
<br><hr>  <!--  절 취 선      -->
<c:remove var="aa" scope="page"/>
aa 삭제 후 값은 >> [<c:out value="${aa }"/>] >> 변수값이 삭제 됨
<br><hr>  <!--  절 취 선      -->
<c:set var="su1" value="10" />
<c:set var="su2" value="${20}" />
<c:set var="su3">
30.5
</c:set>

합은 ${su1 + su2 + su3 } <br>


</body>
</html>