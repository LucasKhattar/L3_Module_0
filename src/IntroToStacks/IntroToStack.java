package IntroToStacks;

import java.util.PrimitiveIterator.OfDouble;
import java.util.Iterator;
import java.util.Random;
import java.util.Stack;
import java.util.stream.DoubleStream;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {

		Stack<Double> dub = new Stack<Double>();
		Random rand = new Random();
		Iterator<Double> d = rand.doubles(100).iterator();
		for (int i = 0; i < 100; i++) {

			dub.push(d.next() * 100);
		}

		String numberOne = JOptionPane.showInputDialog(null, "Enter a number 1-100");
		String numberTwo = JOptionPane.showInputDialog(null, "Enter another number 1-100");
		int one = Integer.parseInt(numberOne);
		int two = Integer.parseInt(numberTwo);
		if (one <= 100 && two <= 100 && one >= 1 && two >= 1) {
			for (int i = 0; i < 100; i++) {
				Double popy = dub.pop();
				if(one<=popy&&two>=popy) {
					System.out.println(popy);
				}
				else if(two<=popy&&one>=popy) {
					System.out.println(popy);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
