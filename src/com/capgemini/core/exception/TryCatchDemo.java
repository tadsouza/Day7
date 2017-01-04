package com.capgemini.core.exception;

//taking responsibility of handling exception by using
//try catch

class Calculator
{
	public static int div(int[] param)
	{		
		int result = 0;

		try
		{
		
			int param1 = param[0];
			int param2 = param[1];
		
			result = param1 / param2;
		}
		catch(ArithmeticException e)	
		{
			System.out.println("Wrong input: Divide by zero " + e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Some ref is not initialized " + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Some Exception Occured, Contact Administrator");
			System.exit(1);
		}
		finally
		{
			System.out.println("Always Executes");
		}
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		return result;
	}
}



public class TryCatchDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Application Started");
		
		int []intArray = null;
		//intArray = new int[]{4};
		
		int valueReturned=0;
//		try 
//		{
			valueReturned = Calculator.div(intArray);
//		} catch (Exception e) 
//			e.printStackTrace();
//		}
//		
		System.out.println(valueReturned);
		
		System.out.println("Application Shutting Down...");
	}
}
