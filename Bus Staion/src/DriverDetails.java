import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;

public class DriverDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public DriverDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Driver Account");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Tillana ExtraBold", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(67, 24, 279, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(67, 77, 124, 34);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(174, 80, 145, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		lblPassword.setBounds(71, 137, 107, 32);
		contentPane.add(lblPassword);
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 137, 145, 32);
		contentPane.add(passwordField);
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(UIManager.getColor("info"));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
					boolean valdresult =AuthenticationDriver(textField.getText(),passwordField.getText());
					System.out.println(valdresult);
					if(valdresult)
					{DriverView DriverView = new DriverView();	
					setVisible(false);
					DriverView.setVisible(true);
					}
					else if(!valdresult)
						JOptionPane.showMessageDialog(contentPane, " Wrong Username Or Password !! ");
					
			}
		});
		btnLogin.setFont(new Font("Consolas", Font.PLAIN, 18));
		btnLogin.setBounds(159, 182, 118, 34);
		contentPane.add(btnLogin);
		
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBackground(UIManager.getColor("info"));
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Entry Entry =new Entry() ;
				setVisible(false);
				Entry.setVisible(true);
				
			}
		});
		btnPrevious.setBounds(171, 227, 89, 23);
		contentPane.add(btnPrevious);
	}
	static Boolean AuthenticationDriver(String username,String password) {
		System.out.printf("%s\n",username);
		System.out.printf("%s\n",password);
		/* This is how to declare HashMap */
	    HashMap<String, String> hmap = new HashMap<String, String>();
	    /*Adding elements to HashMap*/
	    hmap.put("ahmed", "200");  
	    String fetchedpass =hmap.get(username);
	    if (fetchedpass!=null) 
	    	return fetchedpass.equals(password) ;
	    else  return false ;
	}
}
