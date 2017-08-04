package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	static String add;
	public static void main(String[] args) {
		GuestBook gbook = new GuestBook();
		gbook.CreateBook();
		ArrayList<String> names = new ArrayList<String>();
		
		names.add(add);
	}
	
	JButton addName = new JButton();
	JButton viewNames = new JButton();

	void CreateBook() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		addName.setText("Add Name");
		viewNames.setText("View Names");
		frame.pack();
		addName.addActionListener(this);
	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (addName.equals(e)) {
			System.out.println("gfsg");
			add	= JOptionPane.showInputDialog(null,"What Name Would You Like To Add To The Guest Book?");
		}
	}
}
