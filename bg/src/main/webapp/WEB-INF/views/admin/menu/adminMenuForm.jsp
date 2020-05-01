<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>

<script>
    $(document).on('click', '#btnSave', function(e){
        e.preventDefault();
        $("#form").submit();
    });
</script>

<div>
    <form:form name="form" id="form" role="form" modelAttribute="menuVO" method="post" action="${pageContext.request.contextPath}/menu/insertMenuList">
        <div>
            <div class="list_group">
                <label for="title">메뉴 목록</label>
                <a href="#" class="list-group-item list-group-item action">신규</a> 
                <c:forEach var="list" items="${nomalMenuList}">
                    <a href="#" class="list-group-item list-group-item action">${list.cate_nm}</a> 
                </c:forEach>
            </div>
        </div>
        <div>
            <form:input path="cate_nm" />
        </div>
        
    </form:form>
    <div>
        <button type="button" class="btn btn-sm btn-primary" id="btnSave">저장</button>
        <button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
    </div>
</div>