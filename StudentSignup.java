import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JDateChooser;



import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class StudentSignup {

	private JFrame frame;
	private JTextField txtfirstname;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtlastname;
	private JTextField txtmobileno;
	private JTextField txtemail;
	private JPasswordField txtpassword;
	private JPasswordField txtconfirmpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSignup window = new StudentSignup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentSignup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frame.setSize(484, 753);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	frame.setBounds(100, 100, 565, 753);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Param infosystem");
		lblNewLabel_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 30));
		lblNewLabel_2.setBounds(128, 25, 425, 54);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(146, 63, 305, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("An Education Venture");
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_4.setBounds(177, 47, 342, 54);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(32, 174, 110, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last  Name");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(32, 217, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile NO");
		lblNewLabel_1_2.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(32, 260, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(32, 303, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender ");
		lblNewLabel_1_4.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(32, 403, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("DOB");
		lblNewLabel_1_4_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_4_1.setBounds(32, 439, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Email");
		lblNewLabel_1_4_2.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_4_2.setBounds(32, 481, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(32, 523, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Confirm Password");
		lblNewLabel_1_1_2.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(32, 566, 177, 33);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Profile Photo");
		lblNewLabel_1_1_2_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1.setBounds(32, 610, 165, 33);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Picsart_24-02-05_17-11-15-904 - Copy.png"));
		lblNewLabel.setBounds(0, 0, 118, 119);
		frame.getContentPane().add(lblNewLabel);
		
		txtfirstname = new JTextField();
		txtfirstname.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtfirstname.setBounds(161, 173, 358, 34);
		frame.getContentPane().add(txtfirstname);
		txtfirstname.setColumns(10);
		
		JTextArea txtaddress = new JTextArea();
		txtaddress.setWrapStyleWord(true);
		txtaddress.setForeground(new Color(0, 0, 0));
		txtaddress.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtaddress.setBounds(161, 310, 358, 76);
		frame.getContentPane().add(txtaddress);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Georgia", Font.PLAIN, 20));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(152, 403, 87, 33);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Georgia", Font.PLAIN, 20));
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(241, 403, 91, 33);
		frame.getContentPane().add(rdbtnFemale);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(161, 439, 171, 25);
		frame.getContentPane().add(dateChooser);
		
		txtlastname = new JTextField();
		txtlastname.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtlastname.setColumns(10);
		txtlastname.setBounds(161, 216, 358, 34);
		frame.getContentPane().add(txtlastname);
		
		txtmobileno = new JTextField();
		txtmobileno.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtmobileno.setColumns(10);
		txtmobileno.setBounds(161, 260, 358, 34);
		frame.getContentPane().add(txtmobileno);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtemail.setColumns(10);
		txtemail.setBounds(161, 480, 358, 34);
		frame.getContentPane().add(txtemail);
		
		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtpassword.setBounds(221, 523, 298, 33);
		frame.getContentPane().add(txtpassword);
		
		txtconfirmpassword = new JPasswordField();
		txtconfirmpassword.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtconfirmpassword.setBounds(221, 566, 298, 33);
		frame.getContentPane().add(txtconfirmpassword);
		JLabel lblNewLabel_3 = new JLabel("SignUp Form");
		lblNewLabel_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(187, 100, 177, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 129, 531, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnexit = new JButton("BACK");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnexit.setFont(new Font("Georgia", Font.BOLD, 16));
		btnexit.setBounds(391, 675, 150, 31);
		frame.getContentPane().add(btnexit);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SSC", "HSC", "BCA", "BE", "ME", "MBA"}));
		comboBox.setFont(new Font("Georgia", Font.BOLD, 20));
		comboBox.setBounds(432, 434, 87, 30);
		frame.getContentPane().add(comboBox);

		
		
		JButton btnlogin = new JButton("SIGNUP");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String firstName=txtfirstname.getText();
				String lastName=txtlastname.getText();
				
				long mobile =Long.parseLong(txtmobileno.getText());
				
				String address =txtaddress.getText();
				
				
				System.out.println(firstName+"    "+ lastName+"   "+mobile+"   "+address);				
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String date=  sdf.format(dateChooser.getDate());
				
				System.out.println(date);
               String gender = null;
				
				if(rdbtnNewRadioButton.isSelected()) {
					
					gender="male";
					
				}else if(rdbtnFemale.isSelected()) {
					gender="female";
					
				}System.out.println(gender);
				String Email=txtemail.getText();
				System.out.println(Email);
				String Password= txtpassword.getText();
				System.out.println(Password);
				String ConfirmPassword=txtconfirmpassword.getText();
				System.out.println(ConfirmPassword);
               String degree=null;
				
				degree=(String)comboBox.getSelectedItem();
				
				System.out.println(degree);
				
				

				JDBCHandling db= new JDBCHandling();
				
				int status =db.insertData(firstName, lastName, mobile, address, gender, date, Email,Password,degree);
				
					
					
		
				if(status==1) {
					
					JOptionPane.showMessageDialog(null, "Data Updated");
					
				}else {
					JOptionPane.showMessageDialog(null, "Problem in Add data");
				}
				

				
				
				
				
				
				
			}
				
				
			
		});
		btnlogin.setFont(new Font("Georgia", Font.BOLD, 16));
		btnlogin.setBounds(10, 675, 150, 31);
		frame.getContentPane().add(btnlogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Georgia", Font.BOLD, 16));
		btnReset.setBounds(200, 675, 150, 31);
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton = new JButton("Add image");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfilePicture.main(null);
			}
		});
		btnNewButton.setBounds(225, 619, 135, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Degree");
		lblNewLabel_1_4_2_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_4_2_1.setBounds(358, 433, 64, 33);
		frame.getContentPane().add(lblNewLabel_1_4_2_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(StudentSignup.class.getResource("/images/signup.jpg")));
		lblNewLabel_5.setBounds(0, 0, 553, 716);
		frame.getContentPane().add(lblNewLabel_5);
		
		
	}
}
