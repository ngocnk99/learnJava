package week1.homework;

import javax.swing.JOptionPane;

public class SecondDegreeEquation {
	// ax^2 + bx + c = 0
	private double a, b, c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public void solve() {
		if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "No solution");
            } else {
                JOptionPane.showMessageDialog(null, "x = " +  (-c / b));
            }
        }
		
        double delta = b*b - 4*a*c;
        double x1;
        double x2;

        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            JOptionPane.showMessageDialog(null, "x1 = x2 = " + x1);
        } else {
            JOptionPane.showMessageDialog(null, "No solution");
        }
	}
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Input in order a, b, c: ",
				JOptionPane.INFORMATION_MESSAGE);
		String[] baseNum = input.split(" ");
		SecondDegreeEquation demo = new SecondDegreeEquation();

		demo.setA(Double.parseDouble(baseNum[0]));
		demo.setB(Double.parseDouble(baseNum[1]));
		demo.setC(Double.parseDouble(baseNum[2]));
		
		demo.solve();
		
		System.exit(0);
	}
	

}
