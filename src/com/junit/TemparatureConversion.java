package com.junit;
import java.util.Scanner;
public class TemparatureConversion {

	public static void main(String[] args) {
		double f,c;
		System.out.println("Choose type of conversion\n  1.Fahrenheit to Celsius \n  2.Celsius to Fahrenheit");
		Scanner s =new Scanner(System.in);
	    int ch=s.nextInt();
	    
	  if(ch==1)
	  {
		  
	    		System.out.println("Enter Fahrenheit temparature ");
	    	    f=s.nextDouble();
	    	    c=(f-32)*5/9;
	    	    System.out.println("Enter Celsius temparature is "+c);
	  }
	  if(ch==2)  
	  {
		    		System.out.println("Enter Celsius temparature ");
		    	    c=s.nextDouble();
		    	    c=((9*c)/5)+32;
		    	    System.out.println("Enter  Fahrenheit  temparature is "+c);
	
	  }    	   
		    	    	
	    }

	}


