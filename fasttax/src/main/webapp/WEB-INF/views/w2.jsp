<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FastTax Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="W2.css">
</head>
<body>

<div class="bg">
<div class="bz">
<h1>FastTax</h1>
<h1>Alright ${taxpayer.firstName}, This is the w2 form.</h1>
</div>

<div class="container1"><div class="div1">



    <form:form modelAttribute="W2" action="dashboard4" method="post"> 
    <input type="hidden" name="userId" value="${taxpayer.userId}">
    
    <table style="width:96%; heigth:96%"> 
    
    <tr>   
       <td colspan="4"> <input type="text" placeholder="22222" name=""></td>  
       <td colspan="5"> <input type="text" name="ssn" value="${taxpayer.ssn}" required></td> 
       <td colspan="10"><input type="text" placeholder="OMB No. 1545-0008" name=""></td>     
    </tr>    
      
     <tr>   
       <td colspan="11"> <input type="text" placeholder="Employer identification number (EIN)" name="empEIN" required></td>  
       <td colspan="4"> <input type="text" placeholder="1. Wages, tips, other compensation" name="box1" required></td> 
       <td colspan="4"><input type="text" placeholder="2. Federal income tax withheld" name="box2" required></td>     
    </tr>
        
    <tr> 
      <td colspan="11" rowspan="3" >    <table>
   				 <tr><td colspan="4"> <input type="text" placeholder="Employer's Name" name="empName" required></td></tr>
   				 <tr><td colspan="4"> <input type="text" placeholder="Address" name="empStreetAddress" required></td></tr>
   				 <tr><td colspan="4"> <input type="text" placeholder="City" name="empCity" required></td>  <td><input type="text" placeholder="State" name="empState" required></td>   <td><input type="text" placeholder="Zip" name="empZip" required></td></tr>
    			</table></td> 
      <td colspan="4"> <input type="text" placeholder="3. social security wages" name="box3" required></td>
      <td colspan="4"><input type="text" placeholder="4. social security tax withheld" name="box4" required></td>     
    </tr>   
       
      <tr>          
       <td colspan="4"> <input type="text" placeholder="5. Medicare wages and tips" name="box5" required></td>
       <td colspan="4"> <input type="text" placeholder="6. Medicare tax withheld" name="box6" required></td>          
    </tr>    
    
    <tr>          
       <td colspan="4"> <input type="text" placeholder="7. Social security tips" name="box7"></td>
       <td colspan="4"> <input type="text" placeholder="8. Allocated tips" name="box8"></td>          
    </tr>
    
    <tr>          
       <td colspan="11"> <input type="text" placeholder="d. Control Number" name=""></td>
       <td colspan="4"> <input type="text" placeholder="Box 9" name="box9"></td> 
       <td colspan="4"> <input type="text" placeholder="Dependent care benefits" name="box10"></td>          
    </tr>
    
     <tr> 
      <td colspan="11" rowspan="4" colspan="2"> 
      			<table>
   				 <tr><td colspan="4"> <input type="text" value="${taxpayer.firstName}" name="firstName" required></td><td><input type="text" placeholder="Last Name" value="${taxpayer.lastName}" name= "lastName" required></td></tr>
   				 <tr><td colspan="4"> <input type="text" placeholder="Address" value="${taxpayer.streetAddress}" name="streetAddress" required></td></tr>
   				 <tr><td colspan="4"> <input type="text" placeholder="City" value="${taxpayer.city}" name="city" required></td>  <td><input type="text" placeholder="State" value="${taxpayer.state}" name="state" required></td>   <td><input type="text" placeholder="Zip" value="${taxpayer.zip}" name="zip" required></td></tr>
    			</table>      
      </td>  
      
      
      
      <td colspan="4"><input type="text" placeholder="Nonqualified plans" name="box11"></td>
      <td colspan="1"><input type="text" placeholder="12a" name="code12A" value="0"></td>
      <td colspan="3"><input type="text" placeholder="0.00" name="box12A" value="0"></td>     
    </tr>
    
    <tr>         
      <td colspan="4">
      <input type="checkbox"  value="SE" name="statutoryEmp"> Statutory Employee<br>
  	  <input type="checkbox" value="RP" name="retiremetnPlan"> Retirement Plan<br>
      <input type="checkbox" value="SP" name="thirdPartySickPay"> Third-Party sick Pay
      </td>
      <td colspan="1"><input type="text" placeholder="12b" name="code12B" value="0"></td>
      <td colspan="3"><input type="text" placeholder="0.00" name="box12B" value="0"></td>     
    </tr>
    
    <tr>         
      <td colspan="4" rowspan="2"><input type="text" placeholder="14 Other" name="box14"></td>
      <td colspan="1"><input type="text" placeholder="12c" name="code12C"></td>
      <td colspan="3"><input type="text" placeholder="0.00" name="box12C"></td>     
    </tr>
    
    <tr>       
      <td colspan="1"><input type="text" placeholder="12d" name="code12D"></td>
      <td colspan="3"><input type="text" placeholder="0.00" name="box12D"></td>     
    </tr>
    
    <tr>       
      <td colspan="1"><input type="text" placeholder="state" name="box15a"></td>
      <td colspan="4"><input type="text" placeholder="Employer's state ID number" name="box15b"></td> 
      <td colspan="3"><input type="text" placeholder="State wages, tips, etc." name="box16"></td>
      <td colspan="3"><input type="text" placeholder="State income tax" name="box17"></td> 
      <td colspan="3"><input type="text" placeholder="Local wages tips, etc." name="box18"></td>
      <td colspan="3"><input type="text" placeholder="Local Income tax withheld" name="Local income tax"></td> 
      <td colspan="2"><input type="text" placeholder="Locality Name" name="Locality name"></td>     
    </tr>
    
    </table>
    <input type="submit" class="button" value="Finish and Complete Return">  
    </form:form>
     
     
     
     <form:form action = "dashboard4b" method="get">
     		<input type="submit" class="button" value="Add More Income">  
     </form:form>
   
</div>
</div>



</body>
</html>