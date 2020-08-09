package de;
import java.util.Calendar;

import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private String mydate;
	
    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
    //getTime() returns the current date in default time zone
    Date date = calendar.getTime();
    private int curr_day = calendar.get(Calendar.DATE);
    //Note: +1 the month for current month
    private int curr_month = calendar.get(Calendar.MONTH) + 1;
    private int curr_year = calendar.get(Calendar.YEAR);
    

	public int getDay() {
		return day;
	}

	public int setDay(int day) {
		if(0 >= day || day > 31)
		{
			System.out.println("inserted day is incompatible");
			return 1;
		}
		
		this.day = day;
		return 0;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int setMonth(int month) {
		if(0 >= month || month > 12)
		{
			System.out.println("inserted month is incompatible");
			return 1;
		}
		this.month = month;
		
		return 0;
	}
	
	public int getYear() {
		return year;
	}
	
	public int setYear(int year) {
		if(0 >= year)
		{
			System.out.println("inserted year is incompatible");
			return 1;
		}
		
		this.year = year;
		return 0;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		int day, month, year;
		int check;
		
		do {
			System.out.print("Enter day:  "); day = sc.nextInt();
			check = this.setDay(day);
		}while(check == 1);
		
		do {
			System.out.print("Enter month: "); month = sc.nextInt();
			check = this.setMonth(month);
		}while(check == 1);
		
		do {
			System.out.print("Enter year: "); year = sc.nextInt();
			check = this.setYear(year);
		}while(check == 1);
		
		this.mydate = Integer.toString(this.curr_day) +"//" + Integer.toString(this.curr_month) + "//" + Integer.toString(this.curr_year);
		sc.close();
	}
	
	public void print()
	{
		System.out.println(this.mydate);
	}
	
}
