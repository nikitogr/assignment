package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.JButton;


public class SB extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private JPanel contentPane; //Main Panel
	private JButton btnNewButton_2, btnNewButton; //variables
	static SB sbframe = new SB(); //I need only one instance of sbframe in the main
	
	//This is the main program. It sets class SB frame named 'sbframe' to visible.
	/**
	 * Launch the application.
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
		btnNewButton.addActionListener(this);
		
		JButton btnNewButton_1 = new JButton("Open Records");
		btnNewButton_1.setBounds(158, 166, 120, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.setBounds(338, 237, 89, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
	}
		
	public void actionPerformed(ActionEvent click) //added click event as I have multiple sources meaning buttons

	{
		Object source = click.getSource(); //Anything below that is triggered by a click, will do that	
		
				if (source==btnNewButton_2) //if logout btn is pressed, close this frame and get the first one, the login page
				{
					sbframe.dispose();
					StartPage firstframe= new StartPage();
					firstframe.setVisible(true);
				}	
					if(source==btnNewButton)
					{
						dispose();
						Recordswrite thirdframe = new Recordswrite();
						thirdframe.setVisible(true);
					}
			}
}
