package com.websystique.springsecurity.configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SampleClass {

	
	public static void main(String args[]){
	String a="akhil";
	String b=new String("akhil");
	
	System.out.println(a==b);
	System.out.println(a.compareTo(b));
	System.out.println(a.equals(b));
		
	CreditCard c2=new CreditCard(12);
	CreditCard c1=new CreditCard(12);
	
	ArrayList<Object> c23=new ArrayList<>();
	c23.add(c1);
	c23.add(c2);
	System.out.println(c23.size());
	
	
	Set<Object> c13=new HashSet<>();
	c13.add(c1);
	c13.add(c2);
	System.out.println(c13.size());
	}
	
	
	
}

class CreditCard{
	public int n;
	
	public CreditCard(int n2){
		
		this.n=n2;
		
	}
	
}
