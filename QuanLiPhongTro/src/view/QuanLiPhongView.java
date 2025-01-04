package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import Database.PhongSQL;
import controller.PhongController;
import model.Phong;


import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class QuanLiPhongView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldMaPhong;
	private JTextField textFieldTang;
	private JTextField textFieldGiaThue;
	private JTextField textFieldSoLuongToiDa;
	private JTextField textFieldSoNguoiHienTai;
	private JTable tableDanhSachPhong; 

	public QuanLiPhongView() {
		setBackground(new Color(0, 128, 128));
		setLayout(null);
		ActionListener action=new PhongController(this);
		
		JPanel jpnTTCN = new JPanel();
		jpnTTCN.setBackground(new Color(0, 255, 102));
		jpnTTCN.setBounds(0, 0, 846, 218);
		add(jpnTTCN);
		jpnTTCN.setLayout(null);
		
		JPanel jpnCN = new JPanel();
		jpnCN.setBackground(new Color(169, 169, 169));
		jpnCN.setBounds(549, 40, 298, 178);
		jpnTTCN.add(jpnCN);
		jpnCN.setLayout(null);
		
		JButton jbtThemPhongTro = new JButton("Cập nhật phòng trọ");
		jbtThemPhongTro.setHorizontalAlignment(SwingConstants.LEFT);
		jbtThemPhongTro.setIcon(new ImageIcon(QuanLiPhongView.class.getResource("/Image/Download from the Cloud.png")));
		jbtThemPhongTro.setBackground(new Color(176, 224, 230));
		jbtThemPhongTro.setForeground(new Color(0, 0, 153));
		jbtThemPhongTro.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtThemPhongTro.setBounds(21, 10, 253, 49);
		jbtThemPhongTro.addActionListener(action);
		jpnCN.add(jbtThemPhongTro);
		
		JButton jbtXoaPhongTro = new JButton("Xóa phòng trọ");
		jbtXoaPhongTro.setIcon(new ImageIcon(QuanLiPhongView.class.getResource("/Image/delete.png")));
		jbtXoaPhongTro.setForeground(new Color(0, 0, 153));
		jbtXoaPhongTro.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtXoaPhongTro.setBackground(new Color(176, 224, 230));
		jbtXoaPhongTro.setBounds(21, 69, 253, 42);
		jbtXoaPhongTro.addActionListener(action);
		jpnCN.add(jbtXoaPhongTro);
		
		JButton jbtXoaform = new JButton("Xóa form");
		jbtXoaform.setIcon(new ImageIcon(QuanLiPhongView.class.getResource("/Image/Refresh.png")));
		jbtXoaform.setBounds(21, 121, 253, 47);
		jpnCN.add(jbtXoaform);
		jbtXoaform.setForeground(new Color(0, 0, 153));
		jbtXoaform.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtXoaform.setBackground(new Color(176, 224, 230));
		jbtXoaform.addActionListener(action);
		
		JPanel jpnTT = new JPanel();
		jpnTT.setBounds(10, 40, 539, 178);
		jpnTTCN.add(jpnTT);
		jpnTT.setForeground(new Color(102, 204, 255));
		jpnTT.setBackground(new Color(238, 232, 170));
		jpnTT.setLayout(null);
		
		textFieldMaPhong = new JTextField();
		textFieldMaPhong.setBounds(120, 10, 111, 24);
		jpnTT.add(textFieldMaPhong);
		textFieldMaPhong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldMaPhong.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mã phòng");
		lblNewLabel_1.setBounds(0, 4, 101, 38);
		jpnTT.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Tầng");
		lblNewLabel_3.setBounds(0, 52, 71, 24);
		jpnTT.add(lblNewLabel_3); 
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_8 = new JLabel("Giá thuê");
		lblNewLabel_8.setBounds(0, 97, 71, 16);
		jpnTT.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textFieldGiaThue = new JTextField();
		textFieldGiaThue.setBounds(120, 93, 111, 24);
		jpnTT.add(textFieldGiaThue);
		textFieldGiaThue.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldGiaThue.setColumns(10);
		
		textFieldTang = new JTextField();
		textFieldTang.setBounds(120, 52, 111, 24);
		jpnTT.add(textFieldTang);
		textFieldTang.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldTang.setColumns(10);
		
		textFieldSoLuongToiDa = new JTextField();
		textFieldSoLuongToiDa.setBounds(407, 10, 114, 24);
		jpnTT.add(textFieldSoLuongToiDa);
		textFieldSoLuongToiDa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldSoLuongToiDa.setColumns(10);
		
		textFieldSoNguoiHienTai = new JTextField();
		textFieldSoNguoiHienTai.setEditable(false);
		textFieldSoNguoiHienTai.setBounds(407, 52, 114, 24);
		jpnTT.add(textFieldSoNguoiHienTai);
		textFieldSoNguoiHienTai.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldSoNguoiHienTai.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Số người hiện tại");
		lblNewLabel_7.setBounds(241, 52, 144, 24);
		jpnTT.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_6 = new JLabel("Số lượng người tối đa");
		lblNewLabel_6.setBounds(241, 10, 174, 24);
		jpnTT.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		JLabel lblNewLabel = new JLabel("Quản lí phòng");
		lblNewLabel.setIcon(new ImageIcon(QuanLiPhongView.class.getResource("/Image/Room.png")));
		lblNewLabel.setBounds(317, 0, 202, 38);
		jpnTTCN.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(51, 0, 51));
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		tableDanhSachPhong=new JTable();
		tableDanhSachPhong.addMouseListener(new MouseAdapter(){
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            // Lấy chỉ số của dòng được nhấp
		            int selectedRow = tableDanhSachPhong.getSelectedRow();
		            // Kiểm tra xem có dòng được chọn không
		            if (selectedRow != -1) {
		                // Hiển thị thông tin của dòng được chọn
		                hienThiThongTinPhongDangChon();
		            }
		        }
		});
		tableDanhSachPhong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tableDanhSachPhong.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 ph\u00F2ng", "T\u1EA7ng", "Gi\u00E1 thu\u00EA", "S\u1ED1 l\u01B0\u1EE3ng ng\u01B0\u1EDDi t\u1ED1i \u0111a", "Số lượng người hiện tại"
			}
		));
		JScrollPane scrollPane = new JScrollPane(tableDanhSachPhong);
		scrollPane.setBounds(10, 300, 828, 138);
		add(scrollPane);
		hienThiDulieu();
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 228, 848, 2);
		add(separator);
		
		JButton jbtTimMaPhong = new JButton("Tìm phòng theo mã");
		jbtTimMaPhong.setIcon(new ImageIcon(QuanLiPhongView.class.getResource("/Image/icons8-search-32.png")));
		jbtTimMaPhong.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtTimMaPhong.setForeground(new Color(0, 0, 0));
		jbtTimMaPhong.setBackground(new Color(175, 238, 238));
		jbtTimMaPhong.setBounds(26, 240, 228, 33);
		jbtTimMaPhong.addActionListener(action);
		add(jbtTimMaPhong);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 461, 848, 2);
		add(separator_1);
		
		JButton jbtHuyTimKiem = new JButton("Hiển thị dữ liệu");
		jbtHuyTimKiem.setHorizontalAlignment(SwingConstants.LEFT);
		jbtHuyTimKiem.setIcon(new ImageIcon(QuanLiPhongView.class.getResource("/Image/Upload to the Cloud.png")));
		jbtHuyTimKiem.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtHuyTimKiem.setBounds(284, 240, 228, 32);
		jbtHuyTimKiem.addActionListener(action);
		add(jbtHuyTimKiem);
		
        setVisible(true);
	}
	  public void xoaFrom() {
			textFieldMaPhong.setText("");
			textFieldTang.setText("");
			textFieldGiaThue.setText("");
			textFieldSoLuongToiDa.setText("");
			textFieldSoNguoiHienTai.setText("");
		}
	    //
	    public void addPhongTable(Phong p) {
	    	DefaultTableModel model = (DefaultTableModel) tableDanhSachPhong.getModel();
	    	model.addRow(new Object[] {p.getMaPhong()+"" , p.getTang(), p.getGiaPhong(), p.getSLNguoiMax(), p.getSoLuongHienTai()});
	    }
	    
	    //
	    public void addHoacCapNhatPhong(Phong p) {
	    	DefaultTableModel model_table = (DefaultTableModel) tableDanhSachPhong.getModel();
	    	if(!PhongSQL.kiemTraTonTaiMaPhong(p.getMaPhong())) {
	    		PhongSQL.insertPhong(p);
	    		this.addPhongTable(p);
	    	}else {
	    		PhongSQL.updatePhongVaoCoSoDuLieu(p);
	    		int soLuongDong = model_table.getRowCount();
	    		for(int i=0; i < soLuongDong; i++) {
	    			String id = model_table.getValueAt(i, 0)+"";
	    			if(id.equals(p.getMaPhong())) {
	    				model_table.setValueAt(p.getMaPhong()+"", i, 0);
	    				model_table.setValueAt(p.getTang(), i, 1);
	    				model_table.setValueAt(p.getGiaPhong(), i, 2);
	    				model_table.setValueAt(p.getSLNguoiMax(), i, 3);
	    			}
	    		}
	    	}
	    	
	    }
	    // add p
	    public void capNhatPhong() {
	    	try {
	    	String maPhong =String.valueOf(this.textFieldMaPhong.getText());
	    	int tang = Integer.valueOf(this.textFieldTang.getText());
	    	float giaPhong = Float.valueOf(this.textFieldGiaThue.getText());
	    	int slNguoiMax = Integer.valueOf(this.textFieldSoLuongToiDa.getText());
	    	Phong p = new Phong(maPhong, tang, giaPhong, slNguoiMax, 0);
	    	this.addHoacCapNhatPhong(p);
	    	JOptionPane.showMessageDialog(this, "Cập nhật phòng thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		    }catch(Exception e){
			   JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi cập nhật phòng:\n", "Lỗi",  JOptionPane.ERROR_MESSAGE, null);
		    }
	
	    }
	    //
	    public Phong getPhongDangChon() {
	    	DefaultTableModel model_table = (DefaultTableModel) tableDanhSachPhong.getModel();
	    	int i_row = tableDanhSachPhong.getSelectedRow();
	    	
	    	String maPhong = model_table.getValueAt(i_row, 0)+"";
	    	int tang = Integer.valueOf(model_table.getValueAt(i_row, 1) + "");
	    	float giaPhong = Float.valueOf(model_table.getValueAt(i_row, 2) + "");
	    	int slNguoiMax = Integer.valueOf(model_table.getValueAt(i_row, 3) + "");
	    	int  soLuongNguoiHienTai = Integer.valueOf(model_table.getValueAt(i_row, 4) + "");
	    	Phong p = new Phong(maPhong, tang, giaPhong, slNguoiMax, soLuongNguoiHienTai);
	    	
	    	return p;
	    }
	    public void hienThiThongTinPhongDangChon() {
			Phong p = getPhongDangChon();

			this.textFieldMaPhong.setText(p.getMaPhong()+ "");
			this.textFieldTang.setText(p.getTang()+ "");
			this.textFieldGiaThue.setText(p.getGiaPhong()+"");
			this.textFieldSoLuongToiDa.setText(p.getSLNguoiMax()+"");
			this.textFieldSoNguoiHienTai.setText(p.getSoLuongHienTai()+"");
		}
	    // xóa p
	    public void deletePhong() {
	    	DefaultTableModel model_table = (DefaultTableModel) tableDanhSachPhong.getModel();
	    	int i_row = tableDanhSachPhong.getSelectedRow();
	    	int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa dòng đã chọn?");
	    	if(luaChon == JOptionPane.YES_OPTION) {
	    		Phong p = getPhongDangChon();
	    		PhongSQL.xoaPhongTheoMa(p.getMaPhong());
	    		model_table.removeRow(i_row);
	    	}
	    }
	    // tìm kiếm
	    public void hienThiDulieu() {	
	    	DefaultTableModel model_table = (DefaultTableModel) tableDanhSachPhong.getModel();
			model_table.setRowCount(0);
			PhongSQL.updateSoLuongNguoiHienTai();
	    	for(Phong p :  PhongSQL.getAllPhongSQL()) 
	    		this.addPhongTable(p);
	    }
	    public void timPhong(){
	    	String maP = String.valueOf(JOptionPane.showInputDialog(null, "Nhập mã phòng"));
	    		if (!maP.isEmpty()) {
	    			Phong phong=PhongSQL.timPhongTheoMa(maP);
	    			if(phong!=null) {
	    					DefaultTableModel model = (DefaultTableModel) tableDanhSachPhong.getModel();
	    					model.setRowCount(0);
	    					addPhongTable(phong);
	    			}
	    			else {
	    					JOptionPane.showMessageDialog(this, "Không tìm thấy phòng có mã " + maP);
	    			}
	    		}		
	     }
	          
	    
}
		
