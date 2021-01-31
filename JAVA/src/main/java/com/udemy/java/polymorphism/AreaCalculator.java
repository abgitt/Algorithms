package com.udemy.java.polymorphism;

public class AreaCalculator 
{
	public int getArea(int side)
	{
		return (int) Math.pow(side, 2);
	}
	
	public double getArea(double side)
	{
		return  Math.pow(side, 2);
	}
	
	public int getArea(int length,int width)
	{
		return  length * width;
				
	}
}
