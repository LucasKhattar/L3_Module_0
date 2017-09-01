package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	 String add;
	 ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook gbook = new GuestBook();
		gbook.CreateBook();
		
		
		
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
		viewNames.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (addName.equals(e.getSource())) {
			add	= JOptionPane.showInputDialog(null,"What Name Would You Like To Add To The Guest Book?");
			names.add(add);
		}
		if(viewNames.equals(e.getSource())){
			for (int i =1; i < names.size(); i++) {
				String s = names.get(i);
				System.out.println("Guest Book Names: "+s+" "+i); 
			}
			
		}
	}
}
