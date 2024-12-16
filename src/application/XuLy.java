package application;

import java.util.ArrayList;

public class XuLy {
	
	public ArrayList<ConNguoi> danhSachConNguoi;
	private String tenTapTin;
	//khởi dựng
	public XuLy(String tenTapTin) {
		
		this.tenTapTin = tenTapTin;
		DocTapTin doc=new DocTapTin(tenTapTin);
		danhSachConNguoi=doc.docDsConNguoi();
		if(danhSachConNguoi==null) {
			danhSachConNguoi=new ArrayList<ConNguoi>();
		}
	}
	
	//thêm nhân sự
	public boolean themMoiNhanSu(ConNguoi cn) {
		danhSachConNguoi.add(cn);
		GhiVaoTapTin ghi=new GhiVaoTapTin(tenTapTin, danhSachConNguoi);
		return ghi.ghiDsConNguoi();
	}
	
	//liệt kê thông tin toàn bộ nhân sự
	
	  public ArrayList<ConNguoi> lietKeThongTinNhanSu() {
		
	    	//sử dùng điều kiện 
	    	// khi số lượng của danhSachNhanSu = 0 thực hiện lệnh IF
	    	if(danhSachConNguoi.size()==0)
	    		danhSachConNguoi.isEmpty();
	    	
	    		//dùng vòng lặp chạy hết các phần tử có trong mảng danhSachNhanSu
	    	
	    	return danhSachConNguoi;
	    }
	  
	 //liệt kê thông tin nhan sự theo danh sách
	    
	 public ArrayList<ConNguoi> lietkeThongTinNhanSu(ArrayList<ConNguoi> danhSach) {
			 if(danhSach.size()==0) {
				 System.out.println("không có nhân viên nào ");
				 
			 }
			 else
				 for(ConNguoi cn:danhSach)
					 System.out.println(cn.toString());
			 return danhSachConNguoi;
		 }
	 
	 //Liệt kê nhân sự theo giới tính
	 public ArrayList<ConNguoi> lietKeNhanSuTheoGioiTinh(String gioiTinh) {
		 ArrayList<ConNguoi>nhanSu=new ArrayList<>();
		 
		 if(danhSachConNguoi.size()==0) 
			 danhSachConNguoi.isEmpty();
		 else
			 for(ConNguoi cn: danhSachConNguoi)
				 if(cn.getGioiTinh().equalsIgnoreCase(gioiTinh))
					 nhanSu.add(cn);
		 return nhanSu;
				 
				 
		 
	 }
	 
	 
	 //liệt kê theo năm sinh , 1: tăng dân,0:giảm dần
	 
	 public ArrayList<ConNguoi> lietKeNhanSuTheoNamSinh(int tangDanTheoNamSinh) {
		
		//tăng dần
		 if(tangDanTheoNamSinh==1) {
			 danhSachConNguoi.sort((cn1,cn2)-> cn1.namSinh-cn2.namSinh);
			 
		 }
		 //giảm dần
		 else if(tangDanTheoNamSinh == 0){
			 danhSachConNguoi.sort((cn1,cn2)->cn2.namSinh-cn1.namSinh);
		 }
		 //hiển thị ra màn hình danh sách nhân sự 
	
		return danhSachConNguoi;
	 }
	 
		 
	 //tìm kiếm thông tin nhân sự theo tên
	 public ArrayList<ConNguoi> timKiemTheoHoTen(String ten){
		 //khởi tạo danh sách mới để lưu các giá trị tìm được
		 ArrayList<ConNguoi> ketQua=new ArrayList<>();
		 for(ConNguoi cn: danhSachConNguoi)
			 if(cn.getHoTen().equalsIgnoreCase(ten))
				 ketQua.add(cn);
			 
		 
		 return ketQua;
	 }
	 
	//TÌM KIẾM THÔNG TIN NHÂN SỰ THEO SỐ ĐIỆN THOẠI KẾT QUẢ TRẢ VỀ LÀ ARRAYLIST CHỨA NHÂN SỰ
	 public ArrayList<ConNguoi>timKiemTheoSDT(String soDienThoai){
		 ArrayList<ConNguoi> ketQua=new ArrayList<>();
		 for(ConNguoi cn:danhSachConNguoi)
			 if(cn.getSoDienThoai().equals(soDienThoai))
				 ketQua.add(cn);
		 return ketQua;
	 }
	 
	 

		//xóa hồ sơ nhân sự theo số điện thoại 
		 public boolean xoaHoSoNhanSuTheoSoDienThoai(String soDienThoai) {
			 boolean ketQuaXoa= false;
			 for(ConNguoi cn:danhSachConNguoi)
				 if(cn.getSoDienThoai().equals(soDienThoai)) {
					 danhSachConNguoi.remove(cn);
					 GhiVaoTapTin ghi=new GhiVaoTapTin(tenTapTin, danhSachConNguoi);
					 ketQuaXoa=ghi.ghiDsConNguoi();
					 break;
				 }
			 return ketQuaXoa;
			 
			 
		 }
		 
		
		 // xóa nhân sự theo tên 
		 public boolean xoaNhanSuTheoTen(String ten) {
			 boolean ketQuaXoa=false;
			 for(ConNguoi cn:danhSachConNguoi)
				 if(cn.getHoTen().equalsIgnoreCase(ten)){
					 danhSachConNguoi.remove(cn);
					 GhiVaoTapTin ghi=new GhiVaoTapTin(tenTapTin,danhSachConNguoi);
					 ketQuaXoa=ghi.ghiDsConNguoi();
					 break;
					 
				 }
			 return ketQuaXoa;
				 
				 
			 
		 }
		 
		 
		 
		 //sửa thông tin nhân sự 
		 	public boolean suaThongTinNhanSu(String soDienThoai,String tenMoi,String gioiTinhMoi,int namSinhMoi) {
		 		for(ConNguoi cn:danhSachConNguoi) {
		 			if(cn.getSoDienThoai().equals(soDienThoai)) {
		 				cn.setHoTen(tenMoi);
		 				cn.setNamSinh(namSinhMoi);
		 				cn.setGioiTinh(gioiTinhMoi);
		 				GhiVaoTapTin ghi=new GhiVaoTapTin(tenTapTin, danhSachConNguoi);
		 				return ghi.ghiDsConNguoi();
		 			}
		 			
		 			
		 		}
		 		return false;//không sửa thành công 
		 	}
	 
	
}
