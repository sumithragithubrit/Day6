package com.logical;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int Number;
		int temp;
		int reverse;
		 System.out.println("Enter Number ");
		Scanner s =new Scanner(System.in);
	    Number=s.nextInt();
	       temp=Number;
	    for(reverse=0;Number!=0 ; Number=Number/10)
	    {
	    	 int remainder=Number%10;
	    	reverse=reverse*10+remainder;
	    }
System.out.println("Reverse Number is:"+reverse);
	}

}
