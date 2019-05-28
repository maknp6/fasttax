package com.fasttax.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasttax.entity.Data1040;
import com.fasttax.entity.Taxpayer;
import com.fasttax.entity.W2;
import com.fasttax.service.UserService;
import com.fasttax.service.W2Service;

@Controller
public class HomeController 
{
	@Autowired
	UserService userService;
	
	
	@Autowired
	W2Service w2service;
	
	

	@RequestMapping("/")   //************************************
	public ModelAndView index() 
	{
		return new ModelAndView("index");		
	}	
	
	
	
	@RequestMapping("/register")
	public ModelAndView register() 
	{
		return new ModelAndView("register");
	}	
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView profile(@ModelAttribute("taxpayer") Taxpayer taxpayer) 
	{
		System.out.println(taxpayer);
		userService.saveUser(taxpayer);
		
		return new ModelAndView("login");
	}
	
	
	@RequestMapping(value="/dashboard", method=RequestMethod.POST)
	public ModelAndView profileStatus(@ModelAttribute("taxpayer") Taxpayer taxpayer) 
	{
		System.out.println("filing status"+taxpayer);
		userService.saveUser(taxpayer);
		
		return new ModelAndView("elements");
	}
	
	
	@RequestMapping(value="/dashboard2", method=RequestMethod.POST)
	public ModelAndView profileStatus2(@ModelAttribute("taxpayer") Taxpayer taxpayer) 
	{
		System.out.println("Dependents Claimed: "+taxpayer);
		userService.saveUser(taxpayer);
		
		return new ModelAndView("components");
	}
	
	
	@RequestMapping(value="/dashboard3", method=RequestMethod.POST)
	public ModelAndView incomeComponent1(@ModelAttribute("W2") W2 W2) 
	{		
		return new ModelAndView("w2");
	}
	
	
	
