<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>		
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.error {
	color: red
}
</style>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body background="<c:url value='/resources/images/bg.png' />">

<h2>${welcome_msg}</h2>
<hr />
<a id="en" href="/CustomerMVC1/init?lang=en">English</a> | <a id="fr" href="/CustomerMVC1/init?lang=fr">French</a>
<div>&nbsp;</div>
<div id="welcome_text">
<h4><spring:message code="welcome.message"/></h4>
</div>
	<div>
		<form:form action="processform" modelAttribute="employee" method="get">
			<h2 class="text-warning text-center pt-5">REGISTRATION PAGE</h2>
			<form:label path="name" />
			<form:input path="name" placeholder="FIRSTNAME" />
			<form:errors path="name" cssClass="error" />

			<div class="line-box">
				<div class="line"></div>
			</div>

			<form:label path="Lname">
				<span class="required"></span>
			</form:label>
			<form:input path="Lname" placeholder="LASTNAME" />
			<form:errors path="Lname" cssClass="error" />
			
			<div class="line-box">
				<div class="line"></div>
			</div>
			<form:label path="contactNumber" />
			<form:input path="contactNumber" placeholder="CONTACT NO." />
			<form:errors path="contactNumber" cssClass="error" />

			<div class="line-box">
				<div class="line"></div>
			</div>

			<form:label path="email" />
			<form:input path="email" placeholder="EMAIL" />
			<form:errors path="email" cssClass="error" />

			<div class="line-box">
				<div class="line"></div>

			</div>

			<form:label path="courseCode" />
			<form:input path="courseCode" placeholder="COUSRE CODE" />
			<form:errors path="courseCode" cssClass="error" />

			<div class="line-box">
				<div class="line"></div>
			</div>

			<form:label path="password" />
			<form:password path="password" placeholder="PASSWORD" />
			<form:errors path="password" cssClass="error" />

			<div class="line-box">
				<div class="line"></div>
			</div>

			<form:label path="country" />
			<form:select path="country">
				<form:option value="COUNTRY" label="COUNTRY" />
				<form:option value="India" label="India" />
				<form:option value="Australia" label="Australia" />
				<form:option value="India" label="US" />
				<form:option value="Australia" label="England" />
				<form:errors path="country" cssClass="error" />
			</form:select>

			<div class="line-box">
				<div class="line"></div>
			</div>
			<form:button type="submit">SUBMIT</form:button>
		</form:form>
		<%-- 	<img src="<c:url value="/resources/images/aaaaaaaaaa (3).png" />"
		alt="image" /> --%>

	</div>

</body>
</html>