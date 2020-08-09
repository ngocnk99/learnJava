package calculator;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String choose; 
		int a = 0;
		do {
			menu();
			choose = s.nextLine();
			switch(choose) {
			case "1":				
				NormalCal();
				break;
			case "2":
				BMICal();
				break;
			case "3":	
				a = 1;
				System.out.print("successfully exited\n");
				break;
			default:	
				System.out.print("please re-enter\n" ); 
				break;
			}			
		}while(a != 1);
		s.close();
	}
	public static void menu() {
		System.out.print("=========== Calculator Program===========\n");
		System.out.print("1. Normal Calculator\n");
		System.out.print("2. BMI Calculator\n");
		System.out.print("3. Exit\n");
		System.out.print("Please choice one option\n");
	
	}
	
	public static void NormalCal() { // p1
		double a,b;
		String calculate,val;
		System.out.print("=========== Normal calculator===========\n");
		Scanner x = new Scanner(System.in);
// nhap so		
		do {
			System.out.print("Enter number:");
			val = x.nextLine();
			if (check(val) == null) {
				System.out.print("Input wrong(Please enter numeric)\n");
		    }
		}while(check(val) == null);
		a = check(val);


// nhap phep tinh
		do {
			System.out.print("Enter Operator:");
			calculate = x.nextLine();
			
			if(!checkOperator(calculate)){
				System.out.print("Please input(+,-,*,/,^)\n");
				System.out.print("Enter Operator:");
				calculate = x.nextLine();
			 }
		}while(!checkOperator(calculate));
//		
		if(calculate.equals("=")) {
			System.out.print("Result:"+a);
			System.out.print("\n");
		}else {
			do {
				b = a;
				do {
					System.out.print("Enter number:");
					val = x.nextLine();
					if (check(val) == null) {
						System.out.print("Input wrong(Please enter numeric)\n");
				    }
				}while(check(val) == null);
				b = check(val);
				
				a = calculate(a,calculate,b); // tinh
				
				System.out.print("Memory:"+a);
				System.out.print("\n");
				
				do {
					System.out.print("Enter Operator:");
					calculate = x.nextLine();
					
					if(!checkOperator(calculate)){
						System.out.print("Please input(+,-,*,/,^)\n");
						System.out.print("Enter Operator:");
						calculate = x.nextLine();
					 }
				}while(!checkOperator(calculate));
			}while(!calculate.equals("="));
			System.out.print("Result:" + a);
			System.out.print("\n");
		}	
	}
	
	public static double calculate(double a,String operator,double b) {// tinh va tra ve
		double memory = 0;
		switch (operator) {
		case "+":
			memory = a + b;
			break;
		case "-":
			memory = a - b;
			break;
		case "*":
			memory = a * b;
			break;
		case "/":
			memory = a / b;
			break;
		case "^":
			memory = Math.pow(a,b);
		default:
			break;
		}
		return memory;
	}
	
	public static Double check(String inputVal) { // check chuoi nhap vao co phai double khong
	    try{
	        Double.parseDouble(inputVal);
	    }catch(NumberFormatException e){
	    	return null;
	    }
		return Double.valueOf(inputVal);
	}
	
	public static boolean checkOperator(String operator) { // check ky tu nhap vao co phai phep toan khong
		if (operator.equals("+")|| operator.equals("-")|| operator.equals("*") || operator.equals("/")||operator.equals("^")||operator.equals("=")) {
			return true;
			}
		return false;
	}

	public static void BMICal() {//p2
		System.out.print("=========== BMI Calculator===========\n");
		double weight,height,number;
		String status,val;
		Scanner x = new Scanner(System.in);
		// nhap can nag	
				do {
					System.out.print("Enter weight(kg):");
					val = x.nextLine();
					if (check(val) == null) {
						System.out.print("Input wrong(Please enter digit)\n");
				    }
				}while(check(val) == null);
				weight = check(val);
				
				// nhap chieu cao
				do {
					System.out.print("Enter height(cm):");
					val = x.nextLine();
					if (check(val) == null) {
						System.out.print("Input wrong(Please enter digit)\n");
				    }
				}while(check(val) == null);
				height = check(val);
				
				calculateBMI(weight, height);
		
	}

	public static void calculateBMI(double weight, double height) {
		double BMI;
		BMI = weight*10000 /(height*height) ;
		System.out.print("BMI number:"+BMI+"\n");
		if (BMI >= 19&&BMI < 25) System.out.print("BMI status: chuan\n");
		if (BMI >= 25&&BMI<30) System.out.print("BMI status: thua can\n");
		if (BMI >= 30 && BMI < 40) System.out.print("BMI status: beo\n");
		if (BMI >= 40) System.out.print("BMI status: rat beo\n");
		if (BMI < 19) System.out.print("BMI status: duoi chuan\n");
		
		
	}
}

