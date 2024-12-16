package application;


public class KySu  extends ConNguoi{
	private static final long serialVersionUID =2L;
	private String chuyenNganh;
	//khởi dựng lớp
	public KySu(String hoTen, int namSinh, String gioiTinh, String soDienThoai, String chuyenNganh) {
		super(hoTen, namSinh, gioiTinh, soDienThoai);
		this.chuyenNganh = chuyenNganh;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	

	public String toString() {
		return "kỹ sư:" +super.toString()+","+ " chuyên ngành: "+chuyenNganh;
		
	}
	

	

}
