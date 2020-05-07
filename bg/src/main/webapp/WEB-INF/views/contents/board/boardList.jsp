<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
    $(document).on('click', '#btnWriteForm', function(e){
        e.preventDefault();
        location.href = "${pageContext.request.contextPath}/board/boardForm";
    });
    
    function fn_contentView(bid){
        var url = "${pageContext.request.contextPath}/board/getBoardContent";
        url = url + "?bid="+bid;
        location.href = url;
    }
</script>

<c:forEach var="list" items="${boardList}">
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">
                <a href="#" onClick="fn_contentView(<c:out value="${list.bid}"/>)">${list.title}</a>
            </h5>
            <p class="card-text">${list.content}</p>
            <a href="#" onClick="fn_contentView(<c:out value="${list.bid}"/>)" class="btn btn-primary">더보기</a>
        </div>
    </div>
</c:forEach>

<div>
    <button type="button" class="btn btn-primary" id="btnWriteForm" >글쓰기</button>
</div>