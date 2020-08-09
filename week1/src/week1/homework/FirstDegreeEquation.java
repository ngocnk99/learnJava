package week1.homework;

import javax.swing.JOptionPane;

public class FirstDegreeEquation {
	// ax + by = c
	private double a1, b1, c1;
	private double a2, b2, c2;

	public double getA1() {
		return a1;
	}

	public void setA1(double a1) {
		this.a1 = a1;
	}

	public double getB1() {
		return b1;
	}

	public void setB1(double b1) {
		this.b1 = b1;
	}

	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	public double getA2() {
		return a2;
	}

	public void setA2(double a2) {
		this.a2 = a2;
	}

	public double getB2() {
		return b2;
	}

	public void setB2(double b2) {
		this.b2 = b2;
	}

	public double getC2() {
		return c2;
	}

	public void setC2(double c2) {
		this.c2 = c2;
	}
	
	public double getX() {
		double det = ((a1) * (b2) - (b1) * (a2));  
	    return ((b2) * (c1) - (b1) * (c2)) / det;
	}
	
	public double getY() {
		double det = ((a1) * (b2) - (b1) * (a2));
	    return ((a1) * (c2) - (a2) * (c1)) / det;
		
	}

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Input in order a1, b1, c1, a2, b2, c2: ",
				JOptionPane.INFORMATION_MESSAGE);
		String[] baseNum = input.split(" ");
		FirstDegreeEquation demo = new FirstDegreeEquation();

		demo.setA1(Double.parseDouble(baseNum[0]));
		demo.setB1(Double.parseDouble(baseNum[1]));
		demo.setC1(Double.parseDouble(baseNum[2]));
		demo.setA2(Double.parseDouble(baseNum[3]));
		demo.setB2(Double.parseDouble(baseNum[4]));
		demo.setC2(Double.parseDouble(baseNum[5]));
		
		JOptionPane.showMessageDialog(null, "X: "+ demo.getX() +"\nY: " + demo.getY());
		
		System.exit(0);

	}
	

}
