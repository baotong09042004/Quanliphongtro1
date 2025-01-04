package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class View extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel jpnMenu;
	private JPanel jpnView;
	private JButton jbutton_QuanLiPhong;
	private JButton jbutton_QuanLiKhachHang;
	private JButton jbutton_QuanLiHoaDon;
    private JButton jbutton_DangXuat;
    private JLabel lblNewLabel;
	
 

	public View() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/Image/Exterior.png")));
		setTitle("TINY HOUSE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jpnMenu = new JPanel();
		jpnMenu.setBackground(new Color(154, 205, 50));
		jpnMenu.setBounds(0, 0, 208, 501);
		contentPane.add(jpnMenu);
		jpnMenu.setLayout(null);
		
		jbutton_QuanLiHoaDon = new JButton("Quản lí hóa đơn");
		jbutton_QuanLiHoaDon.setHorizontalAlignment(SwingConstants.LEFT);
		jbutton_QuanLiHoaDon.setIcon(new ImageIcon(View.class.getResource("/Image/Bill.png")));
		jbutton_QuanLiHoaDon.setForeground(new Color(107, 142, 35));
		jbutton_QuanLiHoaDon.setBounds(0, 266, 231, 100);
		jpnMenu.add(jbutton_QuanLiHoaDon);
		jbutton_QuanLiHoaDon.addActionListener(this);
		jbutton_QuanLiHoaDon.setBackground(new Color(176, 224, 230));
		jbutton_QuanLiHoaDon.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		jbutton_QuanLiPhong = new JButton("Quản lí phòng");
		jbutton_QuanLiPhong.setForeground(new Color(107, 142, 35));
		jbutton_QuanLiPhong.setIcon(new ImageIcon(View.class.getResource("/Image/Home.png")));
		jbutton_QuanLiPhong.setBounds(0, 21, 208, 100);
		jpnMenu.add(jbutton_QuanLiPhong);
		jbutton_QuanLiPhong.addActionListener(this);
		jbutton_QuanLiPhong.setBackground(new Color(176, 224, 230));
		jbutton_QuanLiPhong.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		jbutton_QuanLiKhachHang = new JButton("Quản lí khách hàng");
		jbutton_QuanLiKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
		jbutton_QuanLiKhachHang.setIcon(new ImageIcon(View.class.getResource("/Image/Female Profile.png")));
		jbutton_QuanLiKhachHang.setForeground(new Color(107, 142, 35));
		jbutton_QuanLiKhachHang.setBounds(0, 145, 231, 100);
		jpnMenu.add(jbutton_QuanLiKhachHang);
		jbutton_QuanLiKhachHang.addActionListener(this);
		jbutton_QuanLiKhachHang.setBackground(new Color(176, 224, 230));
		jbutton_QuanLiKhachHang.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		jbutton_DangXuat = new JButton("Đăng xuất");
		jbutton_DangXuat.setHorizontalAlignment(SwingConstants.LEFT);
		jbutton_DangXuat.setIcon(new ImageIcon(View.class.getResource("/Image/Logout.png")));
		jbutton_DangXuat.setForeground(new Color(107, 142, 35));
		jbutton_DangXuat.setBounds(0, 389, 208, 100);
		jpnMenu.add(jbutton_DangXuat);
		jbutton_DangXuat.addActionListener(this);
		jbutton_DangXuat.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbutton_DangXuat.setBackground(new Color(176, 224, 230));
		
		jpnView = new JPanel();
		jpnView.setBackground(Color.DARK_GRAY);
		jpnView.setBounds(211, 0, 852, 515);
		contentPane.add(jpnView);
		jpnView.setLayout(new BorderLayout());
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(View.class.getResource("/Image/hhhhdfcvcvzdxpng.png")));
		lblNewLabel.setBounds(0, 0, 848, 505);
		jpnView.add(lblNewLabel, BorderLayout.WEST);
		setVisible(true);
	    
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(e.getActionCommand().equals("Quản lí phòng")) {
		jpnView.removeAll();
		jpnView.add(new QuanLiPhongView());
		jpnView.revalidate();
		jpnView.repaint();
	}
	
	if(e.getActionCommand().equals("Quản lí khách hàng")) {
		jpnView.removeAll();
		jpnView.add(new QuanLiKhachHangView());
		jpnView.revalidate();
		jpnView.repaint();
		
	}
	if(e.getActionCommand().equals("Quản lí hóa đơn")) {
		jpnView.removeAll();
		jpnView.add(new QuanLiHoaDonView());
		jpnView.revalidate();
		jpnView.repaint();
		
	}
	if(e.getActionCommand().equals("Đăng xuất")) {
		System.exit(0);
	}
	}
}

