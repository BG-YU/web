<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>


<!DOCTYPE html>
<html>
<head>
<tiles:insertAttribute name="header" />
<title>BG.YU</title>

<style>


#wrapper{
border: 1px solid #FFBB00;
width:1054px; 
padding: 10px; 
top: 10px;
left: 50%;
overflow: hidden;
width:100%;
}

#contents{
border: 1px solid #487BE1;
width:800px;
float: left;
padding: 10px;
width:78%;
}

#sidebar{
border: 1px solid #487BE1;
width:20%;
float: left;
padding: 10px;
margin-right: 10px;

}
</style>
    
</head>
<body>
    <div id="header">
        <tiles:insertAttribute name="nav" />
    </div>
    <div id="wrapper">
        <div id="sidebar">
            <tiles:insertAttribute name="menu" />
        </div>
        <div id="contents">
            <tiles:insertAttribute name="body" />
        </div>
    </div>
    
    <footer>
        <div>
            <tiles:insertAttribute name="footer" />
        </div>
    </footer>
</body>
</html>