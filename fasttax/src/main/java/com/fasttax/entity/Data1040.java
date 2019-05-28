package com.fasttax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Data1040 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id1040;	
	@Column
	private int userId;
	@Column
	private double line1; 	//wages salaries tips
	@Column
	private double line2a; 	
	@Column
	private double line2b; 	//taxable interest
	@Column
	private double line3a; 	
	@Column
	private double line3b=0;	//ordinary dividends
	@Column
	private double line4a; 	
	@Column
	private double line4b=0;	//IRA pesion taxable amount
	@Column
	private double line5a; 	
	@Column
	private double line5b=0;	//soc sec benefits taxable amount
	@Column
	private double line6;	//total income				****Sum of 1 thru 5****
	@Column
	private double line7;	//box 6  this is AGI
	@Column
	private double line8;	//Standard deduction (or itemized)
	@Column
	private double line9=0;	//qual business income deduction
	@Column
	private double line10;	//total income  			****box 7 less (sum of 8 & 9)
	@Column
	private double line11;	//	Calculate taxes   *****7 tax brackets****  10%, 12%, 22%, 24%, 32%, 35%, 37%  
	@Column
	private double line12;
	@Column
	private double line12a;	//  child tax credit	
	@Column
	private double line13;	//						****subtract 12 from 11****		
	@Column
	private double line14;	//Other taxes
	@Column
	private double line15;	//total tax				**** sum of 13 and 14****
	@Column
	private double line16;	//federal income tax withheld   ****sum of box 2 in W2****
	@Column
	private double line17;	//refundable credits
	@Column
	private double line18;	//total payments				****sum of 16 and 17****
	@Column
	private double line19;	//if 18 is more than 15 this is overpaid/refund   *********
	@Column
	private double line20a;	//amount you want refunded
	@Column
	private double line22;	//if 15 is more than 18 this is amount you owe   *********
	
	
	public int getId1040() {
		return id1040;
	}
	public void setId1040(int id1040) {
		this.id1040 = id1040;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getLine1() {
		return line1;
	}
	public void setLine1(double line1) {
		this.line1 = line1;
	}
	public double getLine2a() {
		return line2a;
	}
	public void setLine2a(double line2a) {
		this.line2a = line2a;
	}
	public double getLine2b() {
		return line2b;
	}
	public void setLine2b(double line2b) {
		this.line2b = line2b;
	}
	public double getLine3a() {
		return line3a;
	}
	public void setLine3a(double line3a) {
		this.line3a = line3a;
	}
	public double getLine3b() {
		return line3b;
	}
	public void setLine3b(double line3b) {
		this.line3b = line3b;
	}
	public double getLine4a() {
		return line4a;
	}
	public void setLine4a(double line4a) {
		this.line4a = line4a;
	}
	public double getLine4b() {
		return line4b;
	}
	public void setLine4b(double line4b) {
		this.line4b = line4b;
	}
	public double getLine5a() {
		return line5a;
	}
	public void setLine5a(double line5a) {
		this.line5a = line5a;
	}
	public double getLine5b() {
		return line5b;
	}
	public void setLine5b(double line5b) {
		this.line5b = line5b;
	}
	public double getLine6() {
		return line6;
	}
	public void setLine6(double line6) {
		this.line6 = line6;
	}
	public double getLine7() {
		return line7;
	}
	public void setLine7(double line7) {
		this.line7 = line7;
	}
	public double getLine8() {
		return line8;
	}
	public void setLine8(double line8) {
		this.line8 = line8;
	}
	public double getLine9() {
		return line9;
	}
	public void setLine9(double line9) {
		this.line9 = line9;
	}
	public double getLine10() {
		return line10;
	}
	public void setLine10(double line10) {
		this.line10 = line10;
	}
	public double getLine11() {
		return line11;
	}
	public void setLine11(double line11) {
		this.line11 = line11;
	}
	public double getLine12() {
		return line12;
	}
	public void setLine12(double line12) {
		this.line12 = line12;
	}
	public double getLine12a() {
		return line12a;
	}
	public void setLine12a(double line12a) {
		this.line12a = line12a;
	}
	public double getLine13() {
		return line13;
	}
	public void setLine13(double line13) {
		this.line13 = line13;
	}
	public double getLine14() {
		return line14;
	}
	public void setLine14(double line14) {
		this.line14 = line14;
	}
	public double getLine15() {
		return line15;
	}
	public void setLine15(double line15) {
		this.line15 = line15;
	}
	public double getLine16() {
		return line16;
	}
	public void setLine16(double line16) {
		this.line16 = line16;
	}
	public double getLine17() {
		return line17;
	}
	public void setLine17(double line17) {
		this.line17 = line17;
	}
	public double getLine18() {
		return line18;
	}
	public void setLine18(double line18) {
		this.line18 = line18;
	}
	public double getLine19() {
		return line19;
	}
	public void setLine19(double line19) {
		this.line19 = line19;
	}
	public double getLine20a() {
		return line20a;
	}
	public void setLine20a(double line20a) {
		this.line20a = line20a;
	}
	public double getLine22() {
		return line22;
	}
	public void setLine22(double line22) {
		this.line22 = line22;
	}
	
	
	@Override
	public String toString() {
		return "Data1040 [id1040=" + id1040 + ", userId=" + userId + ", line1=" + line1 + ", line2a=" + line2a
				+ ", line2b=" + line2b + ", line3a=" + line3a + ", line3b=" + line3b + ", line4a=" + line4a
				+ ", line4b=" + line4b + ", line5a=" + line5a + ", line5b=" + line5b + ", line6=" + line6 + ", line7="
				+ line7 + ", line8=" + line8 + ", line9=" + line9 + ", line10=" + line10 + ", line11=" + line11
				+ ", line12=" + line12 + ", line12a=" + line12a + ", line13=" + line13 + ", line14=" + line14
				+ ", line15=" + line15 + ", line16=" + line16 + ", line17=" + line17 + ", line18=" + line18
				+ ", line19=" + line19 + ", line20a=" + line20a + ", line22=" + line22 + "]";
	}	
}
