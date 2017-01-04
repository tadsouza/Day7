package com.capgemini.core.exception;

class Circle
{
	public static double getCircumferance(int radius) 
		throws IllegalArgumentException
	{
		//assumption radius >=0
		if(radius < 0)
		{	
			throw new IllegalArgumentException("Radius should be positive");
		}
		
		return 2 * Math.PI * radius;
	}
}

public class TestCircle 
{
	public static void main(String[] args) 
	{
		int radius = -56;
		
		double cir=0;
		
		try
		{
			cir = Circle.getCircumferance(radius);
		}catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println
		("Area of circle with radius " +radius +" is " + cir);
	}
}
