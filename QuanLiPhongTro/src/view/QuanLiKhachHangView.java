package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.KhachHangController;

import model.KhachHang;

import Database.KhachHangSQL;
import Database.PhongSQL;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

public class QuanLiKhachHangView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldMaKhachThue;
	private JTextField textFieldMaPhong;
	private JTextField textFieldHoTen;
	private JTextField textFieldSoCanCuoc;
	private JTextField textFieldSoDienThoai;
	private JTable tableDanhSachKhachThue;
	private JDateChooser jdcNgaySinh;


	public QuanLiKhachHangView() {
		setBackground(new Color(46, 139, 87));
		setLayout(null);
		
		ActionListener action = new KhachHangController(this);
		JPanel jpnTTCN = new JPanel();
		jpnTTCN.setBackground(new Color(127, 255, 0));
		jpnTTCN.setBounds(0, 0, 848, 218);
		add(jpnTTCN);
		jpnTTCN.setLayout(null);

		JPanel jpnCN = new JPanel();
		jpnCN.setBackground(new Color(214, 214, 214));
		jpnCN.setBounds(550, 48, 298, 170);
		jpnTTCN.add(jpnCN);
		jpnCN.setLayout(null);

		JButton jbtCapNhatKhachThue = new JButton("Cập nhật khách thuê");
		jbtCapNhatKhachThue.setHorizontalAlignment(SwingConstants.LEFT);
		jbtCapNhatKhachThue.setIcon(new ImageIcon(QuanLiKhachHangView.class.getResource("/Image/Download from the Cloud.png")));
		jbtCapNhatKhachThue.addActionListener(action);
		jbtCapNhatKhachThue.setBackground(new Color(176, 224, 230));
		jbtCapNhatKhachThue.setForeground(new Color(0, 0, 153));
		jbtCapNhatKhachThue.setFont(new Font("Tahoma", Font.BOLD, 17));
		jbtCapNhatKhachThue.setBounds(21, 18, 267, 44);
		jpnCN.add(jbtCapNhatKhachThue);

		JButton jbtXoaKhachThue = new JButton("Xóa khách thuê");
		jbtXoaKhachThue.setIcon(new ImageIcon(QuanLiKhachHangView.class.getResource("/Image/delete.png")));
		jbtXoaKhachThue.setForeground(new Color(0, 0, 153));
		jbtXoaKhachThue.setFont(new Font("Tahoma", Font.BOLD, 17));
		jbtXoaKhachThue.setBackground(new Color(176, 224, 230));
		jbtXoaKhachThue.setBounds(21, 72, 267, 44);
		jbtXoaKhachThue.addActionListener(action);
		jpnCN.add(jbtXoaKhachThue);

		JButton jbtXoaForm = new JButton("Xóa form");
		jbtXoaForm.setIcon(new ImageIcon(QuanLiKhachHangView.class.getResource("/Image/Refresh.png")));
		jbtXoaForm.setForeground(new Color(0, 0, 139));
		jbtXoaForm.setBackground(new Color(175, 238, 238));
		jbtXoaForm.setFont(new Font("Tahoma", Font.BOLD, 17));
		jbtXoaForm.setBounds(21, 126, 267, 42);
		jbtXoaForm.addActionListener(action);
		jpnCN.add(jbtXoaForm);

		JPanel jpnTT = new JPanel();
		jpnTT.setBounds(10, 48, 539, 170);
		jpnTTCN.add(jpnTT);
		jpnTT.setForeground(new Color(102, 204, 255));
		jpnTT.setBackground(new Color(173, 216, 230));
		jpnTT.setLayout(null);

		textFieldMaKhachThue = new JTextField();
		textFieldMaKhachThue.setBounds(120, 10, 111, 24);
		jpnTT.add(textFieldMaKhachThue);
		textFieldMaKhachThue.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldMaKhachThue.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Mã khách thuê");
		lblNewLabel_1.setBounds(0, 4, 123, 38);
		jpnTT.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblNewLabel_3 = new JLabel("Mã phòng");
		lblNewLabel_3.setBounds(0, 52, 88, 24);
		jpnTT.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblNewLabel_8 = new JLabel("Họ Tên");
		lblNewLabel_8.setBounds(0, 97, 71, 20);
		jpnTT.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));

		textFieldHoTen = new JTextField();
		textFieldHoTen.setBounds(120, 93, 111, 24);
		jpnTT.add(textFieldHoTen);
		textFieldHoTen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldHoTen.setColumns(10);

		textFieldMaPhong = new JTextField();
		textFieldMaPhong.setBounds(120, 52, 111, 24);
		jpnTT.add(textFieldMaPhong);
		textFieldMaPhong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldMaPhong.setColumns(10);

		textFieldSoDienThoai = new JTextField();
		textFieldSoDienThoai.setBounds(407, 52, 111, 24);
		jpnTT.add(textFieldSoDienThoai);
		textFieldSoDienThoai.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldSoDienThoai.setColumns(10);

		textFieldSoCanCuoc = new JTextField();
		textFieldSoCanCuoc.setBounds(404, 11, 114, 24);
		jpnTT.add(textFieldSoCanCuoc);
		textFieldSoCanCuoc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldSoCanCuoc.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Ngày sinh");
		lblNewLabel_7.setBounds(257, 93, 101, 24);
		jpnTT.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblNewLabel_5 = new JLabel("Số căn cước");
		lblNewLabel_5.setBounds(257, 11, 137, 22);
		jpnTT.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblNewLabel_6 = new JLabel("Số điện thoại");
		lblNewLabel_6.setBounds(257, 52, 123, 24);
		jpnTT.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		jdcNgaySinh = new JDateChooser();
		jdcNgaySinh.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 16));
		jdcNgaySinh.setDateFormatString("dd/MM/yyyy");
		jdcNgaySinh.setBounds(407, 93, 111, 24);
		jpnTT.add(jdcNgaySinh);

		JLabel lblNewLabel = new JLabel("Quản lí khách hàng");
		lblNewLabel.setIcon(new ImageIcon(QuanLiKhachHangView.class.getResource("/Image/People.png")));
		lblNewLabel.setBounds(304, 0, 271, 44);
		jpnTTCN.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(51, 0, 51));
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		tableDanhSachKhachThue = new JTable();
		tableDanhSachKhachThue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tableDanhSachKhachThue.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"M\u00E3 kh\u00E1ch thu\u00EA", "M\u00E3 ph\u00F2ng", "H\u1ECD T\u00EAn",
						"S\u1ED1 c\u0103n c\u01B0\u1EDBc", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Ng\u00E0y sinh"
				}));
		tableDanhSachKhachThue.getColumnModel().getColumn(5).setMinWidth(14);
		tableDanhSachKhachThue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Lấy chỉ số của dòng được nhấp
				int selectedRow = tableDanhSachKhachThue.getSelectedRow();
				// Kiểm tra xem có dòng được chọn không
				if (selectedRow != -1) {
					// Hiển thị thông tin của dòng được chọn
					hienThiThongTinKhachHangDaChon();
				}
			}
		});
		hienThiDuLieu();
		JScrollPane scrollPane = new JScrollPane(tableDanhSachKhachThue);
		scrollPane.setBounds(10, 297, 828, 150);
		add(scrollPane);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 228, 838, 2);
		add(separator);

		JButton jbtTimMaKhachHang = new JButton("Tìm theo mã khách hàng");
		jbtTimMaKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
		jbtTimMaKhachHang.setIcon(new ImageIcon(QuanLiKhachHangView.class.getResource("/Image/icons8-search-32.png")));
		jbtTimMaKhachHang.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtTimMaKhachHang.setForeground(new Color(0, 0, 0));
		jbtTimMaKhachHang.setBackground(new Color(176, 224, 230));
		jbtTimMaKhachHang.setBounds(36, 240, 260, 33);
		jbtTimMaKhachHang.addActionListener(action);
		add(jbtTimMaKhachHang);

		JButton jbtHienThiDuLieu = new JButton("Hiển thị dữ liệu");
		jbtHienThiDuLieu.setHorizontalAlignment(SwingConstants.LEFT);
		jbtHienThiDuLieu.setIcon(new ImageIcon(QuanLiKhachHangView.class.getResource("/Image/Upload to the Cloud.png")));
		jbtHienThiDuLieu.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtHienThiDuLieu.setBounds(582, 240, 213, 33);
		jbtHienThiDuLieu.addActionListener(action);
		add(jbtHienThiDuLieu);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 457, 838, 2);
		add(separator_1);
		
		JButton jbtTimTheoMaPhong = new JButton("Tìm theo mã phòng");
		jbtTimTheoMaPhong.setIcon(new ImageIcon(QuanLiKhachHangView.class.getResource("/Image/icons8-search-32.png")));
		jbtTimTheoMaPhong.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtTimTheoMaPhong.setBounds(322, 240, 236, 33);
		jbtTimTheoMaPhong.addActionListener(action);
		add(jbtTimTheoMaPhong);
		
		setVisible(true);

	}

	public void xoaForm() {
		textFieldMaKhachThue.setText("");
		textFieldMaPhong.setText("");
		textFieldHoTen.setText("");
		textFieldSoCanCuoc.setText("");
		textFieldSoDienThoai.setText("");
		jdcNgaySinh.setDate(null);
	}

	// thêm khách hàng vào table
	public void themKhachHangVaoTable(KhachHang kh) {
		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachKhachThue.getModel();
		model_table.addRow(new Object[] { kh.getMaKH(), kh.getMaPhong(), kh.getHoTen(), kh.getCCCD(), kh.getSDT(),
				kh.getNgaySinh() });
	}

	// Cập nhật khách hàng vào table
	public void capNhatKhachHangVaoTable(KhachHang kh) {
		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachKhachThue.getModel();

		// Kiểm tra xem khách hàng có tồn tại trong bảng hay không
		int soLuongDong = model_table.getRowCount();
		for (int i = 0; i < soLuongDong; i++) {
			String id = model_table.getValueAt(i, 0) + "";
			if (id.equals(kh.getMaKH())) {
				// Cập nhật thông tin của khách hàng trong bảng
				model_table.setValueAt(kh.getMaKH() + "", i, 0);
				model_table.setValueAt(kh.getMaPhong() + "", i, 1);
				model_table.setValueAt(kh.getHoTen() + "", i, 2);
				model_table.setValueAt(kh.getCCCD()+"", i, 3);
				model_table.setValueAt(kh.getSDT()+"", i, 4);
				model_table.setValueAt(kh.getNgaySinh(), i, 5);
				break;
			}
		}
	}

	// get Khách hàng đang chọn trong table
	public KhachHang getKhachHangDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachKhachThue.getModel();
		int i_row = tableDanhSachKhachThue.getSelectedRow();
		String maKhachHang = model_table.getValueAt(i_row, 0) + "";
		String maPhong = model_table.getValueAt(i_row, 1) + "";
		String hoTen = model_table.getValueAt(i_row, 2) + "";
		String soCanCuoc =model_table.getValueAt(i_row, 3) + "";
		String soDT = model_table.getValueAt(i_row, 4) + "";
	    java.util.Date ngaySinh =   (java.util.Date) model_table.getValueAt(i_row, 5);
		KhachHang kh = new KhachHang(maKhachHang, hoTen, soDT, soCanCuoc, ngaySinh, maPhong);
		return kh;
	}

	// hiển thị thông tin kh lên trên textFild
	public void hienThiThongTinKhachHangDaChon() {
		KhachHang kh = getKhachHangDangChon();
		this.textFieldMaKhachThue.setText(kh.getMaKH() + "");
		this.textFieldMaPhong.setText(kh.getMaPhong() + "");
		this.textFieldHoTen.setText(kh.getHoTen() + "");
		this.textFieldSoCanCuoc.setText(kh.getCCCD() + "");
		this.textFieldSoDienThoai.setText(kh.getSDT() + "");
		this.jdcNgaySinh.setDate(kh.getNgaySinh());

	}

	// hiển thị dl database
	public void hienThiDuLieu() {		
    		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachKhachThue.getModel();
			model_table.setRowCount(0);
    	for(KhachHang kh :  KhachHangSQL.getAllKhachHangSQL()) {
    		this.themKhachHangVaoTable(kh);
    	}
	}

	// Xóa Khách Hàng----------------------------------------
	public void xoaKhachHangDuocChon() {
		int selectedRow = tableDanhSachKhachThue.getSelectedRow();
		if (selectedRow != -1) {
			DefaultTableModel model = (DefaultTableModel) tableDanhSachKhachThue.getModel();
			String maKH = (String) model.getValueAt(selectedRow, 0);

			int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa kh khách hàng này?");
			if (luaChon == JOptionPane.YES_OPTION) {
				KhachHangSQL khachHangSQL = new KhachHangSQL();
				khachHangSQL.xoaKhachHangTheoMaSQL(maKH);
				model.removeRow(selectedRow);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.");
		}
	}

	// Tìm Khách hàng theo mã
	public void timKhachHangTheoMaKhachHang() {
		String maKhachHangTK = JOptionPane.showInputDialog(null,"Nhập mã khách hàng");
		if (!maKhachHangTK.isEmpty()) {

			KhachHang kh=KhachHangSQL.getKhachHangTheoMaKH(maKhachHangTK);
			if (kh!=null) {
				// Xóa dữ liệu cũ trong bảng
				DefaultTableModel model = (DefaultTableModel) tableDanhSachKhachThue.getModel();
				model.setRowCount(0);
				// Thêm dữ liệu mới từ kết quả tìm kiếm
				model.addRow(new Object[] { kh.getMaKH(), kh.getMaPhong(), kh.getHoTen(), kh.getCCCD(), kh.getSDT(), kh.getNgaySinh() });
			}
			 else {
				JOptionPane.showMessageDialog(this, "Không tìm thấy Khách Hàng có mã " + maKhachHangTK);
			 }
		}
		else {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập mã khách hàng để tìm kiếm.");
		}
	}
	
	public void timKhachHangTheoMaPhong() {
		String maPhongTK = JOptionPane.showInputDialog(null,"Nhập mã phòng");
		if (!maPhongTK.isEmpty()) {
			List<KhachHang> dsKhachHang=KhachHangSQL.getAllKhachHangTheoMaPhong(maPhongTK);
			if (dsKhachHang.size()>0) {
				// Xóa dữ liệu cũ trong bảng
				DefaultTableModel model = (DefaultTableModel) tableDanhSachKhachThue.getModel();
				model.setRowCount(0);
				for(KhachHang kh : dsKhachHang)
				  model.addRow(new Object[] { kh.getMaKH(), kh.getMaPhong(), kh.getHoTen(), kh.getCCCD(), kh.getSDT(), kh.getNgaySinh() });
			}
			 else {
				JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng có mã phòng" + maPhongTK);
			 }
		}
		else {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập mã phòng để tìm kiếm.");
		}
    }
	// Cập nhật Khách hàng 
	public void thucHienCapNhatKhachHang() {
	    String maPhong = textFieldMaPhong.getText();

	    // Kiểm tra xem mã phòng có tồn tại trong cơ sở dữ liệu hay không
	    if (!PhongSQL.kiemTraTonTaiMaPhong(maPhong)) {
	        JOptionPane.showMessageDialog(this, "Mã phòng không tồn tại trong cơ sở dữ liệu. Vui lòng nhập lại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
	        return;
	    }

	    try {
	        String maKhachThue = textFieldMaKhachThue.getText();
	        maPhong = textFieldMaPhong.getText();
	        String hoTen = textFieldHoTen.getText();
	        String soCanCuoc = textFieldSoCanCuoc.getText();
	        String soDT = textFieldSoDienThoai.getText();
	        java.util.Date ngaySinh =  jdcNgaySinh.getDate();
	        KhachHang kh = new KhachHang(maKhachThue, hoTen, soDT, soCanCuoc, ngaySinh, maPhong);

	        // Kiểm tra xem khách hàng đã tồn tại trong cơ sở dữ liệu hay chưa
	        if (KhachHangSQL.kiemTraTonTaiKhachHang(maKhachThue)) {
	            // Nếu tồn tại, cập nhật thông tin khách hàng trong cơ sở dữ liệu
	            KhachHangSQL.capNhatKhachHangSQL(kh);
	            capNhatKhachHangVaoTable(kh);
	        } else {
	            // Nếu không tồn tại, thêm khách hàng mới vào cơ sở dữ liệu
	            KhachHangSQL.insertKhachHang(kh);
	            themKhachHangVaoTable(kh);
	        }
	        JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi cập nhật khách hàng:\n" + e.getMessage(),"lỗi", JOptionPane.ERROR_MESSAGE);
	        System.out.print(e.getMessage());
	    }
	}

}