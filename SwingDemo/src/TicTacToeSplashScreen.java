import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;


public class TicTacToeSplashScreen extends JWindow {
	int colorCode = 1;
	boolean isVisible = true;
	JLabel lblCreatedBy = new JLabel("Created By :  Java Batch 5 to 7");
	JProgressBar progressBar = new JProgressBar();
	int progressStart = 0;
	Timer timer;
	ImageIcon icon = new ImageIcon(TicTacToeSplashScreen.class.getResource("giphy.gif"));
	public static void main(String[] args) {
		
					TicTacToeSplashScreen frame = new TicTacToeSplashScreen();
					frame.setVisible(true);
					frame.doAnimation();
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToeSplashScreen() {
		getContentPane().setBackground(new Color(127, 255, 212));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 419);
		this.getContentPane().setLayout(null);
		
		JLabel mainlbl = new JLabel("");
		mainlbl.setIcon(icon);
		mainlbl.setBounds(25, 11, 515, 251);
		getContentPane().add(mainlbl);
		
		
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 18));
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.LIGHT_GRAY);
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(36, 284, 504, 40);
		getContentPane().add(progressBar);
		
		
		lblCreatedBy.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCreatedBy.setBounds(150, 342, 360, 50);
		getContentPane().add(lblCreatedBy);
	}
	private void doAnimation(){
		timer = new Timer(50,new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				lblCreatedBy.setVisible(isVisible);
				isVisible=!isVisible;
				switch(colorCode){
				case 1:
					lblCreatedBy.setForeground(Color.RED);
					break;
				case 2:
					lblCreatedBy.setForeground(Color.YELLOW);
					break;
				case 3:
					lblCreatedBy.setForeground(Color.GREEN);
					break;
				case 4:
					lblCreatedBy.setForeground(Color.CYAN);
					break;
				case 5:
					lblCreatedBy.setForeground(Color.ORANGE);
					break;
				case 6:
					lblCreatedBy.setForeground(Color.MAGENTA);
					break;
				case 7:
					lblCreatedBy.setForeground(Color.PINK);
					break;
				}
				if(colorCode>=7){
					colorCode = 1;
				}
				else
				{
					colorCode++;
				}
				if(progressStart<100){
					progressStart++;
					progressBar.setValue(progressStart);
				}
				if(progressStart>=100){
					GameChooser chooser  = new GameChooser();
					chooser.setVisible(true);
					TicTacToeSplashScreen.this.setVisible(false);
					timer.stop();
				}
			}
		});
		timer.start();
	}
}
