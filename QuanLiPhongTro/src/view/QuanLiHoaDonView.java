package view;

import javax.swing.JPanel;



import javax.swing.JLabel;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import Database.HoaDonSQL;

import Database.PhongSQL;
import controller.HoaDonController;
import model.HoaDon;


import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

public class QuanLiHoaDonView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField textFieldMaHoaDon;
	private JTextField textFieldMaPhong;
	private JTextField textFieldTienDien;
	private JTextField textFieldTienNuoc;
	private JTextField textFieldTienDichVu;
	private JTable tableDanhSachHoaDon; 
	private JTextField textFieldTongTien;
	private JTextField textFieldTienPhong;
	private JDateChooser jdcNgayThanhToan;
 
    public HoaDonSQL hoaDonSQL;
	public QuanLiHoaDonView() {
		
				setBackground(new Color(176, 224, 230));
				setLayout(null);
				
				hoaDonSQL=new HoaDonSQL();
				ActionListener action=new HoaDonController(this);
				
				JPanel jpnTTCN = new JPanel();
				jpnTTCN.setBackground(new Color(0, 255, 0));
				jpnTTCN.setBounds(0, 0, 848, 261);
				add(jpnTTCN);
				jpnTTCN.setLayout(null);
				
				JPanel jpnCN = new JPanel();
				jpnCN.setBackground(new Color(135, 206, 250));
				jpnCN.setBounds(540, 47, 307, 214);
				jpnTTCN.add(jpnCN);
				jpnCN.setLayout(null);
				
				JButton jbtCapNhatHoaDon = new JButton("Cập nhật hóa đơn");
				jbtCapNhatHoaDon.setIcon(new ImageIcon(QuanLiHoaDonView.class.getResource("/Image/Download from the Cloud.png")));
				jbtCapNhatHoaDon.setBackground(new Color(173, 216, 230));
				jbtCapNhatHoaDon.setForeground(new Color(0, 0, 153));
				jbtCapNhatHoaDon.setFont(new Font("Tahoma", Font.BOLD, 17));
				jbtCapNhatHoaDon.setBounds(21, 25, 253, 43);
				jbtCapNhatHoaDon.addActionListener(action);
				jpnCN.add(jbtCapNhatHoaDon);
				
				JButton jbtXoaHoaDon = new JButton("Xóa hóa đơn");
				jbtXoaHoaDon.setIcon(new ImageIcon(QuanLiHoaDonView.class.getResource("/Image/delete.png")));
				jbtXoaHoaDon.addActionListener(action); 
				jbtXoaHoaDon.setForeground(new Color(0, 0, 153));
				jbtXoaHoaDon.setFont(new Font("Tahoma", Font.BOLD, 17));
				jbtXoaHoaDon.setBackground(new Color(173, 216, 230));
				jbtXoaHoaDon.setBounds(21, 86, 253, 43);
				jpnCN.add(jbtXoaHoaDon);
				
				JButton btnXoaForm = new JButton("Xóa form");
				btnXoaForm.setIcon(new ImageIcon(QuanLiHoaDonView.class.getResource("/Image/Refresh.png")));
				btnXoaForm.setForeground(new Color(0, 0, 139));
				btnXoaForm.setBackground(new Color(175, 238, 238));
				btnXoaForm.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnXoaForm.setBounds(21, 148, 253, 43);
				btnXoaForm.addActionListener(action);
				jpnCN.add(btnXoaForm);
				
				JPanel jpnTT = new JPanel();
				jpnTT.setBounds(10, 47, 529, 214);
				jpnTTCN.add(jpnTT);
				jpnTT.setForeground(new Color(102, 204, 255));
				jpnTT.setBackground(new Color(255, 228, 181));
				jpnTT.setLayout(null);
				
				textFieldMaHoaDon = new JTextField();
				textFieldMaHoaDon.setBounds(130, 11, 111, 24);
				jpnTT.add(textFieldMaHoaDon);
				textFieldMaHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldMaHoaDon.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("Mã hóa đơn");
				lblNewLabel_1.setBounds(0, 4, 101, 38);
				jpnTT.add(lblNewLabel_1);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				JLabel lblNewLabel_3 = new JLabel("Mã phòng");
				lblNewLabel_3.setBounds(0, 52, 86, 24);
				jpnTT.add(lblNewLabel_3);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				JLabel lblNewLabel_8 = new JLabel("Ngày thanh toán");
				lblNewLabel_8.setBounds(0, 93, 127, 24); 
				jpnTT.add(lblNewLabel_8);
				lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				textFieldMaPhong = new JTextField();
				textFieldMaPhong.setBounds(130, 52, 111, 24);
				jpnTT.add(textFieldMaPhong);
				textFieldMaPhong.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldMaPhong.setColumns(10);
				
				textFieldTienNuoc = new JTextField();
				textFieldTienNuoc.setBounds(404, 52, 114, 24);
				jpnTT.add(textFieldTienNuoc);
				textFieldTienNuoc.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldTienNuoc.setColumns(10);
				
				textFieldTienDien = new JTextField();
				textFieldTienDien.setBounds(404, 10, 114, 24);
				jpnTT.add(textFieldTienDien);
				textFieldTienDien.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldTienDien.setColumns(10);
				
				textFieldTienDichVu = new JTextField();
				textFieldTienDichVu.setBounds(404, 93, 114, 24);
				jpnTT.add(textFieldTienDichVu);
				textFieldTienDichVu.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldTienDichVu.setColumns(10);
				
				JLabel lblNewLabel_7 = new JLabel("Tiền dịch vụ");
				lblNewLabel_7.setBounds(279, 93, 115, 24);
				jpnTT.add(lblNewLabel_7);
				lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				JLabel lblNewLabel_5 = new JLabel("Tiền điện");
				lblNewLabel_5.setBounds(279, 12, 101, 22);
				jpnTT.add(lblNewLabel_5);
				lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				JLabel lblNewLabel_6 = new JLabel("Tiền nước");
				lblNewLabel_6.setBounds(279, 52, 86, 24);
				jpnTT.add(lblNewLabel_6);
				lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				JLabel lblNewLabel_4 = new JLabel("Tổng tiền");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_4.setBounds(279, 131, 86, 26);
				jpnTT.add(lblNewLabel_4);
				
				textFieldTongTien = new JTextField();
				textFieldTongTien.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldTongTien.setEditable(false);
				textFieldTongTien.setBounds(404, 136, 114, 24);
				jpnTT.add(textFieldTongTien);
				textFieldTongTien.setColumns(10);
				
				JLabel lblNewLabel_9 = new JLabel("Tiền phòng");
				lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_9.setBounds(0, 131, 101, 26);
				jpnTT.add(lblNewLabel_9);
				
				textFieldTienPhong = new JTextField();
				textFieldTienPhong.setEditable(false);
				textFieldTienPhong.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldTienPhong.setBounds(130, 132, 111, 24);
				jpnTT.add(textFieldTienPhong);
				textFieldTienPhong.setColumns(10);
				
				jdcNgayThanhToan = new JDateChooser();
				jdcNgayThanhToan.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 17));
				jdcNgayThanhToan.setDateFormatString("dd/MM/yyyy");
				jdcNgayThanhToan.setBounds(130, 93, 111, 24);
				jpnTT.add(jdcNgayThanhToan);
				JLabel lblNewLabel = new JLabel("Quản lí hóa đơn");
				lblNewLabel.setBounds(288, 0, 234, 42);
				jpnTTCN.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon(QuanLiHoaDonView.class.getResource("/Image/Bill1.png")));
				lblNewLabel.setBackground(new Color(51, 0, 51));
				lblNewLabel.setForeground(new Color(153, 50, 204));
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
				tableDanhSachHoaDon=new JTable();
				tableDanhSachHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 16));
				tableDanhSachHoaDon.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"M\u00E3 H\u00F3a \u0110\u01A1n", "M\u00E3 ph\u00F2ng", "Ng\u00E0y", "Ti\u1EC1n Ph\u00F2ng", "Ti\u1EC1n \u0111i\u1EC7n", "Ti\u1EC1n n\u01B0\u1EDBc", "Ti\u1EC1n d\u1ECBch v\u1EE5", "Tổng tiền"
					}
				));
				tableDanhSachHoaDon.getColumnModel().getColumn(5).setMinWidth(14);
				hienThiDuLieu();
				tableDanhSachHoaDon.addMouseListener(new MouseAdapter() {
					
				        @Override
				        public void mouseClicked(MouseEvent e) {
				            // Lấy chỉ số của dòng được nhấp
				            int selectedRow = tableDanhSachHoaDon.getSelectedRow();
				            // Kiểm tra xem có dòng được chọn không
				            if (selectedRow != -1) {
				                // Hiển thị thông tin của dòng được chọn
				                hienThiThongTinHoaDonDangChon();
				            }
				        }
				});
				JScrollPane scrollPane = new JScrollPane(tableDanhSachHoaDon);
				scrollPane.setBounds(10, 332, 828, 138);
				add(scrollPane);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(0, 266, 848, 2);
				add(separator);
				
				JButton jbtTimTheoMaHoaDon = new JButton("Tìm theo mã hóa đơn");
				jbtTimTheoMaHoaDon.setHorizontalAlignment(SwingConstants.LEFT);
				jbtTimTheoMaHoaDon.setIcon(new ImageIcon(QuanLiHoaDonView.class.getResource("/Image/icons8-search-32.png")));
				jbtTimTheoMaHoaDon.setFont(new Font("Tahoma", Font.BOLD, 15));
				jbtTimTheoMaHoaDon.setForeground(new Color(0, 0, 139));
				jbtTimTheoMaHoaDon.setBackground(new Color(175, 238, 238));
				jbtTimTheoMaHoaDon.setBounds(33, 271, 249, 33);
				jbtTimTheoMaHoaDon.addActionListener(action);
				add(jbtTimTheoMaHoaDon);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setBounds(0, 480, 838, 2);
				add(separator_1);
				
				JButton jbtHuyTim = new JButton("Hiển thị dữ liệu");
				jbtHuyTim.setHorizontalAlignment(SwingConstants.LEFT);
				jbtHuyTim.setIcon(new ImageIcon(QuanLiHoaDonView.class.getResource("/Image/Upload to the Cloud.png")));
				jbtHuyTim.setForeground(new Color(0, 0, 139));
				jbtHuyTim.setBackground(new Color(175, 238, 238));
				jbtHuyTim.setFont(new Font("Tahoma", Font.BOLD, 16));
				jbtHuyTim.setBounds(563, 271, 243, 32);
				jbtHuyTim.addActionListener(action);
				add(jbtHuyTim);
				
				JButton jbtTimTheoMaPhong = new JButton("Tìm theo mã phòng");
				jbtTimTheoMaPhong.setBackground(new Color(175, 238, 238));
				jbtTimTheoMaPhong.setHorizontalAlignment(SwingConstants.LEFT);
				jbtTimTheoMaPhong.setIcon(new ImageIcon(QuanLiHoaDonView.class.getResource("/Image/icons8-search-32.png")));
				jbtTimTheoMaPhong.setForeground(new Color(0, 0, 128));
				jbtTimTheoMaPhong.setFont(new Font("Tahoma", Font.BOLD, 15));
				jbtTimTheoMaPhong.setBounds(303, 271, 243, 33);
				jbtTimTheoMaPhong.addActionListener(action);
				add(jbtTimTheoMaPhong);
		        setVisible(true);

	}
    

	public void xoaForm() {
		textFieldMaHoaDon.setText("");
		textFieldMaPhong.setText("");
		jdcNgayThanhToan.setDate(null);
		textFieldTienDichVu.setText("");
		textFieldTienDien.setText("");
		textFieldTienNuoc.setText("");
		textFieldTienPhong.setText("");
		textFieldTongTien.setText("");
	}
 

	public void themHoaDonVaoTable(HoaDon hd) {
		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachHoaDon.getModel();
		model_table.addRow(new Object[] {hd.getMaHoaDon(), hd.getMaPhong(), hd.getNgayThanhToan(), hd.getTienPhong(), hd.getTienDien(),
				hd.getTienNuoc(), hd.getTienDV(), hd.getTongTien()});
    }


	public void themHoacCapNhatHoaDon(HoaDon hd) {
		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachHoaDon.getModel();
		if (!HoaDonSQL.kiemTraTonTaiHoaDon(hd.getMaHoaDon())) {
			HoaDonSQL.insertHoaDon(hd);
			this.themHoaDonVaoTable(hd);
		} 
		else {
			HoaDonSQL.updateHoaDonVaoCoSoDuLieu(hd);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (id.equals(hd.getMaHoaDon())) {
					model_table.setValueAt(hd.getMaHoaDon() + "", i, 0);
					model_table.setValueAt(hd.getMaPhong()+"", i, 1);
					model_table.setValueAt(hd.getNgayThanhToan(), i, 2);
					model_table.setValueAt(hd.getTienPhong(), i, 3);
					model_table.setValueAt(hd.getTienDien(), i, 4);
					model_table.setValueAt(hd.getTienNuoc(), i, 5);
					model_table.setValueAt(hd.getTienDV(), i, 6);
					model_table.setValueAt(hd.getTongTien(), i, 7);
				}
			}
		}
	}

	public HoaDon getHoaDonDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachHoaDon.getModel();
		int i_row = tableDanhSachHoaDon.getSelectedRow();

		String maHoaDon = model_table.getValueAt(i_row, 0) + "";
		String maPhong = model_table.getValueAt(i_row, 1) + "";
		Date ngayThanhToan=(Date) model_table.getValueAt(i_row, 2);
		Float tienPhong=Float.valueOf(model_table.getValueAt(i_row, 3)+"");
		Float tienDien=Float.valueOf(model_table.getValueAt(i_row, 4)+"");
		Float tienNuoc=Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		Float tienDV=Float.valueOf(model_table.getValueAt(i_row, 6)+"");

		HoaDon hd = new HoaDon(maHoaDon, maPhong, ngayThanhToan, tienDien, tienNuoc, tienPhong, tienDV);
		return hd;
	}

	public void hienThiThongTinHoaDonDangChon() {
		HoaDon hd = getHoaDonDangChon();

		textFieldMaHoaDon.setText(hd.getMaHoaDon());
		textFieldMaPhong.setText(hd.getMaPhong());
		jdcNgayThanhToan.setDate(hd.getNgayThanhToan());
		textFieldTienDien.setText(hd.getTienDien()+"");
		textFieldTienNuoc.setText(hd.getTienNuoc()+"");
		textFieldTienDichVu.setText(hd.getTienDV()+"");
		textFieldTienPhong.setText(hd.getTienPhong()+"");
		textFieldTongTien.setText(hd.getTongTien()+"");
		
	}
	
	 
    //xoa du lieu
	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachHoaDon.getModel();
		int i_row = tableDanhSachHoaDon.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắn chắn xóa dòng đã chọn?");
		if (luaChon == JOptionPane.YES_OPTION) {
			HoaDon hd = getHoaDonDangChon();
			model_table.removeRow(i_row);
			HoaDonSQL.xoaHoaDonTheoMa(hd.getMaHoaDon());
		}
	}
 /* Lấy dữ liệu từ quá trình nhập để thêm hoac update */ 
	
	public void thucHienThemHoaDon() {
		try{
		String maHoaDon = String.valueOf(textFieldMaHoaDon.getText());
		String maPhong = String.valueOf(this.textFieldMaPhong.getText());
		if(!PhongSQL.kiemTraTonTaiMaPhong(maPhong)) {
			JOptionPane.showMessageDialog(this, "Mã phòng không tồn tại" , "Lỗi", JOptionPane.ERROR_MESSAGE);
			return;
		}
		Date ngayThanhToan= jdcNgayThanhToan.getDate();
		float tienPhong=PhongSQL.timPhongTheoMa(maPhong).getGiaPhong();
		float tienDien=Float.valueOf(textFieldTienDien.getText());
		float tienNuoc=Float.valueOf(textFieldTienNuoc.getText());
		float tienDV=Float.valueOf(textFieldTienDichVu.getText());
		
        HoaDon hd=new HoaDon(maHoaDon, maPhong, ngayThanhToan, tienDien, tienNuoc, tienPhong, tienDV);
		this.themHoacCapNhatHoaDon(hd);
		
		JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi cập nhật hóa đơn:\n" , "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}


	


	public void timTheoMaHoaDon() {
		    
			String maHD = String.valueOf(JOptionPane.showInputDialog(null, "Nhập mã hóa đơn"));
			if (!maHD.isEmpty() && maHD != null) {
				HoaDon hd=HoaDonSQL.timHoaDonTheoMaHD(maHD);
				if(hd!=null) {
					DefaultTableModel model = (DefaultTableModel) tableDanhSachHoaDon.getModel();
					model.setRowCount(0);
					themHoaDonVaoTable(hd);
				}
				 else {
					JOptionPane.showMessageDialog(this, "Không tìm thấy hóa đơn có mã " + maHD);
				 }
			}
			
     }
    

	public void timTheoMaPhong() {
			String maP = String.valueOf(JOptionPane.showInputDialog(null, "Nhập mã phòng"));
			if (!maP.isEmpty() && maP != null) {
				List<HoaDon> dsHoaDon=HoaDonSQL.timHoaDonTheoMaPhong(maP);
				if(dsHoaDon.size()>0) {
					DefaultTableModel model = (DefaultTableModel) tableDanhSachHoaDon.getModel();
					model.setRowCount(0);
					for(HoaDon hd : dsHoaDon)
					themHoaDonVaoTable(hd);
				}
				 else {
					JOptionPane.showMessageDialog(this, "Không tìm thấy hóa đơn của mã phòng " + maP);
				 }
			}	
     }
    
	public void hienThiDuLieu() {
		DefaultTableModel model_table = (DefaultTableModel) tableDanhSachHoaDon.getModel();
		model_table.setRowCount(0);	
		for (HoaDon hd : HoaDonSQL.getAllHoaDon()) 
			this.themHoaDonVaoTable(hd);
	}
}
