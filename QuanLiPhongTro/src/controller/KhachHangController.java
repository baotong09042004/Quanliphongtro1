package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.QuanLiKhachHangView;


public class KhachHangController implements ActionListener {
       public QuanLiKhachHangView viewQLKhachHang;
       
       public KhachHangController(QuanLiKhachHangView viewQuanLiKhachHang){
    	   this.viewQLKhachHang=viewQuanLiKhachHang;
       }
      
			@Override
	   public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cm=e.getActionCommand();
				if(cm.equals("Cập nhật khách thuê")) {
					viewQLKhachHang.thucHienCapNhatKhachHang();
				}
				if(cm.equals("Xóa khách thuê"))
					viewQLKhachHang.xoaKhachHangDuocChon();;
				if(cm.equals("Tìm theo mã khách hàng"))
					viewQLKhachHang.timKhachHangTheoMaKhachHang();
				if(cm.equals("Tìm theo mã phòng"))
					viewQLKhachHang.timKhachHangTheoMaPhong();
				if(cm.equals("Hiển thị dữ liệu"))
					viewQLKhachHang.hienThiDuLieu();
				if(cm.equals("Xóa form"))
					viewQLKhachHang.xoaForm();
			}
            
}
