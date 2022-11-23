package com.logical;

public class CoupenCode {

	public static void main(String[] args) {
		char[] chars="vbwushdgqiAqdBASJDHQWOIFHAuigsshavdhAUDHABDGAIdu212345786589".toCharArray();
		int max=100000000;
		String s="";
		int random=(int)(Math.random()*max);
		while(random>0)
		{
			int n=random%10;
			s+=String.valueOf(chars[n]);
			random=random/10;
		}
System.out.println(s);
	}

}
