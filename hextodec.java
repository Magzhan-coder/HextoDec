package com.company;

import java.util.Scanner;

public class hextodec{

	public static void main(String[] args){

		Scanner space = new Scanner(System.in);
		String mo = space.next();
		hextodec(mo);

	}
	public static void hextodec(String mo){

		int decim=0;

		try{

			for (int m =0; m<mo.length(); m++){
			char na = mo.charAt(m);
			decim = (decim*16) + webex(na);
			System.out.println("The decimal value is "+decim);

		}


		}
		catch (Exception ex){

			System.out.println("Wrong input");

		}
	}
	public static int webex(char d){

		if (d>='A' && d <= 'F')
			return 10 + d -'A';
		else 
			return d -'0';
	}
}