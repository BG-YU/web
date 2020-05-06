<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="col-lg-3">
  <div class="list-group">
    <c:forEach var="list" items="${menuList}">
        <a href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${list.cate_nm}" class="list-group-item">${list.cate_nm}</a>
    </c:forEach>
  </div>
</div>