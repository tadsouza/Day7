package com.capgemini.core.userdefinedeexception;

class TaxCalculator
{
	public static float getTaxableAmount(float amount)
	{
		return amount * 0.03f;
	}	
}

public class TestTaxCalculator 
{
	public static void main(String[] args) 
	{
		float userSalary = 454554;
		float taxableAmount = 0;
		
		taxableAmount = TaxCalculator.getTaxableAmount(userSalary);
		
		System.out.println("For salary ("+userSalary+") taxableAmount = " + taxableAmount);
		
	}
}
