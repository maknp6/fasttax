<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FastTax Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="elements.css">
</head>
<body>


<div class="bg">
<div class="bz">
<h1>FastTax</h1>
<h1>Are you claiming any dependents ${taxpayer.firstName}? </h1>
</div>
<br><br><br><br><br><br><br>

<div class="container"><div class="div1">
<form:form modelAttribute="taxpayer" action="dashboard2" method="post">
  <h2 class="bz">Enter the number of dependants you are claiming:</h2>
  <h3 class="bz">
  - Who are related to you, fostered by you, or were adopted by you.<br>
  - Who were under the age of 19 or a full-time student and under age 24 at year-end.<br>
  - Who lived with you for more than half of the year.<br>
  - For whom you provided more than half of their support for the year.<br>
  - And who cannot be claimed as a dependent by someone else.<br><br>
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
  <input type="hidden" name="filingStatus" value="${taxpayer.filingStatus}"/>
  
 Select the number of dependents you are claiming:
<select name="dependents">
  <option value="0">0</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select><br>
<input type="submit" class="button" value="Next" style="float: right;">
</h3> 
</form:form>

</div>
</div>
</div>

</body>
</html>