package application;

public class ThucTapSinh extends ConNguoi {
private String viTri;
	public ThucTapSinh(String hoTen, int namSinh, String gioiTinh,String soDienThoai,String viTri) {
		super(hoTen, namSinh, gioiTinh,soDienThoai);
		// TODO Auto-generated constructor stub
		this.viTri=viTri;
		
	}
	
	public String getViTri() {
		return viTri;
		
	}
	
	public void setViTri(String viTri) {
		this.viTri=viTri;
	}
	public String toString() {
		return "Thực tập sinh:"+" tên: " +hoTen+ ","+ " năm sinh: " +namSinh+","+" giới tính: "+gioiTinh+"," +" số điện thoại: "+soDienThoai+","+"Vị trí thực tập: "+viTri;
	}
}
