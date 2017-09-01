package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.HashMap;

public class LogSearch implements ActionListener {
	String in;
	String is;
	String name;

	public static void main(String[] args) {
		LogSearch log = new LogSearch();
		log.main();

	}

	HashMap<Integer, String> logs = new HashMap<Integer, String>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton search = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();

	void main() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(add);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		add.setText("Add Entry");
		search.setText("Search By ID");
		view.setText("View List");
		remove.setText("Remove Entry");
		frame.pack();
		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
	}

	/*
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (add.equals(e.getSource())) {
			is = JOptionPane.showInputDialog(null, "Enter ID Number");
			name = JOptionPane.showInputDialog(null, "What Name Would You Like To Add?");
			int id = Integer.parseInt(is);
			logs.put(id, name);
		}
		if(search.equals(e.getSource())) {
		in = JOptionPane.showInputDialog(null, "Enter the ID");
		int iz = Integer.parseInt(is);
			for(Integer i : logs.keySet()){
				if(iz==i){
					System.out.println("gfd");
				}
			}
		}
		if (view.equals(e.getSource())) {
			String names = "";
			for(Integer i : logs.keySet()){
				names += "ID: "+i+" Name: "+logs.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null, names);
		}
	}
}
