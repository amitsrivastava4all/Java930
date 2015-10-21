import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TicTacToe extends JFrame implements ActionListener {
	private boolean isXorZero ;
	ImageIcon icon = new ImageIcon(TicTacToe.class.getResource("line.png"));	
	public static void main(String[] args) {
		
					/*TicTacToe frame = new TicTacToe();
					frame.setVisible(true);*/
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe(String startingPoint) {
		if(startingPoint.equalsIgnoreCase("X")){
			isXorZero = true;
		}
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.getContentPane().setLayout(null);
		
		JButton one = new JButton("");
		one.setBounds(58, 53, 89, 35);
		getContentPane().add(one);
		one.addActionListener(this);
		
		JButton two = new JButton("");
		two.setBounds(178, 53, 89, 35);
		getContentPane().add(two);
		two.addActionListener(this);
		JButton three = new JButton("");
		three.setBounds(294, 53, 89, 35);
		getContentPane().add(three);
		three.addActionListener(this);
		JButton four = new JButton("");
		four.setBounds(58, 118, 89, 35);
		getContentPane().add(four);
		four.addActionListener(this);
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(icon);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		lblNewLabel.setBounds(157, 18, 2, 231);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		label.setBackground(Color.BLACK);
		label.setBounds(277, 18, 2, 231);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setOpaque(true);
		label_1.setBorder(BorderFactory.createLineBorder(Color.black));
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(38, 105, 355, 2);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBorder(BorderFactory.createLineBorder(Color.black));
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(38, 185, 355, 2);
		getContentPane().add(label_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().trim().length()==0){
		if(isXorZero){
			b.setText("X");
			//isXorZero = false;
		}
		else
		{
			b.setText("0");
			//isXorZero = true;
		}
		isXorZero = ! isXorZero;
		}
		
		
	}
}
