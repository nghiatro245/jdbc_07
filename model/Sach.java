package model;

public class Sach {
	private String id;
	private String tenSach;
	private float giaBan;
	private int namXuatBan;
	
	public Sach(String id) {
		this.id = id;
	}

	public Sach(String id, String tenSach, float gianBan, int namXuatBan) {
		this.id = id;
		this.tenSach = tenSach;
		this.giaBan = gianBan;
		this.namXuatBan = namXuatBan;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	
	public float getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}
	
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	@Override
	public String toString() {
		return "Sach [id=" + id + ", tenSach=" + tenSach + ", giaBan=" + giaBan + ", namXuatBan=" + namXuatBan + "]";
	}
	
	
	
}