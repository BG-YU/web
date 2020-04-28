<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>


<!DOCTYPE html>
<html>
<head>
    <tiles:insertAttribute name="header" />
    <title>BG.YU</title>
</head>
<body>
    <div>
        <tiles:insertAttribute name="nav" />
    </div>
    <div>
        <div class="row">
            <tiles:insertAttribute name="menu" />
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