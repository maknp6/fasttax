package com.fasttax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class W2 
{			
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int W2ID;	
	//**************** These are from taxpayer or logged in user ****************************************
	@Column
	private int userId;	
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String streetAddress;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;
	@Column
	private int ssn;		
	//***************** These are Employer information ***************************************
	@Column
	private String empName;
	@Column
	private String empStreetAddress;
	@Column
	private String empCity;
	@Column
	private String empState;
	@Column
	private String empZip;
	@Column
	private String empEIN;				//or int??
	//***************** These are Employer information ***************************************	
	@Column
	private double box1;
	@Column
	private double box2=0;
	@Column
	private double box3=0;
	@Column
	private double box4=0;
	@Column
	private double box5=0;
	@Column
	private double box6=0;
	@Column
	private double box7=0;
	@Column
	private double box8=0;
	@Column
	private double box9=0;
	@Column
	private double box10=0;
	@Column
	private double box11=0;
	@Column
	private String code12A;
	@Column
	private double box12A=0;
	@Column
	private String code12B;
	@Column
	private double box12B=0;
	@Column
	private String code12C;
	@Column
	private double box12C=0;
	@Column
	private String code12D;
	@Column
	private double box12D=0;
	@Column
	private String code14A;
	@Column
	private double box14A=0;
	@Column
	private String code14B;
	@Column
	private double box14B=0;
	@Column
	private String box15a;
	@Column
	private String box15b;
	@Column
	private double box16=0;
	@Column
	private double box17=0;
	@Column
	private double box18=0;
	@Column
	private double box19=0;
	@Column
	private String box20;
	
	public int getW2ID() {
		return W2ID;
	}	
	public void setW2ID(int w2id) {
		W2ID = w2id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpStreetAddress() {
		return empStreetAddress;
	}
	public void setEmpStreetAddress(String empStreetAddress) {
		this.empStreetAddress = empStreetAddress;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public String getEmpZip() {
		return empZip;
	}
	public void setEmpZip(String empZip) {
		this.empZip = empZip;
	}
	public String getEmpEIN() {
		return empEIN;
	}
	public void setEmpEIN(String empEIN) {
		this.empEIN = empEIN;
	}
	public double getBox1() {
		return box1;
	}
	public void setBox1(double box1) {
		this.box1 = box1;
	}
	public double getBox2() {
		return box2;
	}
	public void setBox2(double box2) {
		this.box2 = box2;
	}
	public double getBox3() {
		return box3;
	}
	public void setBox3(double box3) {
		this.box3 = box3;
	}
	public double getBox4() {
		return box4;
	}
	public void setBox4(double box4) {
		this.box4 = box4;
	}
	public double getBox5() {
		return box5;
	}
	public void setBox5(double box5) {
		this.box5 = box5;
	}
	public double getBox6() {
		return box6;
	}
	public void setBox6(double box6) {
		this.box6 = box6;
	}
	public double getBox7() {
		return box7;
	}
	public void setBox7(double box7) {
		this.box7 = box7;
	}
	public double getBox8() {
		return box8;
	}
	public void setBox8(double box8) {
		this.box8 = box8;
	}
	public double getBox9() {
		return box9;
	}
	public void setBox9(double box9) {
		this.box9 = box9;
	}
	public double getBox10() {
		return box10;
	}
	public void setBox10(double box10) {
		this.box10 = box10;
	}
	public double getBox11() {
		return box11;
	}
	public void setBox11(double box11) {
		this.box11 = box11;
	}
	public String getCode12A() {
		return code12A;
	}
	public void setCode12A(String code12a) {
		code12A = code12a;
	}
	public double getBox12A() {
		return box12A;
	}
	public void setBox12A(double box12a) {
		box12A = box12a;
	}
	public String getCode12B() {
		return code12B;
	}
	public void setCode12B(String code12b) {
		code12B = code12b;
	}
	public double getBox12B() {
		return box12B;
	}
	public void setBox12B(double box12b) {
		box12B = box12b;
	}
	public String getCode12C() {
		return code12C;
	}
	public void setCode12C(String code12c) {
		code12C = code12c;
	}
	public double getBox12C() {
		return box12C;
	}
	public void setBox12C(double box12c) {
		box12C = box12c;
	}
	public String getCode12D() {
		return code12D;
	}
	public void setCode12D(String code12d) {
		code12D = code12d;
	}
	public double getBox12D() {
		return box12D;
	}
	public void setBox12D(double box12d) {
		box12D = box12d;
	}
	public String getCode14A() {
		return code14A;
	}
	public void setCode14A(String code14a) {
		code14A = code14a;
	}
	public double getBox14A() {
		return box14A;
	}
	public void setBox14A(double box14a) {
		box14A = box14a;
	}
	public String getCode14B() {
		return code14B;
	}
	public void setCode14B(String code14b) {
		code14B = code14b;
	}
	public double getBox14B() {
		return box14B;
	}
	public void setBox14B(double box14b) {
		box14B = box14b;
	}	
	public String getBox15a() {
		return box15a;
	}
	public void setBox15a(String box15a) {
		this.box15a = box15a;
	}
	public String getBox15b() {
		return box15b;
	}
	public void setBox15b(String box15b) {
		this.box15b = box15b;
	}
	public double getBox16() {
		return box16;
	}
	public void setBox16(double box16) {
		this.box16 = box16;
	}
	public double getBox17() {
		return box17;
	}
	public void setBox17(double box17) {
		this.box17 = box17;
	}
	public double getBox18() {
		return box18;
	}
	public void setBox18(double box18) {
		this.box18 = box18;
	}
	public double getBox19() {
		return box19;
	}
	public void setBox19(double box19) {
		this.box19 = box19;
	}
	public String getBox20() {
		return box20;
	}
	public void setBox20(String box20) {
		this.box20 = box20;
	}
	
	
	
	@Override
	public String toString() {
		return "W2 [W2ID=" + W2ID + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zip=" + zip + ", ssn="
				+ ssn + ", empName=" + empName + ", empStreetAddress=" + empStreetAddress + ", empCity=" + empCity
				+ ", empState=" + empState + ", empZip=" + empZip + ", empEIN=" + empEIN + ", box1=" + box1 + ", box2="
				+ box2 + ", box3=" + box3 + ", box4=" + box4 + ", box5=" + box5 + ", box6=" + box6 + ", box7=" + box7
				+ ", box8=" + box8 + ", box9=" + box9 + ", box10=" + box10 + ", box11=" + box11 + ", code12A=" + code12A
				+ ", box12A=" + box12A + ", code12B=" + code12B + ", box12B=" + box12B + ", code12C=" + code12C
				+ ", box12C=" + box12C + ", code12D=" + code12D + ", box12D=" + box12D + ", code14A=" + code14A
				+ ", box14A=" + box14A + ", code14B=" + code14B + ", box14B=" + box14B + ", box15a=" + box15a
				+ ", box15b=" + box15b + ", box16=" + box16 + ", box17=" + box17 + ", box18=" + box18 + ", box19="
				+ box19 + ", box20=" + box20 + "]";
	}	
}
	
	
	
	
	
	
	
