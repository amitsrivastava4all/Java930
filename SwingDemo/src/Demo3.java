import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Demo3 extends JFrame implements ActionListener {
	JButton btnOk = new JButton("Ok");
	JButton btnCancel = new JButton("Cancel");
	@Override
	public void actionPerformed(ActionEvent e ){
		String msg  = "U Click on ";
		if(btnOk==e.getSource()){
			msg = msg + e.getActionCommand();
		}
		else
		if(btnCancel==e.getSource()){
			msg = msg + e.getActionCommand();
		}
		JOptionPane.showMessageDialog(this, msg);
	}
	
	public static void main(String[] args) {
		
					Demo3 frame = new Demo3();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public Demo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.getContentPane().setLayout(null);
		
		
		btnOk.addActionListener(this);
		btnOk.setToolTipText("click on ok");
		btnOk.setMnemonic('O');
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOk.setBounds(70, 95, 89, 23);
		getContentPane().add(btnOk);
		
		
		btnCancel.addActionListener(this);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBounds(186, 95, 89, 23);
		getContentPane().add(btnCancel);
		
	}
}
