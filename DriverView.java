package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class DriverView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DriverView frame = new DriverView();
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
	public DriverView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAssignedTrips = new JButton("Assigned Trips");
		btnAssignedTrips.setBackground(SystemColor.activeCaptionBorder);
		btnAssignedTrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAssignedTrips.setFont(new Font("Consolas", Font.PLAIN, 19));
		btnAssignedTrips.setBounds(116, 147, 187, 44);
		contentPane.add(btnAssignedTrips);
		
		JLabel lblDriverName = new JLabel("Driver Name: **********");
		lblDriverName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDriverName.setBounds(87, 57, 216, 62);
		contentPane.add(lblDriverName);
		
		JButton btnPrevious = new JButton("Logout");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entry Entry =new Entry() ;
				setVisible(false);
				Entry.setVisible(true);
			}
		});
		btnPrevious.setBounds(158, 227, 89, 23);
		contentPane.add(btnPrevious);
	}
}
