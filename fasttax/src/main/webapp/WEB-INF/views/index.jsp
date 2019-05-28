<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="index.css">
<title>FastTax</title>
</head>
<body>

<div class="bg">
<div class="bz">
<h1>Welcome to FastTax</h1>

<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Login</button>

<button onclick="document.getElementById('id02').style.display='block'" style="width:auto;">Create Profile</button>
</div>

<div id="id01" class="modal">
  
  <form:form class="modal-content animate" modelAttribute="taxpayer" action="FilingStatus" method="POST"> 
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="money.jpeg" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="email" required>
		<br></br>
      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>
        <br></br>
      <button type="submit">Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form:form>
</div>


<script>
// Get the modal
var modal = document.getElementById('id01');

var modal = document.getElementById('id02');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>


<div id="id02" class="modal">
  
  <form:form class="modal-content animate"  modelAttribute="taxpayer" action="login" method="POST"> 
      <div class="imgcontainer">
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="money.jpeg" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="firstname"><b>First Name</b></label>
      <input type="text" placeholder="First Name" id="inputfirstname" name="firstName" required>
		<br></br>		
      <label for="lastname"><b>Last Name</b></label>
      <input type="text" placeholder="Last Name" id="inputlastname" name="lastName" required>
		<br></br>		
      <label for="email"><b>email</b></label>
      <input type="text" placeholder="email" id="inputemail" name="email" required>
		<br></br>		
		<label for="password"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" id="inputpassword" name="password" required>
        <br></br>		
      <label for="confirmpassword"><b>Password</b></label>
      <input type="password" placeholder="Confirm Password" id="inputconfirmpassword" name="confirmpassword" required>
        <br></br>        
       <label for="ssn"><b>Social Security Number</b></label>
      <input type="text" placeholder="SSN" id="inputssn" name="ssn" required>
		<br></br>		
      <label for="streetaddress"><b>Street Address</b></label>
      <input type="text" placeholder="streetaddress" id="inputstreetaddress" name="streetAddress" required>
		<br></br>		
      <label for="city"><b>City</b></label>
      <input type="text" placeholder="city" id="inputcity" name="city" required>
		<br></br>		 
       <label for="state"><b>State</b></label>
      <input type="text" placeholder="state" id="inputstate" name="state" required>
		<br></br> 
		 <label for="zipcode"><b>Zip Code</b></label>
      <input type="text" placeholder="zipcode" id="inputzip" name="zip" required>
		<br></br>       
        
      <button type="submit">Create my Profile</button>
      <label>        
        <input type="checkbox" checked="checked" id="testID" name="remember"> Remember me
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form:form>
</div>
</div>

<script>
// Get the modal
var modal = document.getElementById('id01');

var modal = document.getElementById('id02');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>

</body>
</html>