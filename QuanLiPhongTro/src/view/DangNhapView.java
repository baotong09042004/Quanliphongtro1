package view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class DangNhapView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
 
	
	public DangNhapView() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(DangNhapView.class.getResource("/Image/Exterior.png")));
		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("TINY HOUSE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 527);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setForeground(new Color(218, 165, 32));
		btnDangNhap.setBackground(new Color(127, 255, 0));
		btnDangNhap.setHorizontalAlignment(SwingConstants.LEFT);
		btnDangNhap.setIcon(new ImageIcon(DangNhapView.class.getResource("/Image/icons8-key-50.png")));
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new View();
				DangNhapView.this.dispose();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDangNhap.setBounds(587, 262, 200, 35);
		contentPane.add(btnDangNhap);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 475, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DangNhapView.class.getResource("/Image/anh bia.png")));
		lblNewLabel.setBounds(0, 0, 474, 490);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chào mừng bạn đến với Tiny House ");
		lblNewLabel_1.setForeground(new Color(255, 248, 220));
		lblNewLabel_1.setIcon(new ImageIcon(DangNhapView.class.getResource("/Image/icons8-confetti-48.png")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(490, 72, 368, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hãy nhấn vào nút bên dưới để đăng nhập");
		lblNewLabel_2.setForeground(new Color(255, 248, 220));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(512, 127, 380, 21);
		contentPane.add(lblNewLabel_2);
		setVisible(true);
	}
}
