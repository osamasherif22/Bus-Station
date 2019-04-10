# Bus-Station
assignemnt2 on 4th ternm - JAVA Uing it's fundamentals
package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Files.*;
import algoritm.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Entry extends JFrame {

	private JPanel contentPane;
	private JLabel lblBusStaion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ReadFile file =new ReadFile();
		ArrayList<Trip> tripList = new ArrayList<>();
		file.openFile();
		file.readFile(tripList);
		file.closeFile();
	//	Customer ali = new Customer("ali","6017");

		//ArrayList<Trip> found =  ali.listTrips("alex","cairo", tripList);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entry frame = new Entry();
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
	public Entry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 479, 321);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBusStaion = new JLabel("Bus Station");
		lblBusStaion.setBackground(UIManager.getColor("text"));
		lblBusStaion.setForeground(SystemColor.text);
		lblBusStaion.setFont(new Font("Tillana ExtraBold", Font.BOLD | Font.ITALIC, 46));
		lblBusStaion.setBounds(66, -12, 333, 77);
		contentPane.add(lblBusStaion);
		
		JLabel lblPoweredBy = new JLabel("Powered By : Osama Sherif [6012] || Mohammed Aiman [6017] ");
		lblPoweredBy.setForeground(Color.BLACK);
		lblPoweredBy.setFont(new Font("Yu Mincho", Font.ITALIC, 12));
		lblPoweredBy.setBounds(49, 257, 389, 14);
		contentPane.add(lblPoweredBy);
		
		JRadioButton rdbtnEmpl = new JRadioButton("Manager");
		rdbtnEmpl.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		rdbtnEmpl.setBackground(SystemColor.activeCaption);
		rdbtnEmpl.setVerticalAlignment(SwingConstants.TOP);
		rdbtnEmpl.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnEmpl.setForeground(SystemColor.desktop);
		rdbtnEmpl.setBounds(159, 135, 85, 31);
		contentPane.add(rdbtnEmpl);
		
		JRadioButton rdbtnPassenger = new JRadioButton("Passenger");
		rdbtnPassenger.setForeground(SystemColor.desktop);
		rdbtnPassenger.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		rdbtnPassenger.setBackground(SystemColor.activeCaption);
		rdbtnPassenger.setBounds(159, 101, 95, 31);
		contentPane.add(rdbtnPassenger);

		JRadioButton rdbtnDriver = new JRadioButton("Driver");
		rdbtnDriver.setVerticalAlignment(SwingConstants.TOP);
		rdbtnDriver.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnDriver.setForeground(Color.BLACK);
		rdbtnDriver.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		rdbtnDriver.setBackground(SystemColor.activeCaption);
		rdbtnDriver.setBounds(282, 135, 69, 31);
		contentPane.add(rdbtnDriver);
		
		rdbtnEmpl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnEmpl.isSelected())
					rdbtnPassenger.setSelected(false);
				    rdbtnDriver.setSelected(false);

			}
		});
		rdbtnPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPassenger.isSelected())
					rdbtnEmpl.setSelected(false);
			        rdbtnDriver.setSelected(false);
			}
		});
		
		rdbtnDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDriver.isSelected())
					rdbtnEmpl.setSelected(false);
				rdbtnPassenger.setSelected(false);
			}
		});
		
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnNewButton.setBackground(UIManager.getColor("info"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean flagBoolean =false ;
				  if(rdbtnPassenger.isSelected()){
					    flagBoolean=true;
				        Details Details = new Details();
						setVisible(false);
						Details.setVisible(true);
				    }
				    if(rdbtnEmpl.isSelected()){
					    flagBoolean=true;
				    	MangerDetails mangerDetails = new MangerDetails();
						setVisible(false);
						mangerDetails.setVisible(true);
				    }
				    if(rdbtnDriver.isSelected()){
					    flagBoolean=true;
				    	DriverDetails driverDetails = new DriverDetails();
						setVisible(false);
						driverDetails.setVisible(true);
				    }
				    else if (flagBoolean ==false){	
					JOptionPane.showMessageDialog(contentPane, " Please, Choose Your account type ! ");
					}    
				
			}
		});
		btnNewButton.setBounds(144, 196, 151, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel lblEmployee = new JLabel("Employee:");
		lblEmployee.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		lblEmployee.setBounds(56, 142, 81, 16);
		contentPane.add(lblEmployee);
		
		JLabel lblLoginAs = new JLabel("Login As");
		lblLoginAs.setForeground(new Color(0, 0, 0));
		lblLoginAs.setFont(new Font("Calibri Light", Font.BOLD | Font.ITALIC, 27));
		lblLoginAs.setBounds(159, 64, 98, 34);
		contentPane.add(lblLoginAs);
	}
}

