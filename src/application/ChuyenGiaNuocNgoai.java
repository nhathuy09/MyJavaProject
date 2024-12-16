package application;

public class ChuyenGiaNuocNgoai extends ConNguoi {
private String visa;

private String chuyenNganh;
private String quocTich;

	public ChuyenGiaNuocNgoai(String hoTen, int namSinh, String gioiTinh,String soDienThoai,String quocTich,String chuyenNganh,String visa) {
		super(hoTen, namSinh, gioiTinh,soDienThoai);
		// TODO Auto-generated constructor stub
		this.visa=visa;
		this.chuyenNganh=chuyenNganh;
		this.quocTich=quocTich;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh=chuyenNganh;
		
	}
	
	public String getVisa() {
		return visa;
		
	}
	public void setVisa(String visa) {
		this.visa=visa;
		
	}
	
	public String getQuocTich() {
		return quocTich;
		
	}
	public void setQuocTich(String quocTich) {
		this.quocTich=quocTich;
	}
	public String toString() {
		return "Chuyên gia nước ngoài:"+" tên: " +hoTen+ ","+ " năm sinh: " +namSinh+","+" giới tính: "+gioiTinh+"," +" số điện thoại: "+soDienThoai+","+" Ngày hết hạn visa: "+visa+","+" Quốc tịch: "+quocTich+","+" Chuyên Ngành: "+chuyenNganh;
	}

}
