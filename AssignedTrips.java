import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.security.interfaces.RSAKey;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class AssignedTrips extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignedTrips frame = new AssignedTrips();
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
	public AssignedTrips() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] patternExamples = {
		         "dd MMMMM yyyy",
		         "dd.MM.yy",
		         "MM/dd/yy",
		         "yyyy.MM.dd G 'at' hh:mm:ss z",
		         "EEE, MMM d, ''yy",
		         "h:mm a",
		         "H:mm:ss:SSS",
		         "K:mm a,z",
		         "yyyy.MMMMM.dd GGG hh:mm aaa"
		};
		
		JComboBox patternList = new JComboBox(patternExamples);
		patternList.setEditable(true);
		patternList.setBounds(79, 25, 262, 20);
		contentPane.add(patternList);
	}
}
