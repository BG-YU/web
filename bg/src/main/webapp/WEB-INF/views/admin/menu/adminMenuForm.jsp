<%@page import="com.bg.web.model.MenuVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script>
    $(document).on('click', '#btnSave', function(e){
        e.preventDefault();
        $("#form").submit();
    });
</script>

<style>
.flex_container {
    display:flex;
}
</style>

<div class="flex_container">
    <div>
        <div class="list_group">
            <a href="#" class="list-group-item list-group-item action">신규</a> 
            <c:forEach var="list" items="${nomalMenuList}">
                <a href="#" class="list-group-item list-group-item action">${list.cate_nm}</a> 
            </c:forEach>
        </div>
    </div>
    
    <form name="form" id="form" method="post" action="${pageContext.request.contextPath}/menu/insertMenuList">
        <div>
            <label for="cate_nm">메뉴명</label>
            <input id="cate_nm" name="cate_nm"/>
        </div>
        <div>
            <button type="button" class="btn btn-sm btn-primary" id="btnSave">저장</button>
        </div>
    </form>
</div>