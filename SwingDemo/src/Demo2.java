import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;


public class Demo2 extends JFrame {

	
	public static void main(String[] args) {
		
					Demo2 frame = new Demo2();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public Demo2() {
		getContentPane().setBackground(Color.CYAN);
		setTitle("My Frame");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setToolTipText("Click on OK");
		btnNewButton.setMnemonic('O');
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(126, 92, 89, 23);
		getContentPane().add(btnNewButton);
		
	}
}
