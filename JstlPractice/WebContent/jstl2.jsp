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

<!-- ��� : ���� -->

<c:set var="kbs" value="moon"/>

<c:if test="${kbs == 'star' }">
  if test : kbs ���� <c:out value="${kbs }"/> <!-- ���ǿ� ���� �� �� ��µȴ�. -->
</c:if>
<br>

<c:if test="${kbs eq 'moon' }">
  if test : ��
</c:if>


<p>
<!--  choose �� ��� (if ~ else�� choose�� ǥ��)<br> -->

<c:choose>
     <c:when test="${kbs == 'star'}">��</c:when>
     
     <c:when test="${kbs == 'moon' }">��</c:when>

     <c:otherwise>� ���ǵ� �ƴ� ���</c:otherwise>

</c:choose>

<br>

<c:choose>

   <c:when test="${empty param.name }">
   <form>
   
     �̸�:<input type="text" name="name">
      
       <input type="submit" value="Ȯ��">
   
   </form>
   
   </c:when>
   
   <c:when test="${param.name == 'admin' }">
       
        ������ �۾�
       
   </c:when>
   
   <c:when test="${param.name eq 'user' }">
   
      �Ϲ� �����. ȸ��<c:out value="${param.name }"></c:out>
     
   </c:when>
    
       <c:otherwise>
       
              ��Ÿ �۾�
         
       </c:otherwise>
    
</c:choose>

</p>

</body>
</html>