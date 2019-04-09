import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class ReviewTrip extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public ReviewTrip() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddTrip = new JButton("Add Trip");
		btnAddTrip.setBounds(317, 227, 89, 23);
		contentPane.add(btnAddTrip);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(152, 227, 89, 23);
		contentPane.add(btnRemove);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(10, 227, 89, 23);
		contentPane.add(btnPrevious);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(26, 36, 380, 20);
		contentPane.add(comboBox);
		
		JLabel lblReviewAllTrips = new JLabel("Review All Trips");
		lblReviewAllTrips.setFont(new Font("Tillana ExtraBold", Font.PLAIN, 14));
		lblReviewAllTrips.setBounds(126, 0, 155, 39);
		contentPane.add(lblReviewAllTrips);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setFont(new Font("SimSun-ExtB", Font.PLAIN, 15));
		lblDestination.setBounds(25, 83, 96, 16);
		contentPane.add(lblDestination);
		
		JLabel lblNewLabel = new JLabel("vehicle:");
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.PLAIN, 15));
		lblNewLabel.setBounds(36, 108, 64, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("SimSun-ExtB", Font.PLAIN, 15));
		lblTime.setBounds(46, 135, 40, 16);
		contentPane.add(lblTime);
	}
}
