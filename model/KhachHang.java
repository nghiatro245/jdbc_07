package model;

public class KhachHang {
	private int id;
	private String hoVaTen;
	private String ngaySinh;
	private String diaChi;
	
	public KhachHang() {
	}

	public KhachHang(int id, String hoVaTen, String ngaySinh, String diaChi) {
		this.id = id;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "KhachHang [id=" + id + ", hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
	}
	
	
	
	
}
