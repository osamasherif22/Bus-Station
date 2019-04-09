import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class PassengerView extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public PassengerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSelectTrip = new JButton("Select Trip");
		btnSelectTrip.setBackground(UIManager.getColor("info"));
		btnSelectTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectTrip SelectTrip = new SelectTrip();	
				setVisible(false);
				SelectTrip.setVisible(true);
			}
		});
		btnSelectTrip.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnSelectTrip.setBounds(126, 99, 169, 33);
		contentPane.add(btnSelectTrip);
		
		JButton btnReviewTrips = new JButton("Review Trips");
		btnReviewTrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnReviewTrips.setBackground(UIManager.getColor("info"));
		btnReviewTrips.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnReviewTrips.setBounds(126, 152, 169, 33);
		contentPane.add(btnReviewTrips);
		
		JButton btnExit = new JButton("Logout");
		btnExit.setBackground(UIManager.getColor("info"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Entry Entry =new Entry() ;
				setVisible(false);
				Entry.setVisible(true);
					
			}
		});
		btnExit.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnExit.setBounds(170, 217, 89, 22);
		contentPane.add(btnExit);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Courier New", Font.BOLD, 15));
		lblUsername.setBounds(58, 49, 100, 14);
		contentPane.add(lblUsername);
		
		JLabel lblExmohamed = new JLabel("ex.Mohamed");
		lblExmohamed.setFont(new Font("Cordia New", Font.PLAIN, 17));
		lblExmohamed.setBounds(181, 35, 78, 28);
		contentPane.add(lblExmohamed);
	}

}




