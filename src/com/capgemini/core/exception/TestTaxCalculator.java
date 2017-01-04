package com.capgemini.core.exception;

class NegativeSalaryException extends Exception
{
	public NegativeSalaryException()
	{
		task();
	}
	
	public NegativeSalaryException(String exMsg)
	{
		super(exMsg);
		task();
	}
	
	public void task()
	{
		System.out.println("Send email to developers/testers");
		System.out.println("Log this exception to a file");
	}
}

class ZeroSalaryException extends Exception
{
	public ZeroSalaryException()
	{
		task();
	}
	
	public ZeroSalaryException(String exMsg)
	{
		super(exMsg);
		task();
	}
	
	public void task()
	{
		System.out.println("Send email to developers/testers");
		System.out.println("Log this exception to a file");
	}
}

class TaxCalculator
{
	public static float getTaxableAmount(float salary) 
			throws NegativeSalaryException, ZeroSalaryException
	{
		if(salary < 0 )
			throw new NegativeSalaryException("Negetive salary not allowed");
		
		
		
		if(salary == 0 )
			throw new ZeroSalaryException();
		
		return salary * 0.03f;
	}	
}

public class TestTaxCalculator 
{
	public static void main(String[] args) 
	{
		float userSalary = -34340;
		float taxableAmount = 0;
		
		
			try 
			{
				taxableAmount = TaxCalculator.getTaxableAmount(userSalary);
			} 
			catch (NegativeSalaryException e) {
				e.printStackTrace();
			} 
			catch (ZeroSalaryException e) {
				e.printStackTrace();
			}
			catch(Exception e)
			{
				System.out.println("Unknow exception shutting down");
				System.exit(1);
			}
		
		System.out.println("For salary ("+userSalary+") taxableAmount = " + taxableAmount);
		
		
	}
}
