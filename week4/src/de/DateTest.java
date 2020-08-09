package de;


public class DateTest {
	public static void main(String[] args) {
		MyDate mydate = new MyDate();
		
		mydate.accept();
		
		// print my date
		System.out.println("My Date: " + Integer.toString(mydate.getDay()) + "//" + Integer.toString(mydate.getMonth()) + "//" + Integer.toString(mydate.getYear()));
		// print current date
		System.out.print("Current Date: ");
		mydate.print();
	}

}
