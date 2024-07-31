import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminSignup {

	private JFrame frame;
	private JTextField txtfirstname;
	private JTextField txtlastname;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField txtconfirmpassword;
	private JPasswordField passwordField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSignup window = new AdminSignup();
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
	public AdminSignup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			Toolkit kit= Toolkit.getDefaultToolkit();
			Dimension dim= kit.getScreenSize();
			int width=(int)dim.getWidth();
			int height=(int)dim.getHeight();
			frame.setSize(565, 798);
			frame.setLocationRelativeTo(null);
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
			
			JLabel lblNewLabel_1_1_2_1 = new JLabel("Profile Picture");
			lblNewLabel_1_1_2_1.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_1_2_1.setBounds(32, 609, 136, 33);
			frame.getContentPane().add(lblNewLabel_1_1_2_1);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Picsart_24-02-05_17-11-15-904 - Copy.png"));
			lblNewLabel.setBounds(0, 0, 118, 119);
			frame.getContentPane().add(lblNewLabel);
			
			JTextArea textArea = new JTextArea();
			textArea.setFont(new Font("Georgia", Font.PLAIN, 20));
			textArea.setBounds(161, 310, 358, 76);
			frame.getContentPane().add(textArea);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Georgia", Font.PLAIN, 20));
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(152, 403, 87, 33);
			frame.getContentPane().add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setFont(new Font("Georgia", Font.PLAIN, 20));
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setBounds(241, 403, 91, 33);
			frame.getContentPane().add(rdbtnFemale);
			
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(161, 439, 171, 25);
			frame.getContentPane().add(dateChooser);
			
		
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Georgia", Font.PLAIN, 20));
			textField_2.setColumns(10);
			textField_2.setBounds(161, 480, 358, 34);
			frame.getContentPane().add(textField_2);
			
			passwordField = new JPasswordField();
			passwordField.setFont(new Font("Georgia", Font.PLAIN, 20));
			passwordField.setBounds(221, 523, 298, 33);
			frame.getContentPane().add(passwordField);
			
			txtfirstname = new JTextField();
			txtfirstname.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtfirstname.setColumns(10);
			txtfirstname.setBounds(161, 173, 358, 34);
			frame.getContentPane().add(txtfirstname);
			
			txtlastname = new JTextField();
			txtlastname.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtlastname.setColumns(10);
			txtlastname.setBounds(161, 216, 358, 34);
			frame.getContentPane().add(txtlastname);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Georgia", Font.PLAIN, 20));
			textField_2.setColumns(10);
			textField_2.setBounds(161, 260, 358, 34);
			frame.getContentPane().add(textField_2);
			
			txtconfirmpassword = new JPasswordField();
			txtconfirmpassword.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtconfirmpassword.setBounds(219, 566, 298, 33);
			frame.getContentPane().add(txtconfirmpassword);
			
			passwordField_1 = new JPasswordField();
			passwordField_1.setFont(new Font("Georgia", Font.PLAIN, 20));
			passwordField_1.setBounds(221, 523, 298, 33);
			frame.getContentPane().add(passwordField_1);
			
//			JLabel lblNewLabel_3 = new JLabel("");
//			lblNewLabel_3.setBounds(0, 0, 551, 716);
//			frame.getContentPane().add(lblNewLabel_3);
			
			JButton btnlogin = new JButton("SIGNUP");
			btnlogin.setFont(new Font("Georgia", Font.BOLD, 16));
			btnlogin.setBounds(18, 675, 150, 31);
			frame.getContentPane().add(btnlogin);
			
			JButton btnReset = new JButton("RESET");
			btnReset.setFont(new Font("Georgia", Font.BOLD, 16));
			btnReset.setBounds(214, 675, 150, 31);
			frame.getContentPane().add(btnReset);
			
			JButton btnexit = new JButton("BACK");
			btnexit.setFont(new Font("Georgia", Font.BOLD, 16));
			btnexit.setBounds(391, 675, 150, 31);
			frame.getContentPane().add(btnexit);
			
			JButton btnNewButton = new JButton("Add image");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProfilePicture.main(null);
				}
			});
			btnNewButton.setBounds(229, 618, 135, 25);
			frame.getContentPane().add(btnNewButton);
		
	}
}
