<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FastTax Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="components.css">
</head>
<body>

<div class="bg">
<div class="bz">
<h1>FastTax</h1>
<h1>Alright ${taxpayer.firstName}, let's work on your income.</h1>
</div>
<br><br><br><br><br><br><br>

<div class="container1"><div class="div1">
<form:form modelAttribute="taxpayer" action="dashboard3" method="post">
  <h2 class="bz">Select the tax form, i.e. the type of income you would like to add to your return.:</h2>
  
<div class="dropdown1">  
<select name="dependents">
<option value="0">-------Select an Income Category-------</option>
  <option value="0">W2 - Wages and Salaries</option>
  <option value="1">1099-INT - Interest Income</option>
  <option value="2">1099-DIV - Dividend Income</option>
  <option value="3">1099-MISC - Miscellaneous Income</option>
  <option value="4">1099-B - Proceeds from Broker Transactions</option>
  <option value="5">1099-G - Certain Government Payments</option>
  <option value="5">SSA-1099 - Social Security Benefits</option>
  <option value="5">1099-K - Merchant Card & 3rd Party Network Payments</option>
  <option value="5">1099-PATR - Taxable Distributions From Cooperatives</option>
  <option value="5">1099-R - Distributions From Pensions, Annuities, Retirement, IRAs</option>
  <option value="5">1099-SA - Distributions From an HSA</option>  
</select></div>


<input type="submit" class="button" value="Add form" style="float: right;">


</form:form>

</div>
</div>
</div>

</body>
</html>