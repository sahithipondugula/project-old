<%@page import="org.apache.taglibs.standard.tag.common.xml.ForEachTag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="model.Post"%>
			<%@page import="dao.PostDAOImpl"%>
		<%@page import="dao.PostDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
        crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Merriweather" rel="stylesheet">
    <style>
        h1 {
            font-family: 'Merriweather', serif;
            text-align: center;
        }
        .a {
            margin-top: 60px;
            color: azure;
           
        }
        .bg-img {
            background-image: url("image3.jpg");
            height: 100%;
            width: 100%;
            background-repeat: round;
            background-size: cover;
            position: absolute;
        }
        .b {
            font-size: 20px;
         float: left;
            color:black;
            font-weight:500;
        }
        .btn{
            background-color: aliceblue;
            color:black;
            font-size: 15px;
            font-weight:500;
        }
       
        
        
               
    </style>

<body>
    <div class="bg-img">
        <div class="a container">
            <h1>Posts</h1><br>
            <br>
          <%--  <%
       	List <Post> list = (List<Post>) request.getAttribute("list");
		for (Post post : list) {
		%> --%>
            <div class="card">

                <div class="b card-header">title</div>

                <br>
                <div class="b card-body">body</div>
            </div>
           <%--   <%
			}
		%> --%>
          
       



            <nav class="navbar navbar-expand-lg navbar-light bg-light">
   
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                    aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-item nav-link" style="font-weight: 500" href="EditPost.jsp">Edit </a>
                        <a class="nav-item nav-link" style="font-weight: 500" href="DeletePost.jsp">Delete</a>
                        <a class="nav-item nav-link" style="font-weight: 500" href="AddPost.jsp">Add</a>
                        <a class="nav-item nav-link" style="font-weight: 500" href="SearchPost.jsp">Search</a>
                        <a class="nav-item nav-link" style="font-weight: 500" href="AddComment.jsp">Comment</a>
                    </div>
                </div>
            </nav>
            <br>
            <br>
            <div class="btn">
             <a href="Home.jsp"class="logout"style="float:right">Home</a></button>
        </div>
    </div>
    </div>
</body>

</html>