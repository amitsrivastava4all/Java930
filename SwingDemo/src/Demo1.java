import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Demo1 extends JFrame {
	ImageIcon icon = new ImageIcon(Demo1.class.getResource("icon.png"));
	Demo1(){
		JButton b1 = new JButton("OK1");
		JButton b2 = new JButton("OK2");
		JButton b3 = new JButton("OK3");
		JButton b4 = new JButton("OK4");
		JButton b5 = new JButton("OK5");
		this.setLayout(null);
		//this.setLayout(new GridLayout(3, 3));
		//this.setLayout(new FlowLayout());
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		b1.setBounds(10,10,70,50);
		b2.setBounds(90,10,70,50);
		
		//this.getContentPane().add(b1,BorderLayout.NORTH);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setTitle("My Frame-2015");
		this.setIconImage(icon.getImage());
	}

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.setVisible(true);
		
		
	

	}

}
