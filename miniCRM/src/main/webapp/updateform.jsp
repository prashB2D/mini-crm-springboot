<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
<link type=text/css rel="stylesheet" href="./style.css">
<link type=text/css rel="stylesheet" href="./add-customer-style.css">
</head>
<body>
    <div id="wrapper">
    	<div id="header">
    			<h1>CRM APP Update form</h1>
    	</div>
    </div>
    
    <form:form action="register-cx" modelAttribute="customer">
      <table>
          <form:hidden path="Cid"/>
          <tr>
          <th>Customer  Name</th>
          <td><form:input path="Cname" /></td>
          </tr>
              <tr>
          <th>Customer Age</th>
          <td><form:input path="Cage" /></td>
          </tr>
              <tr>
          <th>Customer City</th>
          <td><form:input path="Ccity" /></td>
          </tr>
          
                <tr>
          
          <td><input type="submit" value="Update"/></td>
          </tr>
      </table>
  </form:form>
</body>
</html>