package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ManagerView extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ManagerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAssignedTrips = new JButton("Assign Driver");
		btnAssignedTrips.setBackground(SystemColor.activeCaptionBorder);
		btnAssignedTrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAssignedTrips.setFont(new Font("Consolas", Font.BOLD, 18));
		btnAssignedTrips.setBounds(118, 144, 177, 44);
		contentPane.add(btnAssignedTrips);
		
		JLabel lblManagerProfile = new JLabel("Manager Profile");
		lblManagerProfile.setBounds(142, 31, 158, 32);
		contentPane.add(lblManagerProfile);
		
		JButton btnReviewAllTrips = new JButton("Review All Trips");
		btnReviewAllTrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewTrip reviewTrip = new ReviewTrip();
				setVisible(false);
				reviewTrip.setVisible(true);
			}
		});
		btnReviewAllTrips.setBackground(SystemColor.activeCaptionBorder);
		btnReviewAllTrips.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 18));
		btnReviewAllTrips.setBounds(101, 74, 214, 44);
		contentPane.add(btnReviewAllTrips);
		
		JButton btnPrevious = new JButton("Logout");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entry Entry =new Entry() ;
				setVisible(false);
				Entry.setVisible(true);
			}
		});
		btnPrevious.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnPrevious.setBounds(158, 227, 105, 23);
		contentPane.add(btnPrevious);
	}

}
