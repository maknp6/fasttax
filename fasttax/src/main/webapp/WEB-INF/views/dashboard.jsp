<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FastTax Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="dashboard.css">
</head>
<body>


<div class="bg">
<div class="bz">
<h1>Welcome to your FastTax ${taxpayer.firstName}!!!        Let's get started...</h1>
</div>
<br><br><br><br><br><br><br><br><br>

<div class="container"><div class="div1">
<form:form modelAttribute="taxpayer" action="dashboard" method="post">
  <h2>Select your filing status:</h2>
  <h3>
  <input type="hidden" name="userId" value="${taxpayer.userId}"/>
  <input type="hidden" name="firstName" value="${taxpayer.firstName}"/>
  <input type="hidden" name="lastName" value="${taxpayer.lastName}"/>
  <input type="hidden" name="ssn" value="${taxpayer.ssn}"/>
  <input type="hidden" name="email" value="${taxpayer.email}"/>
  <input type="hidden" name="streetAddress" value="${taxpayer.streetAddress}"/>
  <input type="hidden" name="password" value="${taxpayer.password}"/>
  <input type="hidden" name="city" value="${taxpayer.city}"/>
  <input type="hidden" name="state" value="${taxpayer.state}"/>
  <input type="hidden" name="zip" value="${taxpayer.zip}"/>
  <input type="radio" name="filingStatus" id="single" value="single"> Single<br>
  <input type="radio" name="filingStatus" id="mfj" value="mfj"> Married - Filing Jointly<br>
  <input type="radio" name="filingStatus" id="mfs" value="mfs"> Married - Filing Separately<br>
  <input type="radio" name="filingStatus" id="hoh" value="hoh"> Head of Household<br>
  <input type="radio" name="filingStatus" id="qw" value="qw"> Qualifying Widow(er)<br>
  <input type="submit" class="button" value="Next">
  </h3> </form:form>
</div>
</div>
</div>

</body>
</html>