package com.capgemini.core.assignment;

class MyDate
{
	private int dd;
	private int mm;
	private int yyyy;
	
	private int[] maxDaysOfMonth = 
			new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	
	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MyDate(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}	
}

class DaysDifferenceCalculator
{
	public int getDaysDifference(MyDate d1, MyDate d2)
	{
		
		//scenario 1 (same month same year)
		//scenario 2 (same year diff month)
		//scenario 3 (diff year diff month)
	
		if(isSameMonthSameYear(d1, d2))		{
			return getDaysDiff_SameMonthSameYear(d1, d2);
		}
		else
		{
			if(isDiffMonthSameYear(d1, d2))			{
				return getDaysDiff_SameMonthSameYear(d1, d2);
			}
			else
			{
				if(isDiffMonthDiffYear(d1, d2))				{
					return getDaysDifference_DiffMonthDiffYear(d1, d2);
				}
				else			{
					return -1;
				}
			}
		}
	}
	
	public boolean isSameMonthSameYear(MyDate d1, MyDate d2)
	{
		return d1.getYyyy() == d2.getYyyy() && 
				d1.getMm() == d2.getMm();
	}
	
	public int getDaysDiff_SameMonthSameYear(MyDate d1, MyDate d2)
	{
		return d2.getDd() - d1.getDd();
	}
	
	
	public boolean isDiffMonthSameYear(MyDate d1, MyDate d2)
	{
		return false;
	}
	
	public int getDaysDifference_DiffMonthSameYear(MyDate d1, MyDate d2)
	{
		//formulae
		
		return -1;
	}
	
	public boolean isDiffMonthDiffYear(MyDate d1, MyDate d2)
	{
		return false;
	}
	
	public int getDaysDifference_DiffMonthDiffYear(MyDate d1, MyDate d2)
	{
		return -1;
	}
	
	public boolean isLeapYear(int yyyy)
	{
		return false;
	}
}


public class TestDaysDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
