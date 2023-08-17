package data_access_object;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {
	
	public static SachDAO getInstance() {
		return new SachDAO();
	}
	
	@Override
	public int insert(Sach t) {
		int ketQua=0;
		try {
			//B1: Tạo kết nối
			Connection c = JDBCUtil.getConnection();
			
			//B2: tạo ra đối tượng statement
			Statement st = c.createStatement();
			
			//B3: thực thi câu lệnh sql
			String sql= "INSERT INTO sach (id, tenSach, giaBan, namXuatBan) "+
						"VALUES ('"+t.getId()+"', '"+t.getTenSach()+"', "+t.getGiaBan()+", "
						+t.getNamXuatBan()+")";
			
			ketQua = st.executeUpdate(sql);
			
			//B4: xử lý kết quả
			System.out.println("Bạn đã thực thi: "+sql);
			System.out.println("Có "+ketQua+" dòng thay đổi!");
			
			//B5: ngắt kết nối
			JDBCUtil.closeConnection(c);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int update(Sach t) {
		int ketQua=0;
		try {
			//B1: Tạo kết nối
			Connection c = JDBCUtil.getConnection();
			
			//B2: tạo ra đối tượng statement
			Statement st = c.createStatement();
			
			//B3: thực thi câu lệnh sql
			String sql= "UPDATE sach "+
						"SET "+
						"tenSach ='"+t.getTenSach()+
						"', giaBan ="+t.getGiaBan()+
						", namXuatBan ="+t.getNamXuatBan()+
						" WHERE id='"+t.getId()+"'";
			System.out.println(sql);
			ketQua = st.executeUpdate(sql);
			
			//B4: xử lý kết quả
			System.out.println("Bạn đã thực thi: "+sql);
			System.out.println("Có "+ketQua+" dòng thay đổi!");
			
			//B5: ngắt kết nối
			JDBCUtil.closeConnection(c);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int delete(Sach t) {
		int ketQua=0;
		
		try {
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			String sql ="DELETE FROM sach WHERE id= '"+t.getId()+"'";
			
			System.out.println(sql);
			ketQua =st.executeUpdate(sql);
			
			System.out.println("Bạn đã thực thi: "+sql);
			System.out.println("Có "+ketQua+" dòng thay đổi");
			
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		ArrayList<Sach> ketQua = new ArrayList<Sach>();
		
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			String sql="SELECT * FROM sach";
			
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id= rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan= rs.getFloat("giaBan");
				int namXuatBan= rs.getInt("namXuatBan");
				
				Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
				ketQua.add(sach);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public Sach selectById(Sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
