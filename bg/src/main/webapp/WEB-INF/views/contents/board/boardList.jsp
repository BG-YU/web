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
    
    $(document).ready(function(){
        if ( '${mode}' == 'main'){
            $("#board_footer").hide();
        }
    });
    
</script>

<div>
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
</div>

<div id="board_footer">
    <div style="float:left;">
        
        <ul class="pagination">
                <li class="page-item disabled">
                    <span class="page-link">Previous</span>
                </li>
                <c:forEach var="i" begin="1" end="${boardCnt.board_cnt}" step="1">
	                <li class="page-item">
	                    <a class="page-link" href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${cate_cd}&page=${i}">${i}</a>
	                </li>
                </c:forEach>
                
<!--                 <li class="page-item active" aria-current="page"> -->
<!--                     <span class="page-link">2<span class="sr-only">(current)</span></span> -->
<!--                 </li> -->
<%--                 <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${cate_cd}&page=3">3</a></li> --%>
                <li class="page-item">
                    <a class="page-link" href="#">Next</a>
                </li>
            </ul>
    </div>
    
    <div style="float:right;">
        <button type="button" class="btn btn-primary" id="btnWriteForm">글쓰기</button>
    </div>
</div>