package com.logical;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		  Long n=s.nextLong();
		  int i=1;
		   long sum=0;
		  while(i<=n/2)
		  {
			  if(n%i==0)
			  {
				  sum=sum+i;
				 
			  }
			  i++;
			  
			  
		  }
if(sum==n)
{
	System.out.println(n+"is a perfect number");
	
}
else
{
	System.out.println(n+"is not a perfect number");
}
	}

}
