package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSeparator;


public class StartPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	//private final Action action = new SwingAction();
	static StartPage firstframe = new StartPage();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//StartPage frame = new StartPage();
					firstframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame....
	 */
	public StartPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Welcome to Students Records");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 16, 444, 14);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		
		JLabel lblPleaseLogin = new JLabel("Please Login");
		lblPleaseLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseLogin.setBounds(0, 61, 444, 19);
		lblPleaseLogin.setForeground(new Color(255, 255, 255));
		lblPleaseLogin.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(67, 113, 69, 14);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(69, 143, 70, 14);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		txtUsername = new JTextField();
		txtUsername.setBounds(149, 104, 159, 28);
		txtUsername.setToolTipText("Insert provided username");
		txtUsername.setForeground(new Color(0, 51, 255));
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setFont(new Font("Arial Unicode MS", Font.PLAIN, 20));
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 137, 159, 28);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setToolTipText("Insert provided password");
		passwordField.setForeground(new Color(0, 51, 255));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTroubleLoggingIn = new JLabel("Trouble logging in?");
		lblTroubleLoggingIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTroubleLoggingIn.setBounds(0, 215, 444, 14);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(149, 176, 159, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				@SuppressWarnings("deprecation")//I dont like warnings
				String password = passwordField.getText();
				String username = txtUsername.getText();
				
				if (e.getSource()==btnNewButton)
				{
					if(username.equals("Admin") && password.equals("R3c0rd$")){
					dispose();
					SB sbframe= new SB();
					sbframe.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog (null, "Username or Password invalid", "Error!", JOptionPane.ERROR_MESSAGE);
					}
					} 
			}
		});
		btnNewButton.setToolTipText("Login to the application");
		contentPane.setLayout(null);
		contentPane.add(lblPleaseLogin);
		contentPane.add(lblPassword);
		contentPane.add(btnNewButton);
		contentPane.add(passwordField);
		contentPane.add(lblUsername);
		contentPane.add(txtUsername);
		contentPane.add(lblTroubleLoggingIn);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 41, 444, 1);
		contentPane.add(separator);
		
		JLabel lblIoannisNikitopoulos = new JLabel("Created by Ioannis Nikitopoulos");
		lblIoannisNikitopoulos.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblIoannisNikitopoulos.setForeground(Color.DARK_GRAY);
		lblIoannisNikitopoulos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIoannisNikitopoulos.setBounds(-133, 255, 444, 14);
		contentPane.add(lblIoannisNikitopoulos);
	}
}
