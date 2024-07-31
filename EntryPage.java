import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JSeparator;



public class EntryPage {

	private JFrame frmParamInfosystemMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntryPage window = new EntryPage();
					window.frmParamInfosystemMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmParamInfosystemMain = new JFrame();
		frmParamInfosystemMain.setTitle("PARAM Infosystem Main Entry Page");
		frmParamInfosystemMain.setBounds(100, 100, 1006, 589);
		frmParamInfosystemMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmParamInfosystemMain.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Param infosystem");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 39));
		lblNewLabel.setBounds(182, 79, 512, 54);
		frmParamInfosystemMain.getContentPane().add(lblNewLabel);
		
		
		JButton btnstaff = new JButton("ADMIN");
		btnstaff.setSelectedIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\abstract-template-design-blue-curved-paper-cut-background-vector.jpg"));
		btnstaff.setBackground(new Color(204, 255, 255));
		btnstaff.setFont(new Font("Georgia", Font.BOLD, 25));
		btnstaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Stafflogin.main(null);
			}
		});
		btnstaff.setIcon(null);
		btnstaff.setBounds(305, 305, 172, 47);
		frmParamInfosystemMain.getContentPane().add(btnstaff);
		
		JButton btnstudent = new JButton("STUDENT");
		btnstudent.setBackground(new Color(204, 255, 255));
		btnstudent.setFont(new Font("Georgia", Font.BOLD, 25));
		btnstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			StudentLogin.main(null);
			}
		});
		btnstudent.setIcon(null);
		btnstudent.setBounds(305, 241, 172, 54);
		frmParamInfosystemMain.getContentPane().add(btnstudent);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 523, 966, 2);
		frmParamInfosystemMain.getContentPane().add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(206, 117, 356, 2);
		frmParamInfosystemMain.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Call to find out more :-");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel_2.setBounds(82, 406, 302, 28);
		frmParamInfosystemMain.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tushar Chavan,");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(82, 457, 381, 28);
		frmParamInfosystemMain.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("9673329105,8999711680");
		lblNewLabel_2_2.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(82, 485, 270, 28);
		frmParamInfosystemMain.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Ambegaon - Vadgaon campus,pune");
		lblNewLabel_2_2_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(82, 434, 381, 28);
		frmParamInfosystemMain.getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Login As");
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 35));
		lblNewLabel_3.setBounds(103, 258, 342, 76);
		frmParamInfosystemMain.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("An Education Venture");
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_4.setBounds(267, 104, 342, 54);
		frmParamInfosystemMain.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Picsart_24-02-05_17-11-15-904.png"));
		lblNewLabel_1.setBounds(48, 42, 148, 150);
		frmParamInfosystemMain.getContentPane().add(lblNewLabel_1);
//		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(EntryPage.class.getResource("/images/abstract-template-design-blue-curved-paper-cut-background-vector (2).jpg")));
		lblNewLabel_5.setBounds(0, 0, 992, 552);
	    frmParamInfosystemMain.getContentPane().add(lblNewLabel_5);
	}
}
