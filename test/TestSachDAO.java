package test;

import java.util.ArrayList;
import java.util.Iterator;

import data_access_object.SachDAO;
import model.Sach;

public class TestSachDAO {
	public static void main(String[] args) {
		/*
		 * Sach sach1 = new Sach("LTJV", "Lập trình JV", 70000, 2000);
		Sach sach2 = new Sach("LTC", "Lập trình C", 50000, 1998);
		
		SachDAO.getInstance().insert(sach2);
		*/
		
		/* for (int i = 1; i < 20; i++) {
			Sach sach= new Sach("LT"+i, "Lập trình i "+i, 20000, 1998);
			SachDAO.getInstance().insert(sach);
		} */
		
		//Test Insert
		
//		Sach sach1 = new Sach("LTC", "Lập trình C", 100000, 2000);
//		SachDAO.getInstance().update(sach1);
		
//		for (int i = 1; i < 20; i++) {
//			Sach sach= new Sach("LT"+i); //, "Lập trình i "+i, 20000, 1998);
//			SachDAO.getInstance().delete(sach);
//		}
		
		ArrayList<Sach> list = SachDAO.getInstance().selectAll();
		
		for (Sach sach : list) {
			System.out.println(sach.toString());
		}
		
		
	}
}
