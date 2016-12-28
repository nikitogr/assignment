package assignment;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.JButton;


public class SB extends JFrame implements ActionListener {

	private static final long serialVersionUID = 5183060913822208215L;

	private JPanel contentPane; //Main Panel
	static SB sbframe = new SB(); //I need only one instance of sbframe in the main
	
	//This is the main program. It sets class SB frame named 'sbframe' to visible.
	/**
	 * Launch the application...
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sbframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//Let the windowbuilder generate its constructor for class SB
	/**
	 * Create the frame.
	 */
	public SB() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SB.class.getResource("/images/Untitled design.png")));
		lblNewLabel.setBounds(0, 0, 437, 70);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(UIManager.getColor("Button.focus"));
		separator.setBounds(0, 70, 434, 1);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("New Records");
		btnNewButton.setBounds(158, 124, 120, 30);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent b){
				
				dispose();
				Recordswrite thirdframe = new Recordswrite();
				thirdframe.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Open Records");
		btnNewButton_1.setBounds(158, 166, 120, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.setBounds(338, 237, 89, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				dispose();
				StartPage firstframe= new StartPage();
				firstframe.setVisible(true);
			}
		});
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
