package test;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.mysql.cj.xdevapi.PreparableStatement;

import data_access_object.SachDAO;
import model.KhachHang;
import model.Sach;

public class TestSachDAO {
	public static void main(String[] args) {
		SachDAO sachDAO = new SachDAO();
		
		/* Sach sach1 = new Sach("LTC+", "Lap trinh C+", 50000, 1998);
		SachDAO sachDAO = new SachDAO();
		sachDAO.insert(sach1);
		*/
		
//		for (int i = 1; i < 10; i++) {
//			Sach sach = new Sach("LT"+i, "Lap trinh "+i, 60000, 2000);
//			sachDAO.insert(sach);
//		}
		
		
		Sach sach2 = new Sach("LTJV", "Lap trinh JaVa", 150000, 2001);
//		sachDAO.update(sach2);
		
//		for (int i = 1; i < 9; i++) {
//			Sach sach = new Sach("LT"+i, "Lap trinh "+i, 60000, 2000);
//			sachDAO.delete(sach);
//		}
		
//		ArrayList<Sach> list = sachDAO.selectAll();
//		System.out.println(list);
//		
//		for (Sach sach : list) {
//			System.out.println(sach.toString());
//		}
		Sach find = new Sach();
		find.setId("LTC");
		Sach ketQua = sachDAO.selectById(find);
		System.out.println(ketQua);
		
	}
}
