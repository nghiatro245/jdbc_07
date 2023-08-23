package data_access_object;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;

public class KhachHangDAO implements DAO_Interface<KhachHang> {

	@Override
	public void insert(KhachHang t) {
		int ketQua;
		try {
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO khachhang VALUES ("+t.getId()+", '"+t.getHoVaTen()+"', '"+t.getNgaySinh()+"', '"+
						t.getDiaChi()+"');";
			System.out.println("Ban da thuc thi "+sql);
			ketQua = st.executeUpdate(sql);
			System.out.println("Co "+ketQua+" dong thay doi");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(KhachHang t) {
		int ketQua;
		try {
			Connection con = JDBCUtil.getConnection();
			Statement st= con.createStatement();
			String sql = "UPDATE khachhang SET hoVaTen ='"+t.getHoVaTen()+"', ngaySinh='"+t.getNgaySinh()+ 
						"', diaChi='"+t.getDiaChi()+"' WHERE id="+t.getId()+";";
			System.out.println("Ban da thuc thi "+sql);
			ketQua = st.executeUpdate(sql);
			System.out.println("Co "+ ketQua +" dong thay doi");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(KhachHang t) {
		int ketQua;
		try {
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql ="DELETE FROM khachhang WHERE id="+t.getId();
			System.out.println("Ban da thuc thi "+sql);
			ketQua = st.executeUpdate(sql);
			System.out.println("Co "+ketQua+" dong thay doi");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		try {
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql ="SELECT * FROM khachhang";
			System.out.println("Ban da thuc thi "+sql);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String hoVaTen = rs.getString("hoVaTen");
				Date ngaySinh = rs.getDate("ngaySinh");
				String diaChi = rs.getString("diaChi");
				KhachHang khach = new KhachHang(id, hoVaTen, hoVaTen, diaChi);
				list.add(khach);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}



}