	@RequestMapping(value="/dashboard4", method=RequestMethod.POST)
	public ModelAndView incomeComponent2(@ModelAttribute("W2") W2 W2, HttpSession session) 
	{
		System.out.println(W2);
		w2service.saveUserW2(W2);
		
		Taxpayer loggedInUser = (Taxpayer)session.getAttribute("taxpayer");
		
		Data1040 data1040 = new Data1040();
		
		
		//line 1
		double line1data = W2.getBox1();
		int line1 = (int)line1data;
		data1040.setLine1(line1);
		
		
		//Line 6		
		double line6data = data1040.getLine1() + data1040.getLine2b() + data1040.getLine3b() +data1040.getLine4b() + data1040.getLine5b();
		int line6 = (int)line6data;
		data1040.setLine6(line6);
		
		
		//line7     //no schedule 1
		double line7data = line6 -0;
		data1040.setLine7(line7data);
		
		
		//line 8
		if(loggedInUser.getFilingStatus().equals("single") || (loggedInUser.getFilingStatus().equals("mfs")))
		{
			data1040.setLine8(12000);
		}
		else if(loggedInUser.getFilingStatus().equals("mfj") || (loggedInUser.getFilingStatus().equals("qw")))
		{ 
			data1040.setLine8(24000);
		} 	
		else if(loggedInUser.getFilingStatus().equals("hoh"))
		{ 
			data1040.setLine8(18000);
		} 		
		else 
		{ 
			data1040.setLine8(999999999);
		} 			
			
		
		//line10
		double line10data = data1040.getLine7() - (data1040.getLine8() + data1040.getLine9());
		data1040.setLine10(line10data);
		
		
		//line 11 TAX ******************
		double taxdue=0;
		double taxableIncome = data1040.getLine10();
		
		
		switch(loggedInUser.getFilingStatus()) 
		{
			case "single":
				// 10% Bracket********************
				if(  taxableIncome >=9525)
				{
					taxdue += (9525)*0.10;  //10
					taxableIncome=taxableIncome-(9525);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue=taxableIncome*0.1;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				
				// 12% Bracket********************	
				if(taxableIncome >=29175)
				{
					taxdue += (29175)*0.12;  
					taxableIncome=taxableIncome-(29175);
					data1040.setLine11(taxdue);
				}
					
				else 
				{
					taxdue+=taxableIncome*0.12;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 22% Bracket********************
				if(taxableIncome >=43800)
				{
					taxdue += (43800)*0.22;  //22
					taxableIncome=taxableIncome-(43800);
					data1040.setLine11(taxdue);
				} 
				else 
				{
					taxdue+=taxableIncome*0.22;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 24% Bracket********************
				if(taxableIncome >=75000)
				{
					taxdue += (75000)*0.24;  
					taxableIncome=taxableIncome-(75000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.24;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 32% Bracket********************
				if(taxableIncome >=42500)
				{
					taxdue += (42500)*0.32;  
					taxableIncome=taxableIncome-(42500);	
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.32;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 35% Bracket********************
				if(taxableIncome >=300000)
				{
					taxdue += (300000)*0.35;  
					taxableIncome=taxableIncome-(300000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.35;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 37% Bracket********************
				if(taxableIncome >0)
				{
					taxdue += taxableIncome*0.37;
					data1040.setLine11(taxdue);
					
				}
				else 
				{
					taxdue+=taxableIncome*0.37;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}	
			break;
		  
			
			case "mfj":
				// 10% Bracket********************
				if(  taxableIncome >19050)
				{
					taxdue += (19050)*0.10;  //10
					taxableIncome=taxableIncome-(19050);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue=taxableIncome*0.1;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				
				// 12% Bracket********************	
				if(taxableIncome >=58350)
				{
					taxdue += (58350)*0.12;  
					taxableIncome=taxableIncome-(58350);
					data1040.setLine11(taxdue);
				}
					
				else 
				{
					taxdue+=taxableIncome*0.12;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 22% Bracket********************
				if(taxableIncome >=87600)
				{
					taxdue += (87600)*0.22;  //22
					taxableIncome=taxableIncome-(87600);
					data1040.setLine11(taxdue);
				} 
				else 
				{
					taxdue+=taxableIncome*0.22;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 24% Bracket********************
				if(taxableIncome >=150000)
				{
					taxdue += (150000)*0.24;  
					taxableIncome=taxableIncome-(150000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.24;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 32% Bracket********************
				if(taxableIncome >=85000)
				{
					taxdue += (85000)*0.32;  
					taxableIncome=taxableIncome-(85000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.32;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 35% Bracket********************
				if(taxableIncome >=200000)
				{
					taxdue += (200000)*0.35;  
					taxableIncome=taxableIncome-(200000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.35;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 37% Bracket********************
				if(taxableIncome >0)
				{
					taxdue += taxableIncome*0.37;	
					data1040.setLine11(taxdue);
					
				}
				else 
				{
					taxdue+=taxableIncome*0.37;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}			
			break;
		    
		    
		    
		    
		    
			case "mfs":
				// 10% Bracket********************
				if(  taxableIncome >9525)
				{
					taxdue += (9525)*0.10;  //10
					taxableIncome=taxableIncome-(9525);	
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue=taxableIncome*0.1;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				
				// 12% Bracket********************	
				if(taxableIncome >=29175)
				{
					taxdue += (29175)*0.12;  
					taxableIncome=taxableIncome-(29175);
					data1040.setLine11(taxdue);
				}
					
				else 
				{
					taxdue+=taxableIncome*0.12;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 22% Bracket********************
				if(taxableIncome >=43800)
				{
					taxdue += (43800)*0.22;  //22
					taxableIncome=taxableIncome-(43800);
					data1040.setLine11(taxdue);
				} 
				else 
				{
					taxdue+=taxableIncome*0.22;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 24% Bracket********************
				if(taxableIncome >=75000)
				{
					taxdue += (75000)*0.24;  
					taxableIncome=taxableIncome-(75000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.24;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 32% Bracket********************
				if(taxableIncome >=42500)
				{
					taxdue += (42500)*0.32;  
					taxableIncome=taxableIncome-(42500);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.32;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 35% Bracket********************
				if(taxableIncome >=100000)
				{
					taxdue += (100000)*0.35;  
					taxableIncome=taxableIncome-(100000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.35;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 37% Bracket********************
				if(taxableIncome >0)
				{
					taxdue += taxableIncome*0.37;
					data1040.setLine11(taxdue);
					
				}
				else 
				{
					taxdue+=taxableIncome*0.37;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}			
			break;
			  
			  
			case "hoh":
				// 10% Bracket********************
				if(  taxableIncome >13600)
				{
					taxdue += (13600)*0.10;  //10
					taxableIncome=taxableIncome-(13600);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue=taxableIncome*0.1;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				
				// 12% Bracket********************	
				if(taxableIncome >=38200)
				{
					taxdue += (38200)*0.12;  
					taxableIncome=taxableIncome-(38200);
					data1040.setLine11(taxdue);
				}
					
				else 
				{
					taxdue+=taxableIncome*0.12;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 22% Bracket********************
				if(taxableIncome >=30700)
				{
					taxdue += (30700)*0.22;  //22
					taxableIncome=taxableIncome-(30700);
					data1040.setLine11(taxdue);
				} 
				else 
				{
					taxdue+=taxableIncome*0.22;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 24% Bracket********************
				if(taxableIncome >=75000)
				{
					taxdue += (75000)*0.24;  
					taxableIncome=taxableIncome-(75000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.24;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 32% Bracket********************
				if(taxableIncome >=42500)
				{
					taxdue += (42500)*0.32;  
					taxableIncome=taxableIncome-(42500);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.32;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 35% Bracket********************
				if(taxableIncome >=300000)
				{
					taxdue += (300000)*0.35;  
					taxableIncome=taxableIncome-(300000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.35;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 37% Bracket********************
				if(taxableIncome >0)
				{
					taxdue += taxableIncome*0.37;	
					data1040.setLine11(taxdue);
					
				}
				else 
				{
					taxdue+=taxableIncome*0.37;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}			
			break;
			
			
			
			case "qw":
				// 10% Bracket********************
				if(  taxableIncome >19050)
				{
					taxdue += (19050)*0.10;  //10
					taxableIncome=taxableIncome-(19050);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue=taxableIncome*0.1;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				
				// 12% Bracket********************	
				if(taxableIncome >=58350)
				{
					taxdue += (58350)*0.12;  
					taxableIncome=taxableIncome-(58350);
					data1040.setLine11(taxdue);
				}
					
				else 
				{
					taxdue+=taxableIncome*0.12;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 22% Bracket********************
				if(taxableIncome >=87600)
				{
					taxdue += (87600)*0.22;  //22
					taxableIncome=taxableIncome-(87600);
					data1040.setLine11(taxdue);
				} 
				else 
				{
					taxdue+=taxableIncome*0.22;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 24% Bracket********************
				if(taxableIncome >=150000)
				{
					taxdue += (150000)*0.24;  
					taxableIncome=taxableIncome-(150000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.24;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 32% Bracket********************
				if(taxableIncome >=85000)
				{
					taxdue += (85000)*0.32;  
					taxableIncome=taxableIncome-(85000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.32;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}
				
				// 35% Bracket********************
				if(taxableIncome >=200000)
				{
					taxdue += (200000)*0.35;  
					taxableIncome=taxableIncome-(200000);
					data1040.setLine11(taxdue);
				}
				else 
				{
					taxdue+=taxableIncome*0.35;
					taxableIncome=0;	
					data1040.setLine11(taxdue);
				}
				
				// 37% Bracket********************
				if(taxableIncome >0)
				{
					taxdue += taxableIncome*0.37;
					data1040.setLine11(taxdue);
					
				}
				else 
				{
					taxdue+=taxableIncome*0.37;
					taxableIncome=0;
					data1040.setLine11(taxdue);
				}			
			break;			  
		}
		
		
		
		//line 12
		//line 13
		double line13data = data1040.getLine11() - data1040.getLine12();
		data1040.setLine13(line13data);
				
		
		//line 14
		//line 15
		double line15data = data1040.getLine13() + data1040.getLine14();
		data1040.setLine15(line15data);
		
		//line 16
		double line16data = W2.getBox2();
		int line16 = (int)line16data;
		data1040.setLine16(line16);
		
		//line 17
		//line 18
		double line18data = data1040.getLine16() + data1040.getLine17();
		data1040.setLine18(line18data);
		
		
		//line 19
				if(line18data > line15data) 
				{
					double line19data = data1040.getLine18() - data1040.getLine15();
					data1040.setLine19(line19data);
					data1040.setLine20a(line19data);
				}						
				else 
				{ 
					data1040.setLine19(0);
				} 			
			
			
		
				
				
				
				
		
				if(line15data > line18data) 
				{
					double line22data = data1040.getLine15() - data1040.getLine18();
					data1040.setLine22(line22data);
				}						
				else 
				{ 
					data1040.setLine22(0);
				}


				
			
				
	
	return new ModelAndView("Data1040","data1040", data1040);
	}
	
	@RequestMapping(value="/dashboard4b", method=RequestMethod.GET)
	public ModelAndView addForms(@ModelAttribute("W2") W2 W2) 
	{
		System.out.println(W2);
		w2service.saveUserW2(W2);
		
		
		
		return new ModelAndView("components");
	}
	
	
	
	
	@RequestMapping("/login") //matches href
	public ModelAndView signin() 
	{
		return new ModelAndView("login", "taxpayer", new Taxpayer());	//matches jsp
	}	
	
	
	@RequestMapping(value="/FilingStatus", method=RequestMethod.POST)  // when you click login
	public ModelAndView login(@ModelAttribute("taxpayer") Taxpayer taxpayer, HttpSession session) 
	{
		System.out.println(taxpayer.getEmail() + " " + taxpayer.getPassword());
		Taxpayer loggedInUser = userService.getTaxpayer(taxpayer.getEmail(), taxpayer.getPassword());
	
		System.out.println(loggedInUser);
		if(loggedInUser != null) 
		{
			session.setAttribute("taxpayer", loggedInUser);
			return new ModelAndView("dashboard","taxpayer", loggedInUser); //passing loggedInUser as taxpayer to dasboard.jsp
		}
		else		
			return new ModelAndView("login");
	}
	
}
