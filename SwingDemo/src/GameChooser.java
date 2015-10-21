import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GameChooser extends JFrame {
	ButtonGroup bg = new ButtonGroup();
	JRadioButton rdbtnX = new JRadioButton("X");
	JRadioButton rdbtnZero = new JRadioButton("Zero");
	ImageIcon icon = new ImageIcon(GameChooser.class.getResource("playbutton.png"));
	public static void main(String[] args) {
		
					GameChooser frame = new GameChooser();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public GameChooser() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 139);
		this.getContentPane().setLayout(null);
		
		
		rdbtnX.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnX.setBounds(92, 42, 76, 50);
		getContentPane().add(rdbtnX);
		
		
		rdbtnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnZero.setBounds(202, 42, 82, 50);
		getContentPane().add(rdbtnZero);
		
		JLabel lblSelectYourOption = new JLabel("Select Your Option");
		lblSelectYourOption.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSelectYourOption.setBounds(47, 0, 200, 50);
		getContentPane().add(lblSelectYourOption);
		
		JButton btnStartGame = new JButton("");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGame();
				
			}
		});
		btnStartGame.setToolTipText("Click to Start Game");
		btnStartGame.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnStartGame.setBounds(307, 42, 76, 50);
		btnStartGame.setIcon(icon);
		getContentPane().add(btnStartGame);
		bg.add(rdbtnX);
		bg.add(rdbtnZero);
		
	}
	
	private void startGame(){
		String startingPoint = "0";
		if(rdbtnX.isSelected()){
			startingPoint="X";
		}
		TicTacToe obj = new TicTacToe(startingPoint);
		obj.setVisible(true);
		this.setVisible(false);
	}
}
