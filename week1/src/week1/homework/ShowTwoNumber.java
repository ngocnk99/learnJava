package week1.homework;

import javax.swing.JOptionPane;

public class ShowTwoNumber {

	public static void main(String[] args) {
		String num1, num2;
		String notification = "You've just entered : ";

		num1 = JOptionPane.showInputDialog(null, "Input the first number:", JOptionPane.INFORMATION_MESSAGE);
		num2 = JOptionPane.showInputDialog(null, "Input the second number:", JOptionPane.INFORMATION_MESSAGE);
		
		notification += num1 + " and " + num2;
		
		JOptionPane.showMessageDialog(null, notification, "Result:", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
