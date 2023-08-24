package test;

import java.util.ArrayList;

import data_access_object.KhachHangDAO;
import model.KhachHang;

public class TestKhachHangDAO {
	public static void main(String[] args) {
		KhachHangDAO khachHangDAO = new KhachHangDAO();
		
//		KhachHang kh1 = new KhachHang(1, "kngan", "1998-07-17", "dauMK");
//		khachHangDAO.insert(kh1);
//		
//		KhachHang kh2 = new KhachHang(3, "nasu", "1998-07-17", "CP");
//		khachHangDAO.update(kh2);
		
//		KhachHang kh3 = new KhachHang(3, "nasu", "1998-07-17", "CP");
//		khachHangDAO.delete(kh3);
		
//		ArrayList<KhachHang> list = khachHangDAO.selectAll();
//		for (KhachHang khachHang : list) {
//			System.out.println(khachHang.toString());
//		}
		
		KhachHang find = new KhachHang();
		find.setId(1);
		KhachHang khachHangResult = khachHangDAO.selectById(find);
		System.out.println(khachHangResult);
		
		ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		list = khachHangDAO.selectByCondition("diaChi LIKE '%MK%'");
		for (KhachHang khachHang : list) {
			System.out.println(khachHang);
		}
		
	}
}
