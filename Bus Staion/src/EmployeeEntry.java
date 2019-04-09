import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class EmployeeEntry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeEntry frame = new EmployeeEntry();
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
	public EmployeeEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeType = new JLabel("Employee Type ");
		lblEmployeeType.setForeground(Color.ORANGE);
		lblEmployeeType.setFont(new Font("Tillana ExtraBold", Font.BOLD | Font.ITALIC, 24));
		lblEmployeeType.setBounds(90, 27, 234, 31);
		contentPane.add(lblEmployeeType);
		
		JRadioButton rdbtnDriver = new JRadioButton("Driver");
		rdbtnDriver.setBackground(SystemColor.activeCaption);
		rdbtnDriver.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		rdbtnDriver.setBounds(155, 136, 79, 39);
		contentPane.add(rdbtnDriver);
		
		JRadioButton rdbtnManager = new JRadioButton("Manager");
		rdbtnManager.setBackground(SystemColor.activeCaption);
		rdbtnManager.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		rdbtnManager.setBounds(155, 88, 110, 45);
		contentPane.add(rdbtnManager);
		
		JButton btnGo = new JButton("Enter");
		btnGo.setBackground(SystemColor.activeCaptionBorder);
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnDriver.isSelected()){
			        DriverDetails DriverDetails = new DriverDetails();	
					setVisible(false);
					DriverDetails.setVisible(true);
			    }
			    if(rdbtnManager.isSelected()){
			    	MangerDetails MangerDetails = new MangerDetails();
					setVisible(false);
					MangerDetails.setVisible(true);
			    }
			
			}
		});
		btnGo.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnGo.setBounds(112, 198, 182, 22);
		contentPane.add(btnGo);
		
		JButton btnNewButton = new JButton("Previous");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Entry entry = new Entry();
				setVisible(false);
				entry.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnNewButton.setBounds(122, 227, 161, 23);
		contentPane.add(btnNewButton);
	}
}
