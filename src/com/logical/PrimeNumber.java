package com.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Entered number is prime");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean prime=true;
		int i,j;
		for(i=2;i<n;i++)
		{
			
				if(n%i==0)
				{
					prime=false;
					break;
				}
				
						
		}
		
System.out.println(prime);
	}

}
