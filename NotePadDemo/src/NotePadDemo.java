import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
import java.awt.Font;


public class NotePadDemo extends JFrame {
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane();
	private JPanel contentPane;
	private final JMenu mnFile = new JMenu("File");
	JMenuItem mntmNew = new JMenuItem("New");
	JMenuItem mnOpen = new JMenuItem("Open");
	
	private final JMenuItem mntmSaveas = new JMenuItem("SaveAs");
	private final JMenuItem mntmPrint = new JMenuItem("Print");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	Icon saveIcon = new ImageIcon(NotePadDemo.class.getResource("save.png"));
	private final JMenuItem mntmSave = new JMenuItem("Save",saveIcon);
	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		// com.sun.java.swing.plaf.motif.MotifLookAndFeel
		// com.sun.java.swing.plaf.windows.WindowsLookAndFeel
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");			
		NotePadDemo frame = new NotePadDemo();
					frame.setVisible(true);
					
				
	}

	/**
	 * Create the frame.
	 */
	public NotePadDemo() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				windowClose(false);
			}
				
		});
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				scrollPane.setSize(NotePadDemo.this.getWidth()-30, NotePadDemo.this.getHeight()-70);
				textArea.setSize(NotePadDemo.this.getWidth()-30, NotePadDemo.this.getHeight()-70);
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		
		scrollPane.setBounds(10, 21, 414, 238);
		getContentPane().add(scrollPane);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 18));
		scrollPane.setViewportView(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);
		KeyStroke keyStrokeToNew
	    = KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowClose(true);
			}
		});
		mntmNew.setMnemonic('N');
	
		
		mnFile.add(mntmNew);
		mntmNew.setAccelerator(keyStrokeToNew);
		mnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openDialog();
			}
		});
		
		
		mnFile.add(mnOpen);
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveDialog();
			}
		});
		
		mnFile.add(mntmSave);
		 keyStrokeToNew
		    = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
		 mntmSave.setAccelerator(keyStrokeToNew);
		
		mnFile.add(mntmSaveas);
		mntmPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			showPrinter();
			}
		});
		
		mnFile.add(mntmPrint);
		
	
		JMenuItem foreColor = new JMenuItem("ForeGroundColor");
		foreColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeForeGround();
			}
		});
		foreColor.setMnemonic('E');
		JMenuItem BackColor = new JMenuItem("BackGroundColor");
		BackColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeBackGround();
			}
		});
		BackColor.setMnemonic('B');
		JMenu colorMB = new JMenu("Color");
		colorMB.setMnemonic('C');
		colorMB.add(foreColor);
		colorMB.add(BackColor);
		mnFile.add(colorMB);
		//mntmColor.add(colorMB);
		mnFile.addSeparator();
		mnFile.add(mntmExit);
	
		
		}
	private void openDialog(){
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(this);
		try {
			long startTime = System.currentTimeMillis();
			String result = ReadWriteOperation.readFile(chooser.getSelectedFile());
			long endTime = System.currentTimeMillis();
			System.out.println("Total Time Taken "+(endTime - startTime));
			
			textArea.setText(result);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Unable to open a file "+e);
			e.printStackTrace();
		}
		
	}
	private void saveDialog(){
		// System Calls
		JFileChooser chooser = new JFileChooser();
		chooser.showSaveDialog(this);
		System.out.println("Current Dir "+chooser.getCurrentDirectory());
		System.out.println("Selected File "+chooser.getSelectedFile());
		try {
			ReadWriteOperation.writeInAFile(chooser.getSelectedFile(), textArea.getText());
			this.setTitle(chooser.getSelectedFile().getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "Error During Save "+e);
			e.printStackTrace();
		}
	}
	private void showPrinter(){
		// System Calls
		PrinterJob pj = PrinterJob.getPrinterJob();
		PageFormat pf = pj.pageDialog(pj.defaultPage());
		if (pj.printDialog()) {
	        try {pj.print();}
	        catch (PrinterException exc) {
	            System.out.println(exc);
	         }
	     }   
	}
	
	private void changeForeGround(){
		Color selectedColor = JColorChooser.showDialog(this, "My Color Chooser", Color.RED);
		textArea.setForeground(selectedColor);
	}
	
	private void changeBackGround(){
		Color selectedColor = JColorChooser.showDialog(this, "My Color Chooser", Color.RED);
		textArea.setBackground(selectedColor);
	}
	
	private void windowClose(boolean isNew){
		if(textArea.getText().trim().length()>0){
			int choice = JOptionPane.showConfirmDialog(NotePadDemo.this, "Do u want to Save or Not","Notepad-2015",JOptionPane.YES_NO_CANCEL_OPTION);
			if(choice == JOptionPane.YES_OPTION){
				JFileChooser chooser = new JFileChooser();
				chooser.showSaveDialog(this);
				if(isNew){
					textArea.setText("");
				}
				else
				{
					this.setVisible(false);
					this.dispose();
				}
				//chooser.setVisible(true);
			}
			else
			if(choice == JOptionPane.NO_OPTION){
				if(isNew){
					textArea.setText("");
				}
				else{
				this.setVisible(false);
				this.dispose();
				}
				}
			else
			if(choice==JOptionPane.CANCEL_OPTION){
				return ;
			}
		}
		else
		{
			this.setVisible(false);
			this.dispose();
		}
	}
}
