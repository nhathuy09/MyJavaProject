package application;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GhiVaoTapTin {
	private String tenTapTin;
	private ArrayList<ConNguoi> danhSachConNguoi;
	
	//khởi tạo phương thức
	public GhiVaoTapTin(String tenTapTin, ArrayList<ConNguoi> danhSachConNguoi) {
		
		this.tenTapTin = tenTapTin;
		this.danhSachConNguoi = danhSachConNguoi;
	}
	// tạo một phương thức ghi danh sách con người 
	public boolean ghiDsConNguoi() {
		try {
			// mở tập tin với tên được lưu trong tenTapTin-- flase: ghi dè lên tập tin nếu tệp đã tồn tại
			
			FileOutputStream f=new FileOutputStream(tenTapTin ,false);
			// ghi các đối tượng vào FileOutputStream
			ObjectOutputStream o=new ObjectOutputStream(f);
			//ghi danhSachConNGuoi vào tệp tin
			o.writeObject(danhSachConNguoi);
			//đóng các luồng để giải phóng tài nguyên 
			o.close();
			f.close();
		// trả về true nếu ghi thành công
			return true;
			// xử lí lỗi và trả về false 
		} catch (Exception e) {
			System.out.println("có lỗi xảy ra.Mã lỗi[01]"+e.getStackTrace());
			return false;
		}
	}
}
