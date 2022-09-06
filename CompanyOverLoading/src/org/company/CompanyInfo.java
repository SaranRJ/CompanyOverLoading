package org.company;

public class CompanyInfo {

	public void companyName(String s) {
		System.out.println("Company:"+s);
	}
	
	public void companyName(String s,int i) {
		System.out.println("Company:"+s);
		System.out.println("Company:"+i);
	}
	public void companyName(String s,int i,char c) {
		System.out.print("Company:"+s+", ");
		System.out.print("ID:"+i+", ");
		System.out.print("Char:"+c);
	}
	
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName("Atos");
		c.companyName("Wipro", 19);
		c.companyName("TCS", 14, 'S');

	}

}
