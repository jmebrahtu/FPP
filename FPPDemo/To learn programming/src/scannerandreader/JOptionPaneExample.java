package scannerandreader;

import javax.swing.JOptionPane;

public class JOptionPaneExample {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Type " +
				       "your name");
		System.out.println(input);
	}

}
