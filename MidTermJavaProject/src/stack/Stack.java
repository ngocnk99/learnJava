package stack;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Stack {
	public LinkedList<String> stack = new LinkedList<String>();

	public void push(String str) {
		stack.addLast(str);
	}

	public void pop() {
		if (stack.isEmpty())
			JOptionPane.showMessageDialog(null, "Stack is EMPTY!");
		stack.pollFirst();
		System.out.println(stack.size());
	}

	public void deleteStack() {
		stack.clear();
	}
}
