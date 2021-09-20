package com.techment;

public class Cube {

	public int cube(int a)
	{
		return a*a*a;
		
	}

	public int area(int a, int b) {
		return a*b;
	}
	
	public String angle(int a, int b) {
		if(a+b == 180) {
			return "it is Supplementary angle";
		}
		else if(a+b == 90) {
			return "it is complementary angle";
		}
		return "it is nor complementary nor supplementary";
		
	}
}
