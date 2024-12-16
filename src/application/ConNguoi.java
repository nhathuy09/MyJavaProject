package application;

import java.io.Serializable;

public class ConNguoi implements Serializable {
	protected String hoTen;
	protected int namSinh;
	protected String gioiTinh;
	protected String soDienThoai;
	
	
	//khởi dựng lớp đầy đủ thuộc tính
	
	
	
	public ConNguoi(String hoTen, int namSinh, String gioiTinh, String soDienThoai) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
	}
	
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String toString() {
		return " tên: " +hoTen+ ","+ " năm sinh: " +namSinh+","+" giới tính: "+gioiTinh+"," +" số điện thoại: "+soDienThoai;
	}
}



