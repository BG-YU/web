<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>

<meta name = "google-signin-client_id"content = "234920462488-e8ntkt5ji1nvlt4hn618b9049h1pmm47.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script>
    function onSignIn(googleUser) {
        // Useful data for your client-side scripts:
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());

        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
    };
</script>


<style>
#wrapper{
border: solid 1px gray;
position: absolute;
top:50%;
left:50%;
margin-left:-150px;
margin-top:-200px;
width: 300px;
height: 400px; 
}
</style>

<div id="wrapper">
    <div>
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
	      <button type="submit" class="btn btn-primary">Submit</button>
	    </form>
    </div>
    <div class="g-signin2" data-onsuccess="onSignIn"></div>
</div>
