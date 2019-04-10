import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.time.DayOfWeek;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class Availabletrips extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Availabletrips frame = new Availabletrips();
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
	public Availabletrips() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAllAvailableTrips = new JLabel("All Available Trips");
		lblAllAvailableTrips.setForeground(Color.ORANGE);
		lblAllAvailableTrips.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 26));
		lblAllAvailableTrips.setBounds(72, 11, 277, 36);
		contentPane.add(lblAllAvailableTrips);
		
		JButton btnSelect = new JButton("Select ");
		btnSelect.setBackground(SystemColor.activeCaptionBorder);
		btnSelect.setBounds(295, 227, 89, 23);
		contentPane.add(btnSelect);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBackground(SystemColor.activeCaptionBorder);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrevious.setBounds(33, 227, 89, 23);
		contentPane.add(btnPrevious);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(DayOfWeek.values()));
		comboBox.setBounds(72, 91, 277, 20);
		contentPane.add(comboBox);
	}

}
