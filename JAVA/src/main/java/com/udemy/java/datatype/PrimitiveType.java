package com.udemy.java.datatype;

public class PrimitiveType 
{
	public static void main(String[] args)
	{
		int a = 5;
		System.out.println("Before change : "+ a); //5
		change(a);
		System.out.println("After change : "+ a); //5
	}

	private static void change(int a) {
		a++;
	}
}
