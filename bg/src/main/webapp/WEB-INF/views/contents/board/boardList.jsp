<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
    $(document).on('click', '#Btn_WriteForm', function(e){
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
            <c:choose>
                <c:when test="${boardPaging.page_prev == 0}">
                    <li class="page-item disabled">
                        <a class="page-link" href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${cate_cd}&page=${boardPaging.page_prev}">Previous</a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li class="page-item">
                        <a class="page-link" href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${cate_cd}&page=${boardPaging.page_prev}">Previous</a>
                    </li>
                </c:otherwise>
            </c:choose>
            
            <c:forEach var="i" begin="${boardPaging.page_start}" end="${boardPaging.page_end}" step="1">
                <c:choose>
                    <c:when test="${i == boardPaging.page_current}">
                        <li class="page-item active">
                            <a class="page-link" href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${cate_cd}&page=${i}">${i}</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="page-item">
                            <a class="page-link" href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${cate_cd}&page=${i}">${i}</a>
                        </li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            
            <c:choose>
                <c:when test="${boardPaging.page_next >= boardPaging.board_row_cnt}">
                    <li class="page-item disabled">
                        <a class="page-link" href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${cate_cd}&page=${boardPaging.page_next}">Next</a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li class="page-item">
                        <a class="page-link" href="${pageContext.request.contextPath}/board/getBoardList?cate_cd=${cate_cd}&page=${boardPaging.page_next}">Next</a>
                    </li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
    
    <div style="float:right;">
        <button type="button" class="btn btn-primary" id="Btn_WriteForm">글쓰기</button>
    </div>
</div>