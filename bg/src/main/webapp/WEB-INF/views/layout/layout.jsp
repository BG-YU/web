<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>


<!DOCTYPE html>
<html>
<head>
<tiles:insertAttribute name="header" />
<title>BG.YU</title>

<style>
.wrapper{
border: 1px solid #FFBB00;
width:1054px; 
padding: 10px; 
top: 10px;
left: 50%;
overflow: hidden;
width:79%;
}

.contents{
border: 1px solid #487BE1;
width:800px;
float: left;
padding: 10px;
}

.sidebar{
border: 1px solid #487BE1;
width:200px;
float: left;
padding: 10px;
margin-left: 10px;
}
</style>
    
</head>
<body>
    <div>
        <tiles:insertAttribute name="nav" />
    </div>
    <div class="wrapper">
        <div class="sidebar">
            <tiles:insertAttribute name="menu" />
        </div>
        <div class="contents">
            <tiles:insertAttribute name="body" />
        </div>
    </div>
    
    <footer class="py-5 bg-dark">
        <div>
            <tiles:insertAttribute name="footer" />
        </div>
    </footer>
</body>
</html>