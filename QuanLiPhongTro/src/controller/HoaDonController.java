package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.QuanLiHoaDonView;

public class HoaDonController implements ActionListener{
     public QuanLiHoaDonView qlHoaDonView;
     
     
	public HoaDonController(QuanLiHoaDonView qlHoaDonView) {
		super();
		this.qlHoaDonView = qlHoaDonView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cm=e.getActionCommand();
		if(cm.equals("Cập nhật hóa đơn"))
			qlHoaDonView.thucHienThemHoaDon();
		if(cm.equals("Xóa hóa đơn"))
			qlHoaDonView.thucHienXoa();
		if(cm.equals("Xóa form"))
			qlHoaDonView.xoaForm();
		if(cm.equals("Tìm theo mã hóa đơn"))
			qlHoaDonView.timTheoMaHoaDon();
		if(cm.equals("Tìm theo mã phòng"))
			qlHoaDonView.timTheoMaPhong();
		if(cm.equals("Hiển thị dữ liệu"))
			qlHoaDonView.hienThiDuLieu();
		
	}
}
