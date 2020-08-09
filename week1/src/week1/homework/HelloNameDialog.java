package week1.homework;

import javax.swing.JOptionPane;

public class HelloNameDialog {

	public static void main(String[] args) {
		String result = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
		System.exit(0);
	}

}
