<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL PRACTICE</title>
</head>
<body>

<!-- 제어문 : 조건 -->

<c:set var="kbs" value="moon"/>

<c:if test="${kbs == 'star' }">
  if test : kbs 값은 <c:out value="${kbs }"/> <!-- 조건에 부합 될 시 출력된다. -->
</c:if>
<br>

<c:if test="${kbs eq 'moon' }">
  if test : 달
</c:if>


<p>
<!--  choose 문 사용 (if ~ else는 choose로 표현)<br> -->

<c:choose>
     <c:when test="${kbs == 'star'}">별</c:when>
     
     <c:when test="${kbs == 'moon' }">달</c:when>

     <c:otherwise>어떤 조건도 아닌 경우</c:otherwise>

</c:choose>

<br>

<c:choose>

   <c:when test="${empty param.name }">
   <form>
   
     이름:<input type="text" name="name">
      
       <input type="submit" value="확인">
   
   </form>
   
   </c:when>
   
   <c:when test="${param.name == 'admin' }">
       
        관리자 작업
       
   </c:when>
   
   <c:when test="${param.name eq 'user' }">
   
      일반 사용자. 회원<c:out value="${param.name }"></c:out>
     
   </c:when>
    
       <c:otherwise>
       
              기타 작업
         
       </c:otherwise>
    
</c:choose>

</p>

</body>
</html>