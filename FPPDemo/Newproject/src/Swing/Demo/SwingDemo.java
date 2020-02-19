package Swing.Demo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.tools.javac.Main;

public class SwingDemo extends JFrame {
	public   SwingDemo(){
	
	
		JPanel main = new JPanel();
		main.setBackground(Color.BLUE);
		JButton btn= new JButton("ok");
		main.add(btn);
		JButton btncancel= new JButton("cancel");
		main.add(btncancel);
		add(main);
		add(btn);
		setTitle("Hello");
		setVisible(true);
		setSize(250,200);
	//btn.addActionListener( new JButton("ok") );
	}
public static void main(String[] args) {
	
	new SwingDemo();
}
public  class main implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}}