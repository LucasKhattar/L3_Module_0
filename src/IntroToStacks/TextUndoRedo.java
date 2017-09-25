package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	Stack<Character> del = new Stack<Character>();

	public TextUndoRedo() {

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
		tur.main();

	}

	void main() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.setSize(500, 50);
		frame.addKeyListener(this);
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if(label.getText().length()==0){
				JOptionPane.showMessageDialog(null, "There is nothing to delete");
			}
			String x = label.getText();
			char c = x.charAt(x.length()-1);
			String y = x.substring(0, x.length() - 1);
			label.setText(y);
			del.push(c);
		} else if (e.getKeyCode() == KeyEvent.VK_DELETE) {
			if(del.isEmpty()){
				JOptionPane.showMessageDialog(null, "There is nothing to undo");
			}
			char pop = del.pop();
			label.setText(label.getText() + pop);
		} else {

			label.setText(label.getText() + e.getKeyChar());
		}
	}

	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
