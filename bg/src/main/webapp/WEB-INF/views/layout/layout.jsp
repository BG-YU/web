<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
<tiles:insertAttribute name="header" />
<title>BG.YU</title>

<style>
#header {
position: fixed;
width: 100%;
z-index: 9;
}

#wrapper {
/* border: 1px solid #FFBB00;  */
padding: 10px; 
top: 10px;
}

#contents {
/* border: 1px solid #487BE1; */
width:1000px;
float: left;
padding: 10px;
margin-top: 50px;
margin-left: 400px;
}

#sidebar {
/* border: 1px solid #487BE1; */
width:400px;
float: left;
padding: 10px;
margin-right: 10px;
margin-top: 50px;
position: fixed;
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