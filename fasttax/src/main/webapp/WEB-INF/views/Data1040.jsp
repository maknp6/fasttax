<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FastTax 1040</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="data1040.css">
</head>
<body>



<div class="bg">
<div class="bz">
<h1>FastTax</h1>
<h2>Alright ${taxpayer.firstName}, Here is your completed form 1040. <br>
Congratulations... You're ready to file your return.</h2>
</div>

<div class="container1">
<div class="div1">



    <form:form modelAttribute="data1040" action="dashboard4" method="post"> 
    <input type="hidden" name="userId" value="${taxpayer.userId}">
    
    <table style="width:96%; heigth:96%"> 
    
    <tr>  
   <td colspan="3"> 1  Wages, salaries, tips, etc. Attach Form(s) W-2........................... </td>
       <td colspan="1"> 	1 .<input type="text" placeholder="" value="${data1040.line1}" name="line1" ></td>    
    </tr> 
    
    
    
     <tr>   
       <td colspan="1"> 2a  Tax-exempt interest............... </td>
       <td colspan="1"> 	2a<input type="text" placeholder="" value="${data1040.line2a}" name="line2a"></td>  
    <td colspan="1"> b  Taxable interest................ </td>
       <td colspan="1"> 	2b<input type="text" placeholder="" value="${data1040.line2b}" name="line2b"></td>    
    </tr>
     
     
     
     <tr>   
       <td colspan="1"> 3a  Qualified dividends.............. </td>
       <td colspan="1"> 	3a<input type="text" placeholder="" value="${data1040.line3a}" name="line3a"></td>  
    <td colspan="1"> b  Ordinary dividends............. </td>
       <td colspan="1"> 	3b<input type="text" placeholder="" value="${data1040.line3b}" name="line3b"></td>    
    </tr>
    
    
        
    <tr>   
       <td colspan="1"> 4a  IRAs, pensions, and annuities............... </td>
       <td colspan="1"> 	4a<input type="text" placeholder="" value="${data1040.line4a}" name="line4a"></td>  
    <td colspan="1"> b  Taxable amount............. </td>
       <td colspan="1"> 	4b<input type="text" placeholder="" value="${data1040.line4b}" name="line4b"></td>    
    </tr>
    
    
       
    <tr>   
       <td colspan="1"> 5a  Social security benefits............... </td>
       <td colspan="1"> 	5a<input type="text" placeholder="" value="${data1040.line5a}" name="line5a"></td>  
    <td colspan="1"> b  Taxable amount............. </td>
       <td colspan="1"> 	5b<input type="text" placeholder="" value="${data1040.line5b}" name="line5b"></td>    
    </tr>
    
    
    
    <tr>  
   <td colspan="3"> 6  Total income.  Add lines 1 through 5. Add any amount from Schedule 1, line 22................................................................. </td>
       <td colspan="1"> 	6 .<input type="text" placeholder="" value="${data1040.line6}" name="line6"></td>    
    </tr> 
    
    
    
    <tr>
    <td colspan="3"> 7 Adjusted gross income. If you have no adjustments to income, enter the amount from line 6, otherwise, subtract Schedule 1, line 36, from line 6... </td>
       <td colspan="1"> 	7 .<input type="text" placeholder="" value="${data1040.line7}" name="line7"></td>    
    </tr>
    
    
    
    <tr>  
   <td colspan="3"> 8 Standard deduction or itemized deductions  (from Schedule A)............. </td>
       <td colspan="1"> 	8 .<input type="text" placeholder="" value="${data1040.line8}" name="line8"></td>    
    </tr> 
   
    
    
    <tr>  
   <td colspan="3"> 9 Qualified business income deduction............. </td>
       <td colspan="1"> 	9 .<input type="text" placeholder="" value="${data1040.line9}"  name="line9"></td>    
    </tr> 
   
     
     
     <tr>  
   <td colspan="3"> 10 Taxable income.  Subtract lines 8 and 9 from line 7. If zero or less enter -0- ........... </td>
       <td colspan="1"> 	10<input type="text" placeholder="" value="${data1040.line10}"  name="line10"></td>    
    </tr> 
     
     
     
     <tr>  
   <td colspan="3"> 11 Tax..............................................................................................................................................   Add any amount from Schedule 2 and check here  ........  [       ] </td>
       <td colspan="1"> 	11<input type="text" placeholder="" value="${data1040.line11}"  name="line11"></td>    
    </tr> 
     
     
    
    <tr>   
       <td colspan="1"> 12  a. Child tax credit.credit for other dependents</td>
       <td colspan="1"> 	<input type="text" placeholder="0" value="${data1040.line12a}" name="line12a"></td>  
    <td colspan="1"> b.   Add any amount from Schedule 3 and check here  .............. [  ] </td>
       <td colspan="1"> 	12<input type="text" placeholder="" value="${data1040.line12}" name="line12"></td>    
    </tr>
    
    
    
    <tr>  
   <td colspan="3"> 13 Subtract line 12 from line 11.  If zero or less, enter -0- .....................................................................................   </td>
       <td colspan="1"> 	13<input type="text" placeholder="" value="${data1040.line13}" name="line13"></td>    
    </tr>
    
    
    
     <tr>  
   <td colspan="3"> 14 Other taxes.  Attach Schedule 4 .....................................................................................   </td>
       <td colspan="1"> 	14<input type="text" placeholder="" value="${data1040.line14}" name="line14"></td>    
    </tr>
    
    
    
     <tr>  
   <td colspan="3"> 15 Total tax.  Add lines 13 and 14 .....................................................................................   </td>
       <td colspan="1"> 	15<input type="text" placeholder="" value="${data1040.line15}" name="line15"></td>    
    </tr>
    
    
    
     <tr>  
   <td colspan="3"> 16 Federal income tax withheld from Forms W-2 and 1099 .....................................................................................   </td>
       <td colspan="1"> 	16<input type="text" placeholder="" value="${data1040.line16}" name="line16"></td>    
    </tr> 
    <!-- ************************************************************************* -->
    
    
    
     <tr>  
   <td colspan="3"> 17 Refundable credits: ...............  a EIC (see inst.) _______________ ...............  b Sch. 8812 _______________ ...............   c Form 8863 _______________  
   <br><br> Add any amount from Schedule 5 ........................ _______________  </td>
       <td colspan="1"> 	17<input type="text" placeholder="" value="${data1040.line17}" name="line17"></td>    
    </tr>
    
    
    
     <tr>  
   <td colspan="3"> 18 Add lines 16 and 17.  These are your total payments ............................................................. </td>
       <td colspan="1"> 	18<input type="text" placeholder="" value="${data1040.line18}" name="line18"></td>    
    </tr>
    
    
    
     <tr>  
   <td colspan="3"> 19 If line 18 is more than line 15, subtract line 15 from line18. This is the amount you overpaid. .....................................................................................   </td>
       <td colspan="1"> 	19<input type="text" placeholder="" value="${data1040.line19}" name="line19"></td>    
    </tr>
    
    
    
    <tr>  
   <td colspan="3"> 20a Amount of line 19 you want refunded to you.  If Form 8888 is attached, check here ........................................................................................................ [ ]  
   <br><br> b  Routing Number.............................................................|____|____|____|____|____|____|____|____|____| ...........  c. Type:   [ ]  Checking ........   [ ] Savings
   <br><br> d  Account Number.............................................................|____|____|____|____|____|____|____|____|____|____|____|____|____|____|____|____|____|
   <br><br> 21  Amount of line 19 you want applied to your 2019 estimated tax ........................................ ...................................................| 21 | ____________________</td>
       <td colspan="1"> 	20<input type="text" placeholder="" value="${data1040.line20a}" name="line20a"></td>    
    </tr>
    
    
    
    <tr>  
   <td colspan="3"> 22  Amount you owe.  Subtract line 18 from line 15. For details on how to pay, see instructions.....................
   <br><br> 23  Estimated tax penalty (see instructions) ....................................................................................................................| 23 | ____________________</td>
       <td colspan="1"> 	22<input type="text" placeholder="" value="${data1040.line22}" name="line22"></td>    
    </tr>
    
    
    
    
    
    
    
    
     
     
     <!--  *************************************************************  -->
    </table>
    <input type="submit" class="button" value="Print My Return">  
    </form:form>
     
     
     
     <form:form action = "dashboard4b" method="get">
     		<input type="submit" class="button" value="E-File My Return">  
     </form:form>
     
     
     </div>
     </div>
     </div>











</body>
</html>