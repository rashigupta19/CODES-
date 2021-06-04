<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>   
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Submitted Employee Information</h2>
    

   
    <table>
        <tr>
            <td>Name :</td>
            <td>${employee.name}</td>
        </tr>

        <tr>
            <td>Contact Number :</td>
            <td>${contactNumber}</td>
        </tr>
        
                </tr>
        <tr>
            <td>Email :</td>
            <td>${email}</td>
        </tr>
    </table>
</body>
</html>