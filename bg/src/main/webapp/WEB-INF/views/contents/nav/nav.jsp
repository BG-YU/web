<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script>
// $(document).on('click', '#Btn_SignIn', function(e){
//     e.preventDefault();
//     location.href="${pageContext.request.contextPath}/login/sign";
// });

$(document).ready(function(){
    $(".slideBtn").click(function(){    
        if($("#sidenav").width() == 0){      
            document.getElementById("sidenav").style.width = "350px";
            document.getElementById("navbarSupportedContent").style.paddingRight = "350px";
            document.getElementById("slidebtn").style.paddingRight = "350px";
            document.getElementById("Btn_SignIn").style.paddingRight = "350px";
            
        }else{
            document.getElementById("sidenav").style.width = "0";
            document.getElementById("navbarSupportedContent").style.paddingRight = "0";
            document.getElementById("slidebtn").style.paddingRight = "0";
            document.getElementById("Btn_SignIn").style.paddingRight = "0";
        }
    });
});

</script>

<style>
.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  right: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 10px;
  opacity: 0.5;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s;
}

.slideBtn {
  transition: .5s;
  position: fixed;
  right: 0;  
  font-size:30px;
  cursor:pointer;
  margin-right:10px;
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
                    <a class="nav-link" href="#">BLOG</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">CALENDAR</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">CRAWLING</a>
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
            
<!--             <div class="btn btn-primary" id="Btn_SignIn">Sign In</div> -->
            <div id="sidenav" class="sidenav">
                <div id="slidebtn" class="slideBtn">&#9776; Sign In</div>  
                <a href="#">menu1</a>
                <a href="#">menu2</a>
                <a href="#">menu3</a>
                <a href="#">menu4</a>
            </div>
        </div>
</nav>