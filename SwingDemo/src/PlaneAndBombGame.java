import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;


public class PlaneAndBombGame extends JFrame {
	int XAxis=455 ;
	int YAxis=61 ;
	JLabel blastLbl = new JLabel("");
	int planeX =25;
	final int RIGHT_MOVE =39;
	final int LEFT_MOVE = 37;
	ImageIcon planeIcon = new ImageIcon(PlaneAndBombGame.class.getResource("plane.png"));
	ImageIcon bombIcon = new ImageIcon(PlaneAndBombGame.class.getResource("bomb.gif"));
	ImageIcon blastIcon = new ImageIcon(PlaneAndBombGame.class.getResource("blast.gif"));
	JLabel planelbl = new JLabel("");
	JLabel bomblabel = new JLabel("");
	private final JTextField textField = new JTextField();
	private final JLabel label = new JLabel("");
	private final JLabel rollingbomb = new JLabel("");
	public static void main(String[] args) {
		
					PlaneAndBombGame frame = new PlaneAndBombGame();
					frame.setVisible(true);
					frame.rollThisBomb();
				
	}

	/**
	 * Create the frame.
	 */
	public PlaneAndBombGame() {
		textField.setBounds(146, 187, 200, 50);
		textField.setColumns(10);
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				move(e.getKeyCode());
				//System.out.println("Key Press "+e.getKeyCode()+" "+e.getKeyChar());
			}
			
		});
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 448);
		getContentPane().setLayout(null);
		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				planelbl.setBounds(e.getX(),e.getY(),46,27);
			}
		});
		
		
		planelbl.setHorizontalAlignment(SwingConstants.RIGHT);
		planelbl.setIcon(planeIcon);
		planelbl.setBounds(25, 355, 46, 27);
		getContentPane().add(planelbl);
		
		
		bomblabel.setHorizontalAlignment(SwingConstants.LEFT);
		bomblabel.setIcon(bombIcon);
		bomblabel.setBounds(444, 355, 32, 27);
		getContentPane().add(bomblabel);
		
		
		blastLbl.setBounds(253, 25, 46, 14);
		getContentPane().add(blastLbl);
		blastLbl.setIcon(blastIcon);
		
		getContentPane().add(textField);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(466, 131, 32, 27);
		
		getContentPane().add(label);
		rollingbomb.setHorizontalAlignment(SwingConstants.LEFT);
		rollingbomb.setBounds(455, 61, 32, 27);
		
		getContentPane().add(rollingbomb);
		blastLbl.setVisible(false);
		this.setFocusable(true);
		rollingbomb.setIcon(bombIcon);
	}
	private void move(int moveValue){
		
		if(!doBlast()){
		if(moveValue==RIGHT_MOVE){
			planeX++;
		}
		else
		if(moveValue==LEFT_MOVE){	
			planeX--;
		}
		
		planelbl.setBounds(planeX, 355, 46, 27);
		textField.setText("P = "+planeX+" "+(bomblabel.getX()-(bomblabel.getWidth()/2))+" "+bomblabel.getAlignmentX());
		}
		
	}
	private boolean doBlast(){
		boolean isBlast = false;
		
		if((planelbl.getX()+(planelbl.getWidth()/2)) ==(bomblabel.getX()-(bomblabel.getWidth()/2)) && planelbl.getY()==bomblabel.getY()){
			blastLbl.setVisible(true);
			blastLbl.setBounds(planeX, bomblabel.getY()-20, 46, 27);
			planelbl.setVisible(false);
			bomblabel.setVisible(false);
			isBlast = true;
		}
		return isBlast;
	}
	
	private boolean rollThisBomb(){
		Timer timer = new Timer(100,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rollingbomb.setBounds(XAxis,YAxis,32,27);
				XAxis-=2;
				YAxis++;
				
			}
		});
		timer.start();
		return true;
	}
}
