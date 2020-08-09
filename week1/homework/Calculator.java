package week1.homework;

import javax.swing.JOptionPane;

public class Calculator {

	private double num1, num2;

	public double getNum1() {
		return num1;
	}

	public void setNum1() {
		String input = JOptionPane.showInputDialog(null, "Input the first number:");
		this.num1 = Double.parseDouble(input);
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2() {
		String input = JOptionPane.showInputDialog(null, "Input the second number:");
		this.num2 = Double.parseDouble(input);
		while (this.num2 == 0) {
			input = JOptionPane.showInputDialog(null, "Input the second number not equals 0:");
			this.num2 = Double.parseDouble(input);
		}
	}

	public double sum() {
		return num1 + num2;
	}

	public double different() {
		return num1 - num2;
	}

	public double product() {
		return num1 * num2;
	}

	public double quotient() {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Calculator demo = new Calculator();

		demo.setNum1();
		demo.setNum2();

		JOptionPane.showMessageDialog(null, "Sum: " + demo.sum() + "\nDifferent: " + demo.different() + "\nProduct: "
				+ demo.product() + "\nQuotient: " + demo.quotient(), "Result", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}

}
