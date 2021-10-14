<%--
  Created by IntelliJ IDEA.
  User: guillaume.chebib
  Date: 12/10/2021
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <a href="registration">Register</a>
</head>
<body>
<h2> User : </h2>
<ul>
    <li id="user"></li>
</ul>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
    jQuery.ajax({
        url:"http://localhost:8080/TP_SpringMVC/user",
        type:'GET',
        success: function(data){
            console.log(data)
            document.getElementById("user").innerText = data.prenom + " " + data.nom + " " + data.age
        }
    });
</script>
</html>
