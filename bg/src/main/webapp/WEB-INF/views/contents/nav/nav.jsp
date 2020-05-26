<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script>
// $(document).on('click', '#Btn_SignIn', function(e){
//     e.preventDefault();
//     location.href="${pageContext.request.contextPath}/login/sign";
// });

$(document).ready(function(){
  $("#Btn_SignIn").click(function(){    
    if($("#login_wrapper").width() == 0){      
        document.getElementById("login_wrapper").style.width = "250px";
    }else{
        document.getElementById("login_wrapper").style.width = "0px";
    }
  });
});
</script>

<style>
#login_wrapper{
    height:100%;
    width: 0px;
    right:10px;
    top:60px;
    position: fixed;
    display:block;
    overflow-x: hidden;
    z-index:1;
    background-color: white;
}

.btn_sign_left {
    float:left;
}

.btn_sign_right {
    float:right;
}
</style>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="${pageContext.request.contextPath}">BG.YU</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
       
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/menu/getMenuList?param=admin">관리자 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}">BLOG</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">CALENDAR</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/crawling/getCrawlingList">CRAWLING</a>
                </li>
                
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Dropdown
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
            </ul>
            
            <button class="btn btn-outline-success my-2 my-sm-0" id="Btn_SignIn">Sign In</button>
            
            <div id="login_wrapper">
                <form>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    <small id="emailHelp" class="form-text text-muted">설명글</small>
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                  </div>
                  <button type="submit" class="btn btn-primary btn_sign_left">회원가입</button>
                  <button type="submit" class="btn btn-primary btn_sign_right">로그인</button>
                </form>
            </div>
      </div>
</nav>