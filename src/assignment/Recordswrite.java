package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;

public class Recordswrite extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recordswrite frame = new Recordswrite();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Recordswrite() {
		setBackground(new Color(0, 153, 255));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 318);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(362, 71, 131, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CREATE A NEW RECORD");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 503, 14);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 38, 505, 1);
		contentPane.add(separator);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(13, 123, 192, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(221, 71, 131, 26);
		contentPane.add(textField_2);
		
		JLabel lblStudentId = new JLabel("First Name");
		lblStudentId.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentId.setBounds(224, 57, 122, 14);
		contentPane.add(lblStudentId);
		
		JLabel lblStudentId_1 = new JLabel(" Student ID");
		lblStudentId_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentId_1.setBounds(13, 57, 128, 14);
		contentPane.add(lblStudentId_1);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setBounds(364, 57, 122, 14);
		contentPane.add(lblLastName);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(13, 71, 131, 26);
		contentPane.add(textField_3);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setBounds(16, 108, 189, 14);
		contentPane.add(lblAddress);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(338, 123, 91, 26);
		contentPane.add(textField_4);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setBounds(342, 108, 87, 14);
		contentPane.add(lblCity);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(439, 123, 54, 26);
		contentPane.add(textField_5);
		
		JLabel lblPostcode = new JLabel("Postcode");
		lblPostcode.setHorizontalAlignment(SwingConstants.LEFT);
		lblPostcode.setBounds(440, 108, 62, 14);
		contentPane.add(lblPostcode);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(222, 123, 105, 26);
		contentPane.add(textField_6);
		
		JLabel label = new JLabel("Address");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(224, 108, 102, 14);
		contentPane.add(label);
	}
}
