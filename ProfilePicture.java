import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFileChooser;

public class ProfilePicture {

	private JFrame frmProfilePicture;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfilePicture window = new ProfilePicture();
					window.frmProfilePicture.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProfilePicture() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProfilePicture = new JFrame();
		frmProfilePicture.setTitle("Profile Picture");
		frmProfilePicture.setBounds(100, 100, 834, 650);
		frmProfilePicture.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProfilePicture.getContentPane().setLayout(null);
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogType(2);
		fileChooser.setDialogTitle("Choose Profile Picture(JPG or PNG)");
		fileChooser.setBounds(0, 0, 820, 613);
		frmProfilePicture.getContentPane().add(fileChooser);
	}

}
